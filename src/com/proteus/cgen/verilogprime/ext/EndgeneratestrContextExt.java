package com.proteus.cgen.verilogprime.ext;

import java.util.List;

import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndgeneratestrContext;

public class EndgeneratestrContextExt extends AbstractBaseExt{

	@Getter private EndgeneratestrContext ctx;

	public EndgeneratestrContextExt(EndgeneratestrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endgeneratestr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndgeneratestrContext){
				this.ctx = (EndgeneratestrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndgeneratestrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	protected void getCString(Params params ,  CClass classObj, Map<String, List<Parameter>> moduleToParameters, String functionalityName){
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
