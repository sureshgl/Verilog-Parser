package com.proteus.cgen.verilogprime.ext;

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
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.NumberContext;

public class NumberContextExt extends AbstractBaseExt{

	@Getter private NumberContext ctx;
	private String evaluatedString;

	public NumberContextExt(NumberContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).number());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof NumberContext){
				this.ctx = (NumberContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+NumberContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void eval(SymbolTable symbolTable){
		setEvaluatedStatus(Evaluatable.COMPLETELY_EVALUATED);
		evaluatedString = convertToDecimal();
	}

	@Override
	protected void getFormattedText(Params params){
		if(evaluatedString != null){
			params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
			params.getStringBuilder().append(evaluatedString);
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			super.getFormattedText(params);
		}
	}

	@Override
	public void prepForC(List<String> referenceVariables){
		evaluatedString = convertToDecimal();
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(evaluatedString != null){
			String toAdd = evaluatedString.equals("0") ? "kiwibitset(1,0)" : evaluatedString;
			params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
			params.getStringBuilder().append(toAdd);
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			if(ctx.getText().equals("0")){
				params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
				params.getStringBuilder().append("kiwibitset(1,0)");
				params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
			} else {
				super.getCString(params, classObj, moduleToParameters, functionalityName);
			}
		}
	}

	private String convertToDecimal() {
		if(ctx.binary_number() != null){
			String pattern = "(\\d+)'[bB]([01]*)";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(ctx.getText());
			if (m.matches()) {
				Integer temp = Integer.parseInt(m.group(2), 2);
				String toAdd = temp.toString();
				return toAdd;     
			}
		} else if(ctx.hex_number() != null){
			String pattern = "(\\d+)'[hH]([0-9A-Fa-f]*)";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(ctx.getText());
			if (m.matches()) {
				Integer temp = Integer.parseInt(m.group(2), 16);
				String toAdd = temp.toString();
				return toAdd;     
			}
		}
		return getFormattedText();
	}
}
