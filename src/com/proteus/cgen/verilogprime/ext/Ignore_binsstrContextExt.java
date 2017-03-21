package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ignore_binsstrContext;

public class Ignore_binsstrContextExt extends AbstractBaseExt{

	@Getter private Ignore_binsstrContext ctx;

	public Ignore_binsstrContextExt(Ignore_binsstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ignore_binsstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ignore_binsstrContext){
				this.ctx = (Ignore_binsstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ignore_binsstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
