package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pulsestyle_ondetectstrContext;

public class Pulsestyle_ondetectstrContextExt extends AbstractBaseExt{

	@Getter private Pulsestyle_ondetectstrContext ctx;

	public Pulsestyle_ondetectstrContextExt(Pulsestyle_ondetectstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pulsestyle_ondetectstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pulsestyle_ondetectstrContext){
				this.ctx = (Pulsestyle_ondetectstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pulsestyle_ondetectstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
