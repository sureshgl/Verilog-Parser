package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Controlled_timing_check_eventContext;

public class Controlled_timing_check_eventContextExt extends AbstractBaseExt{

	@Getter private Controlled_timing_check_eventContext ctx;

	public Controlled_timing_check_eventContextExt(Controlled_timing_check_eventContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).controlled_timing_check_event());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Controlled_timing_check_eventContext){
				this.ctx = (Controlled_timing_check_eventContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Controlled_timing_check_eventContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
