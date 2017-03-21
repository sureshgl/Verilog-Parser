package com.proteus.cgen.runner;

import java.io.File;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.proteus.common.util.Utils;
import com.proteus.preprocess.runner.PreprocessRunnerSession;

public class ProteusRunner {

	private static final Logger L = LoggerFactory.getLogger(ProteusRunner.class);
	private static JCommander jc = null;
	private static CommandLineParser cp = new CommandLineParser(new File("./").getAbsolutePath());
	
	public static void main(String[] args) {
		L.info("Launching Verilog Parser Runner");
		runVerilogParserRunner(args, true);
	}
	
	public static void printHelp(JCommander jac){
		jac.usage();
	}
	
	public static void runVerilogParserRunner(String[] args, boolean systemExitOnException){
		try{
			jc = new JCommander(cp);
			jc.setProgramName("proteus");
			jc.parse(args);
			cp.processArgs();
			if(cp.isHelp()){
				printHelp(jc);
				System.exit(0);
			}
		}catch(Throwable t){
			printHelp(jc);
			takeCareOfError("Error parsing Arguments",t, systemExitOnException);
		}
		try{
			HashMap<File,Boolean> filePreprocessStatusMap = new HashMap<File, Boolean>();
			L.info("Running preprocessor");
			L.debug("files picked for preprocessing are : ");
			L.debug(cp.getInputFilesInOrder().toString());
			L.debug(cp.getYOptionFiles().toString());
			File outDirForPP = new File(cp.getOutputFile()+"/ppv");
			if(!outDirForPP.exists())
				outDirForPP.mkdir();
			PreprocessRunnerSession preprocessRunnerSession = new PreprocessRunnerSession(outDirForPP, cp.getInputFilesInOrder() , cp.getYOptionFiles(), cp.getMacroDefinitions(), null,null,filePreprocessStatusMap,null);
			preprocessRunnerSession.preprocess();
			L.info("Finished preprocessing");
			ProteusRunnerSession session = new ProteusRunnerSession(cp);
			session.run();
			L.info("Done");
		}catch(Throwable t){
			t.printStackTrace();
			takeCareOfError("Error Running Proteus Session", t, systemExitOnException);
		}
	}
	
	public static void takeCareOfError(String externalErrorMsg, Throwable t, boolean systemExitOnException) {
		L.error(externalErrorMsg + ": " + Utils.getRootCauseUserDisplayString(t));
		takeCareOfError(new RuntimeException(externalErrorMsg, t), systemExitOnException);
	}

	private static void takeCareOfError(Throwable t, boolean systemExitOnException) {
		if (systemExitOnException)
			System.exit(1);
		else
			throw new RuntimeException(t);
	}
	
}
