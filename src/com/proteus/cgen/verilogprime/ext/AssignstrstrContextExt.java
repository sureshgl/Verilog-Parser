package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.AssignstrstrContext;

public class AssignstrstrContextExt extends AbstractBaseExt{

	@Getter private AssignstrstrContext ctx;

	public AssignstrstrContextExt(AssignstrstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assignstrstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof AssignstrstrContext){
				this.ctx = (AssignstrstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+AssignstrstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters, String functionalityName){
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
