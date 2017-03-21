package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ForkjoinstrContext;

public class ForkjoinstrContextExt extends AbstractBaseExt{

	@Getter private ForkjoinstrContext ctx;

	public ForkjoinstrContextExt(ForkjoinstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).forkjoinstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ForkjoinstrContext){
				this.ctx = (ForkjoinstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ForkjoinstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
