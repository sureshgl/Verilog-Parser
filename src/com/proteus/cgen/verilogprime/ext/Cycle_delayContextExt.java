package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Cycle_delayContext;

public class Cycle_delayContextExt extends AbstractBaseExt{

	@Getter private Cycle_delayContext ctx;

	public Cycle_delayContextExt(Cycle_delayContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).cycle_delay());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Cycle_delayContext){
				this.ctx = (Cycle_delayContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Cycle_delayContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
