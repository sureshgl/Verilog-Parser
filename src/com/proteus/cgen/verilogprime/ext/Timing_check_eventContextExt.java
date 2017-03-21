package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Timing_check_eventContext;

public class Timing_check_eventContextExt extends AbstractBaseExt{

	@Getter private Timing_check_eventContext ctx;

	public Timing_check_eventContextExt(Timing_check_eventContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).timing_check_event());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Timing_check_eventContext){
				this.ctx = (Timing_check_eventContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Timing_check_eventContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
