package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Procedural_timing_control_statementContext;

public class Procedural_timing_control_statementContextExt extends AbstractBaseExt{

	@Getter private Procedural_timing_control_statementContext ctx;

	public Procedural_timing_control_statementContextExt(Procedural_timing_control_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).procedural_timing_control_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Procedural_timing_control_statementContext){
				this.ctx = (Procedural_timing_control_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Procedural_timing_control_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		return null;
	}
}
