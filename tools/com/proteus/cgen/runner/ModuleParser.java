package com.proteus.cgen.runner;

import java.io.IOException;

import lombok.Data;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.cgen.runner.util.FileSplitter;
import com.proteus.cgen.runner.util.ModuleIndexer;
import com.proteus.cgen.runner.util.ModuleIndexer.ModuleEntry;
import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt;
import com.proteus.cgen.verilogprime.ext.Source_textContextExt;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeLexer;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Source_textContext;

@Data
public class ModuleParser {

	private static final Logger L = LoggerFactory.getLogger(ModuleParser.class);
	private final ModuleIndexer mi;
	
	public Source_textContext getModule(String moduleName){
		L.info("trying to parse "+moduleName);
		ParserRuleContext p = trySLLModule(moduleName);
		if(p==null){
			p = tryLLModule(moduleName);
		}
		if(p!=null){
			PopulateExtendedContextVisitor pecv = new PopulateExtendedContextVisitor();
			pecv.visit(p);
			ExtendedContextVisitor ecv = new ExtendedContextVisitor();
			AbstractBaseExt abxt = ecv.visit(p);
			Source_textContextExt stxt = (Source_textContextExt) abxt;
			if(stxt==null){
				L.warn("No context");
			}
			Source_textContext stc = (Source_textContext)stxt.getContext();
			L.warn("Done with "+moduleName);
			return stc;
		}else{
			throw new IllegalStateException("Could not parse module :"+moduleName);
		}
	}

	private ParserRuleContext tryLLModule(String moduleName) {
		try {
			String moduleString = getModuleContent(moduleName);
			//L.debug(moduleString);
			return tryLLContent(moduleString);
		} catch (IOException e) {
			L.error("Error Opening module "+moduleName);
			e.printStackTrace();
			return null;
		}
	}

	private String getModuleContent(String moduleName) throws IOException{
		ModuleEntry me  = mi.getEntryForModule(moduleName);
		return FileSplitter.lines(me.getFile(), me.getStartLine(), me.getEndLine());
	}

	private ParserRuleContext trySLLModule(String moduleName) {
		try {
			String moduleString = getModuleContent(moduleName);
			//L.debug(moduleString);
			return trySLLContent(moduleString);
		} catch (IOException e) {
			L.error("Error Opening module "+moduleName);
			e.printStackTrace();
			return null;
		}
	}
	
	public static ParserRuleContext parse(String content){
		ParserRuleContext p = trySLLContent(content);
		if(p==null){
			p = tryLLContent(content);
		}
		return p;
	}
	
	
	public static ParserRuleContext tryLLContent(String content){
		VerilogPrimeLexer lexer = new VerilogPrimeLexer(new ANTLRInputStream(content));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		VerilogPrimeParser parser = new VerilogPrimeParser(null);
		try{
			parser.getInterpreter().setPredictionMode(PredictionMode.LL);
			parser.setErrorHandler(new BailErrorStrategy());
			parser.setBuildParseTree(true);
			parser.setTokenStream(tokens);
			ParserRuleContext tree = parser.source_text();
			return tree;
		}catch(Exception e){
			L.error("Error parsing content with LL strategy");
			return null;
		}
	}
	
	public static ParserRuleContext trySLLContent(String content){
		VerilogPrimeLexer lexer = new VerilogPrimeLexer(new ANTLRInputStream(content));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		VerilogPrimeParser parser = new VerilogPrimeParser(null);
		try{
			parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
			parser.setErrorHandler(new BailErrorStrategy());
			parser.setBuildParseTree(true);
			parser.setTokenStream(tokens);
			ParserRuleContext tree = parser.source_text();
			return tree;
		}catch(Exception e){
			L.debug("Error parsing content with SLL strategy");
			return null;
		}
	}
	
	
}
