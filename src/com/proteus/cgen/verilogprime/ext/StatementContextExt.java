package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.StatementContext;

public class StatementContextExt extends AbstractBaseExt{

	@Getter private StatementContext ctx;

	public StatementContextExt(StatementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof StatementContext){
				this.ctx = (StatementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+StatementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
