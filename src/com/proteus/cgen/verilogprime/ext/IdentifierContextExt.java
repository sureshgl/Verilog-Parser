package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.Variable;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.IdentifierContext;

public class IdentifierContextExt extends AbstractBaseExt{

	@Getter private IdentifierContext ctx;
	private String evaluatedString;
	private String genvarAccess;

	public IdentifierContextExt(IdentifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof IdentifierContext){
				this.ctx = (IdentifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+IdentifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<String> Identifiers(){
		List<String> IdentifierList = new ArrayList<String>();
		if(ctx != null)
			IdentifierList.add(ctx.extendedContext.getFormattedText());
		return IdentifierList;
	}

	@Override
	public void prepForC(List<String> referenceVariables){
		if(referenceVariables.contains(ctx.getText())){
			evaluatedString = "(*"+ctx.getText()+")";
		} else {
			evaluatedString = ctx.getText();
		}
	}

	@Override
	public void genvarAccess(List<Variable> variables,String obj,String var){
		for(Variable variable : variables){
			if(variable.getName().equals(ctx.getText())){
				genvarAccess = "(*("+obj+"["+var+"])).";
				break;
			}
		}
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
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		String toAdd  = "";
		if(genvarAccess != null){
			toAdd = toAdd + genvarAccess;
		}
		if(evaluatedString != null){
			toAdd = toAdd + evaluatedString;
		} else {
			toAdd = toAdd + ctx.getText();
		}
		params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
		params.getStringBuilder().append(toAdd);
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
