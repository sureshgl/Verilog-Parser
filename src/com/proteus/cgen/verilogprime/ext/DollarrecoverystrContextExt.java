package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollarrecoverystrContext;

public class DollarrecoverystrContextExt extends AbstractBaseExt{

	@Getter private DollarrecoverystrContext ctx;

	public DollarrecoverystrContextExt(DollarrecoverystrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollarrecoverystr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollarrecoverystrContext){
				this.ctx = (DollarrecoverystrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollarrecoverystrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
