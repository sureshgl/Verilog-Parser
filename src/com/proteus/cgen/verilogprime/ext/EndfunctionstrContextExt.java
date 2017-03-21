package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndfunctionstrContext;

public class EndfunctionstrContextExt extends AbstractBaseExt{

	@Getter private EndfunctionstrContext ctx;

	public EndfunctionstrContextExt(EndfunctionstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endfunctionstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndfunctionstrContext){
				this.ctx = (EndfunctionstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndfunctionstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
