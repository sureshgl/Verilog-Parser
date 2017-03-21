package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Delayed_referenceContext;

public class Delayed_referenceContextExt extends AbstractBaseExt{

	@Getter private Delayed_referenceContext ctx;

	public Delayed_referenceContextExt(Delayed_referenceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).delayed_reference());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Delayed_referenceContext){
				this.ctx = (Delayed_referenceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Delayed_referenceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
