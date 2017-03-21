package com.proteus.cgen.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Data;
import lombok.Getter;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.proteus.cgen.utils.CgenUtils;
import com.proteus.common.util.FileUtils;
import com.proteus.common.util.Utils;
import com.proteus.preprocess.InvalidOptionException;
import com.proteus.preprocess.pp.ext.Macro;
import com.proteus.preprocess.pp.ext.MacroKey;
@Data
public class CommandLineParser implements ICommandLineParser{
	private static final Logger L = LoggerFactory.getLogger(CommandLineParser.class);
	@Parameter()
	private List<String> parameters;

	@Parameter(names = {"-o","-output"}, description="Output file name", converter=FileNameConverter.class,required=true)
	File outputFile;

	public File getOutputDir(){
		if(outputFile.isDirectory()){
			return outputFile;
		} else 
			if(outputFile.getParentFile()==null)
				return new File(".");
		return outputFile.getParentFile();
	} 

	@Parameter(names = {"-F","-includeFile"}, description = "include file")
	private List<String> FOptionFiles;

	@Parameter(names = {"-y","-searchPath"}, description = "source search path")
	@Getter
	private List<String> yOptionFiles;

	@Parameter(names = {"-f","-libPath"}, description = "lib search path")
	private List<String> fOptionFiles;

	private File designFile;

	@Getter
	public static List<File> inputFilesInOrder = new ArrayList<File>();

	@Parameter(names = "-help",help=true,description="Produces this Output")
	private boolean help; 

	public List<String> getExtensions(){
		return Utils.arrList(".v",".sv");
	}

	public static class FileNameConverter implements IStringConverter<File>{
		@Override
		public File convert(String value) {
			return new File(value);
		}

	}

	public final Integer MAX_FILES_COUNT =1000;
	@Getter
	private Path sourceFile;
	private Path basePath;
	private List<CommandLineParser> children;
	private static Map<String,Path> includedVFilesMap = new HashMap<String,Path>();
	private static Map<String,Path> includedSVFilesMap = new HashMap<String,Path>();
	private static Map<String,String> macroMap = new HashMap<String,String>();
	private static Map<String,Path> FOptionFilesMap =  new HashMap<String,Path>();
	private static Map<String,Path> yOptionFilesMap =  new HashMap<String,Path>();
	private static Map<String,Path> fOptionFilesMap = new HashMap<String,Path>();

	private boolean CompletedprocessingAllFOptionFiles;

	public CommandLineParser(String path) throws InvalidOptionException{
		children = new ArrayList<CommandLineParser>();
		sourceFile = FileSystems.getDefault().getPath(path).normalize();
		if ( !sourceFile.toFile().exists()){
			throw new InvalidOptionException(basePath.toString());
		}
		if ( sourceFile.toFile().isDirectory() ){
			basePath = sourceFile;
			sourceFile = null;
		}
		else{
			basePath = sourceFile.getParent();
		}
		parameters = new ArrayList<String>();
		FOptionFiles = new ArrayList<String>();
		yOptionFiles = new ArrayList<String>();
		fOptionFiles = new ArrayList<String>();

	}


	private Path getNormalizedPath(String path){
		return basePath.resolve(path).normalize();
	}

	private String[] Stringify(File file) throws FileNotFoundException,InvalidOptionException
	{
		if ( file.exists() && file.isFile())
		{
			String content = FileUtils.ReadFromFile( new FileInputStream(file));
			return content.split("\\s");
		}
		else
		{
			throw new InvalidOptionException(file.getAbsolutePath());
		}
	}

	private boolean isVFile(Path normalizedPath) throws InvalidOptionException
	{
		if (normalizedPath.toFile().exists() )
		{
			return normalizedPath.toFile().isFile() && FileUtils.getExtension(normalizedPath.toString()).toLowerCase().equals("v");
		}
		else{
			throw new InvalidOptionException("File not found\t"+normalizedPath.toString());
		}
	}

	private boolean isSVFile(Path normalizedPath)
	{
		if (normalizedPath.toFile().exists() )
		{
			return normalizedPath.toFile().isFile() && FileUtils.getExtension(normalizedPath.toString()).toLowerCase().equals("sv");
		}
		else{
			throw new InvalidOptionException("File not found\t"+normalizedPath.toString());
		}
	}


	private void processParametersForIncludedFiles()
	{
		List<String> removedEntries = new ArrayList<String>();
		for(String param: parameters)
		{
			Path normalizedPath = getNormalizedPath(param);
			inputFilesInOrder.add(normalizedPath.toFile());
			if (isVFile(normalizedPath))
			{
				removedEntries.add(param);
				includedVFilesMap.put(normalizedPath.toString(), normalizedPath);
			}
			else if ( isSVFile(normalizedPath))
			{
				removedEntries.add(param);
				includedSVFilesMap.put(normalizedPath.toString(), normalizedPath);
			}
		}
		for(String param: removedEntries)
		{
			parameters.remove(param);
		}
	}

	private void processIncludeFiles() throws FileNotFoundException
	{
		if ( ! CompletedprocessingAllFOptionFiles )
		{
			processMacroDefinitions();
			processParametersForIncludedFiles();
			processFOptionFiles(new HashMap<String,Path>());
			CompletedprocessingAllFOptionFiles = true;
		}
	}

	@SuppressWarnings("unused")
	private void processFOptionFiles(Map<String,Path> processedFiles) throws FileNotFoundException,InvalidOptionException{
		if ( FOptionFiles.size() > 0 )
		{
			for(String file : FOptionFiles)
			{
				Path normalizedPath = getNormalizedPath(file);
				if ( normalizedPath.toFile().exists() && !processedFiles.containsKey(normalizedPath.toString()) )
				{
					CommandLineParser localCLP = new CommandLineParser(normalizedPath.toString());
					List<String> args = new ArrayList<String>();
					args.add("-o"); args.add(getOutputFile().getAbsolutePath());
					args.addAll(Arrays.asList(Stringify(normalizedPath.toFile())));
					JCommander jCommander = new JCommander(localCLP, args.toArray(new String[1]));
					processedFiles.put(normalizedPath.toString(), normalizedPath);
					localCLP.processFOptionFiles(processedFiles);
					localCLP.processParametersForIncludedFiles();
					localCLP.CompletedprocessingAllFOptionFiles = true;
				}

			}
		}

	}

	private void processMacroDefinitions(){
		List<String> params = new ArrayList<String>();
		for(String param : parameters)
		{
			if(param.startsWith("+"))
			{
				String[] keyValue = null;
				if ( param.startsWith("+define+")){
					keyValue  = param.substring("+define+".length(), param.length()).split("=");
				}
				else
				{
					keyValue  = param.substring(1, param.length()).split("=");
				}

				macroMap.put(keyValue[0],keyValue[1]);
				params.add(param);
			}
		}
		for( String param : params)
		{
			parameters.remove(param);
		}
	}


	public HashMap<MacroKey,Macro> getMacroDefinitions()
	{
		HashMap<MacroKey,Macro> tempMacroMap = new HashMap<MacroKey, Macro>();
		for(String macroid : macroMap.keySet()){
			Macro macro = new Macro();
			MacroKey macrokey = new MacroKey();
			macrokey.setMacroName(macroid);
			macrokey.setNoOfParameters(null);
			macro.setMacroName(macroid);
			macro.setListOfParameters(null);
			macro.setMacroKey(macrokey);
			macro.setMacroDef(macroMap.get(macroid));
			tempMacroMap.put(macrokey, macro);
		}
		return tempMacroMap;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("parameters=\n");
		for(String param:parameters)
		{
			sb.append("\t"+param+"\n");
		}
		sb.append("includeFileList=\n");
		for(String file:FOptionFiles)
		{
			sb.append("\t"+file+"\n");
		}
		sb.append(includedVFilesMap + "\n");
		sb.append(FOptionFilesMap + "\n");
		sb.append("searchPathList=\n");
		for(String file:yOptionFiles)
		{
			sb.append("\t"+file+"\n");
		}
		sb.append(yOptionFilesMap+"\n");
		sb.append("libPathList=\n");
		for(String file:fOptionFiles)
		{
			sb.append("\t"+file+"\n");
		}
		sb.append(fOptionFilesMap+"\n");
		return sb.toString();

	}

	public static void main(String[] args) {


		Path basePath = FileSystems.getDefault().getPath("/");

		CommandLineParser clp = new CommandLineParser(new File("./").getAbsolutePath());
		try{
			System.out.println(System.setProperty(JCommander.DEBUG_PROPERTY,"debug"));
			//		JCommander jCommander = new JCommander(clp, args);
			JCommander jCommander = new JCommander(clp);
			jCommander.parse(args);
			System.out.println("Command="+jCommander.getParsedCommand());

		}
		catch(ParameterException ex)
		{
			System.out.println(ex.getMessage());
		}
		System.out.println(clp);
		try {
			clp.processIncludeFiles();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(clp);
	}


	@Override
	public List<Path> getIncludedFiles() {
		ArrayList<Path> includedFiles = new ArrayList<Path>();
		for(Entry<String,Path> entry:includedVFilesMap.entrySet())
		{
			includedFiles.add(entry.getValue());
		}
		for(Entry<String,Path> entry:includedSVFilesMap.entrySet())
		{
			includedFiles.add(entry.getValue());
		}
		return includedFiles;
	}

	@Override
	public List<Path> getFOptionFiles()
	{
		ArrayList<Path> FOptionFiles = new ArrayList<Path>();
		for(Entry<String,Path> entry: FOptionFilesMap.entrySet())
		{
			FOptionFiles.add(entry.getValue());
		}
		return FOptionFiles;
	}


	@Override
	public void processArgs() throws FileNotFoundException {
		processIncludeFiles();
	}

}
