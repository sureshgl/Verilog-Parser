package com.proteus.cgen.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.proteus.common.util.FileUtils;
import com.proteus.common.util.Utils;
import com.proteus.cgen.pragma.FunctionalitySplitting;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.pragma.GenvarLoopLength;
import com.proteus.cgen.pragma.IFunctionalitySplitApp;
import com.proteus.cgen.pragma.ModuleInstantiationProcessing;
import com.proteus.cgen.pragma.PragmaRegister;
import com.proteus.cgen.reorder.StatementReOrder;
import com.proteus.cgen.runner.util.ModuleIndexer;
import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.utils.CgenUtils;
import com.proteus.cgen.utils.PropertyReader;
import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeLexer;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_port_module_itemContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_defContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Source_textContext;

@Data
public class ProteusRunnerSession {
	private static final Logger L = LoggerFactory.getLogger(ProteusRunnerSession.class);

	private final CommandLineParser clp;
	private ModuleIndexer mi = null;
	private final Map<File, File> inputStagingMap = new HashMap<>();
	private ModuleParser mp;
	public static int generateBlockSuffix = 0;
	private Map<String,List<Parameter>> moduleToParameters;
	private Map<String,String> moduleMap;
	private List<String> headers;

	private void index(){
		List<File> allInputPreprocessedFiles = FileUtils.allFilesInDir(clp.getOutputDir()+"/ppv/");
		mi = new ModuleIndexer(allInputPreprocessedFiles);
		headers = new ArrayList<String>();
	}

	public void run(){
		index();
		makeOutputDir();
		if((clp.getOutputDir().exists() || clp.getOutputDir().mkdirs())){
			mp = new ModuleParser(mi);
			registerPragma();
			List<String> moduleNames= processFunctionSplittingPragma();
			for(String moduleName : moduleNames){
				Source_textContext stc = mp.getModule(moduleName);
				stc.extendedContext.splitModuleInstantiations();
				L.debug("Module after splitting module Instantiations");
				L.debug(stc.extendedContext.getFormattedText());
				stc.extendedContext.renameGenvarBlocks();
				CClass CClassObj = new CClass(moduleName,stc,moduleToParameters,clp.getOutputDir(),headers);
				Map<String,List<ParserRuleContext>> functionalityToMicsMap = splitFunctionality(moduleName,stc,CClassObj);
				writeFunctionDefs(moduleName,CClassObj,functionalityToMicsMap);
				CClassObj.writeClassToFile();
			}
			copyLibAndCommonFiles();
		}
	}
	
	private void makeOutputDir(){
		File convertedDir = new File(clp.getOutputDir()+"/converted/");
		if(!convertedDir.exists()){
			convertedDir.mkdir();
		}
	}

	private void copyLibAndCommonFiles() {
		Utils.asList("pragma");
		FileUtils.CopyDir(PropertyReader.getCommonDir(), clp.getOutputDir().toString()+"/common" , false);
		FileUtils.CopyDir(PropertyReader.getLibDir(), clp.getOutputDir().toString()+"/stl", Utils.asList("pragma"), false);
		FileUtils.copyFileToDir(PropertyReader.getConvertedMakefile(), clp.getOutputDir().toString()+"/converted");
		FileUtils.copyFileToDir(PropertyReader.getConvertedSubdir(), clp.getOutputDir().toString()+"/converted");
	}

	private void writeFunctionDefs(String moduleName,CClass CClassObj,Map<String,List<ParserRuleContext>> functionalityToMicsMap){
		StringBuilder stringBuilder = new StringBuilder();
		for(String functionalityName : functionalityToMicsMap.keySet()){
			CClassObj.populateFunction(functionalityName);
			String functionDef = getFunctionDef(moduleName,functionalityName,functionalityToMicsMap.get(functionalityName),CClassObj);
			stringBuilder.append(functionDef+"\n\n");	
		}
		String content = "#include \""+moduleName+"_class.h\"\n"+stringBuilder.toString();
		content = content.replace(";", ";\n").replace("}", "}\n").replace("{", "{\n");
		content = content.replaceAll("(?m)^[ \t]*\r?\n", "");
		content = content.replaceAll("for\\s*\\((.*?);\\n*(.*?);\\n*(.*?)\\)", "for($1;$2;$3)\n");
		FileUtils.WriteFile(new File(clp.getOutputDir()+"/converted/"+CClassObj.getClassName()+".cpp"), content);
	}

	public void PrintCppFiles(String content){
		FileUtils.WriteFile(clp.getOutputDir(), content);
	}

	private String getFunctionDef(String moduleName, String functionalityName,List<ParserRuleContext> module_itemContexts,CClass classObj){
		IFunctionalitySplitApp app = (IFunctionalitySplitApp) PragmaRegister.get("functionality_splitting");
		StringBuilder sb = new StringBuilder();
		sb.append(app.getFunctionHeader(moduleName, functionalityName)+"{");
		ExtendedContextVisitor visitor = new ExtendedContextVisitor();
		for(ParserRuleContext module_itemContext : module_itemContexts){
			visitor.visit(module_itemContext).prepForC(classObj.getreferenceVariables());
			sb.append("\n");
			sb.append(visitor.visit(module_itemContext).getCString(classObj, moduleToParameters,functionalityName));
		}
		sb.append("\n}\n");
		return sb.toString().replaceAll("(?m)^[ \t]*\r?\n", "");
	}

	private Map<String, List<ParserRuleContext>> splitFunctionality(String moduleName,Source_textContext stc, CClass cClassObj){
		L.debug("Splitting functionality for module : "+moduleName);
		Map<String,List<ParserRuleContext>> funNameToModuleItemContextsMap = new HashMap<String,List<ParserRuleContext>>();
		List<Non_port_module_itemContext> non_port_Module_itemContexts = stc.extendedContext.getNonPortModuleItems();
		if(non_port_Module_itemContexts!=null){
			List<String> functionalities = ((IFunctionalitySplitApp)PragmaRegister.get("functionality_splitting")).getFunctionalityNames(moduleName);
			L.debug("Starting to Split Functionality for module "+moduleName);
			for(String functionalityName: functionalities){
				L.debug("Functionality : "+functionalityName);
				SymbolTable st = cClassObj.getStOfPorts();
				((IFunctionalitySplitApp)PragmaRegister.get("functionality_splitting")).removeSymbols(moduleName, functionalityName,st);
				List<String> outputPorts = ((IFunctionalitySplitApp)PragmaRegister.get("functionality_splitting")).getOutputPorts(moduleName,functionalityName);
				addParametersToSt(st,moduleName);
				L.debug("With symbole Table "+st.summary());
				EvaluateConditionalExpressionsAndSplit(non_port_Module_itemContexts,st,functionalityName);
				List<Parameter> parametersToConside = new ArrayList<Parameter>();
				parametersToConside.addAll(moduleToParameters.get(moduleName));
				parametersToConside.addAll(cClassObj.getLocalParameters());
				List<ParserRuleContext> module_itemContextsAfterReOrdering = StatementReOrder.SortModuleItems(non_port_Module_itemContexts,stc,parametersToConside, outputPorts,functionalityName);
				funNameToModuleItemContextsMap.put(functionalityName, module_itemContextsAfterReOrdering);
			}
		}
		return funNameToModuleItemContextsMap;
	}
	
	private void addParametersToSt(SymbolTable st,String moduleName){
		for(Parameter parameter :moduleToParameters.get(moduleName)){
			st.put(parameter.getName(),parameter.getDefaultValue());
		}
	}

	private void registerPragma(){
		L.debug("Registering Pragmas");
		PragmaRegister.register("functionality_splitting", new FunctionalitySplitting());
		PragmaRegister.register("loop_size", new GenvarLoopLength());
		PragmaRegister.register("module_instantiation_pragma", new ModuleInstantiationProcessing());
		L.debug("Finished Registering Pragmas");
	}

	private List<String> processFunctionSplittingPragma(){
		moduleToParameters = new HashMap<String,List<Parameter>>();
		moduleMap = CgenUtils.readModuleMap();
		List<String> moduleNames = new ArrayList<String>();
		String path = PropertyReader.getLibDir();
		for(String moduleName : mi.getModuleNames()){
			if(moduleMap.containsKey(moduleName)){
				File pragmaFile = new File(path+"/"+moduleMap.get(moduleName));
				String pragma = FileUtils.readFileIntoString(pragmaFile)+"\n";
				processFunctionSplittingPragma(pragma);
				headers.add("#include \"./../lib/"+moduleName+"_class.h\"");
			} else {
				L.debug("trying to get the pragma for module : "+moduleName);
				Source_textContext stc = mp.getModule(moduleName);
				stc.extendedContext.processPragma("functionality_splitting");
				moduleNames.add(moduleName);
				headers.add("#include \"./"+moduleName+"_class.h\"");
			}
			List<Parameter> parameters = ((IFunctionalitySplitApp)PragmaRegister.get("functionality_splitting")).getParameters(moduleName);
			moduleToParameters.put(moduleName,parameters);
		}
		return moduleNames;
	}

	private void processFunctionSplittingPragma(String pragma) {
		VerilogPrimeLexer lexer = new VerilogPrimeLexer(new ANTLRInputStream(pragma));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		VerilogPrimeParser parser = new VerilogPrimeParser(tokens);
		Pragma_defContext pragma_defContext = (Pragma_defContext) new PopulateExtendedContextVisitor().visit(parser.pragma_def());
		PragmaRegister.get("functionality_splitting").process(pragma_defContext.pragma_text());
	}

	private void EvaluateConditionalExpressionsAndSplit(List<Non_port_module_itemContext> module_itemContexts,SymbolTable symbolTable, String functionalityName){
		int count = 0;
		int size = symbolTable.size();
		L.debug("");
		L.debug("Run :"+count);
		L.debug("Module_items before ConditionalExpression Evaluataion");
		for(Non_port_module_itemContext module_itemContext : module_itemContexts){
			L.debug(module_itemContext.extendedContext.getFormattedText());
		}
		for(Non_port_module_itemContext module_itemContext : module_itemContexts){
			module_itemContext.extendedContext.evaluateConditionalExpression(symbolTable,functionalityName);
		}
		L.debug("Module_items After ConditionalExpression Evaluataion");
		for(Non_port_module_itemContext module_itemContext : module_itemContexts){
			L.debug(module_itemContext.extendedContext.getFormattedText());
		}
		for(Non_port_module_itemContext module_itemContext : module_itemContexts){
			module_itemContext.extendedContext.paint(symbolTable, functionalityName);
		}
		L.debug("Module_items After SplittingFunctionality Evaluataion");
		for(Non_port_module_itemContext module_itemContext : module_itemContexts){
			L.debug(module_itemContext.extendedContext.getFormattedText());
		}
		count++;
		while(size != symbolTable.size()){
			size = symbolTable.size();
			L.debug("");
			L.debug("Run :"+count);
			L.debug("Module_items before ConditionalExpression Evaluataion");
			for(Non_port_module_itemContext module_itemContext : module_itemContexts){
				L.debug(module_itemContext.extendedContext.getFormattedText());
			}
			for(Non_port_module_itemContext module_itemContext : module_itemContexts){
				module_itemContext.extendedContext.evaluateConditionalExpression(symbolTable,functionalityName);
			}
			L.debug("Module_items After ConditionalExpression Evaluataion");
			for(Non_port_module_itemContext module_itemContext : module_itemContexts){
				L.debug(module_itemContext.extendedContext.getFormattedText());
			}
			for(Non_port_module_itemContext module_itemContext : module_itemContexts){
				module_itemContext.extendedContext.paint(symbolTable, functionalityName);
			}
			L.debug("Module_items After SplittingFunctionality Evaluataion");
			for(Non_port_module_itemContext module_itemContext : module_itemContexts){
				L.debug(module_itemContext.extendedContext.getFormattedText());
			}
			count++;
		}
	}

	public static void main(String[] args)
	{
		CommandLineParser clp = new CommandLineParser(new File("./").getAbsolutePath());
		ProteusRunnerSession proteusRunnerSession = new ProteusRunnerSession(clp);
		JCommander jCommander = new JCommander(clp);
		jCommander.parse(args);
		proteusRunnerSession.run();
	}
}

