package com.proteus.cgen.verilogprime;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Evaluatable;
import com.proteus.common.util.FileUtils;

public class TerminalUtility {

	public static HashMap<String,String> evaluatableTerminals = new HashMap<String,String>();

	static{
		List<String> lines = FileUtils.ReadLines(new File("./tools/com/proteus/cgen/verilogprime/EvaluatableTerminals"));
		for(String str : lines){
			evaluatableTerminals.put(str, "");
		}
	}

	public static Evaluatable getEvaluatedStatus(ParseTree childCtx){
		if(evaluatableTerminals.containsKey(childCtx.getText())){
			return Evaluatable.COMPLETELY_EVALUATED;
		} else {
			return Evaluatable.PARTIALLY_EVALUATED;
		}
	}
}
