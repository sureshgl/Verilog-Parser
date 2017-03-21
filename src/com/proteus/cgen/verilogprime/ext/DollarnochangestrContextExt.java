package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollarnochangestrContext;

public class DollarnochangestrContextExt extends AbstractBaseExt{

	@Getter private DollarnochangestrContext ctx;

	public DollarnochangestrContextExt(DollarnochangestrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollarnochangestr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollarnochangestrContext){
				this.ctx = (DollarnochangestrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollarnochangestrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
