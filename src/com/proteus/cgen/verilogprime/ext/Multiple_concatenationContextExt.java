package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Multiple_concatenationContext;

public class Multiple_concatenationContextExt extends AbstractBaseExt{

	@Getter private Multiple_concatenationContext ctx;
	private String evaluatedString;


	public Multiple_concatenationContextExt(Multiple_concatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).multiple_concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Multiple_concatenationContext){
				this.ctx = (Multiple_concatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Multiple_concatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(evaluatedString != null){
			params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
			params.getStringBuilder().append(evaluatedString);
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			super.getCString(params,classObj,moduleToParameters, functionalityName);
		}
	}

	@Override
	public void prepForC(List<String> referenceVariables){
		super.prepForC(referenceVariables);
		String pattern = "\\{([a-zA-Z_]+)\\{([0-9a-fA-F]*)\\}\\}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(getFormattedText());
		if(m.matches()){
			if(m.group(2).equals("0")){
				evaluatedString = "0";
			} else if(m.group(2).equals("1")){
				evaluatedString = "(2**("+m.group(1)+"-1))+1";
			} else {
				
			}
		}
	}
}
