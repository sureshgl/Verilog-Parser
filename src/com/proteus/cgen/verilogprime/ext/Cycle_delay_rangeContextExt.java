package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Cycle_delay_rangeContext;

public class Cycle_delay_rangeContextExt extends AbstractBaseExt{

	@Getter private Cycle_delay_rangeContext ctx;

	public Cycle_delay_rangeContextExt(Cycle_delay_rangeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).cycle_delay_range());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Cycle_delay_rangeContext){
				this.ctx = (Cycle_delay_rangeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Cycle_delay_rangeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
