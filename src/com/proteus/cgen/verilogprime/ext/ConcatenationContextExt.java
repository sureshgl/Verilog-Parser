package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ConcatenationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;

public class ConcatenationContextExt extends AbstractBaseExt{

	@Getter private ConcatenationContext ctx;

	public ConcatenationContextExt(ConcatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ConcatenationContext){
				this.ctx = (ConcatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ConcatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public List<String> getConcatenatedVariables(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		List<String> variables = new ArrayList<String>();
		for(ExpressionContext expressionContext : ctx.expression()){
			variables.add(expressionContext.extendedContext.getCString(classObj, moduleToParameters, functionalityName));
		}
		return variables;
	}
	
	@Override
	public List<String> getConcatenatedVariables(){
		List<String> variables = new ArrayList<String>();
		for(ExpressionContext expressionContext : ctx.expression()){
			variables.add(expressionContext.extendedContext.getFormattedText());
		}
		return variables;
	}
	
	@Override
    protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		StringBuilder sb = new StringBuilder();
		sb.append("kiwibitset(");
		sb.append(ctx.expression(0).extendedContext.getCString(classObj, moduleToParameters, functionalityName));
		for(int i=1;i<ctx.expression().size();i++){
			sb.append(",");
			sb.append(ctx.expression(i).extendedContext.getCString(classObj, moduleToParameters, functionalityName));
		}
		sb.append(")");
		params.getStringBuilder().append(sb.toString());
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
	
	@Override
	public Boolean isConcatenation(){
		return true;
	}
}

