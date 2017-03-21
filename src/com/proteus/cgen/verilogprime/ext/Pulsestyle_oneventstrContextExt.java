package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pulsestyle_oneventstrContext;

public class Pulsestyle_oneventstrContextExt extends AbstractBaseExt{

	@Getter private Pulsestyle_oneventstrContext ctx;

	public Pulsestyle_oneventstrContextExt(Pulsestyle_oneventstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pulsestyle_oneventstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pulsestyle_oneventstrContext){
				this.ctx = (Pulsestyle_oneventstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pulsestyle_oneventstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
