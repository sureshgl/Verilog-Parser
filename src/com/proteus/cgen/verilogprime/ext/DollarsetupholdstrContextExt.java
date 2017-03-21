package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollarsetupholdstrContext;

public class DollarsetupholdstrContextExt extends AbstractBaseExt{

	@Getter private DollarsetupholdstrContext ctx;

	public DollarsetupholdstrContextExt(DollarsetupholdstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollarsetupholdstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollarsetupholdstrContext){
				this.ctx = (DollarsetupholdstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollarsetupholdstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
