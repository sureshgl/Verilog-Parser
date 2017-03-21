package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Delay_or_event_controlContext;

public class Delay_or_event_controlContextExt extends AbstractBaseExt{

	@Getter private Delay_or_event_controlContext ctx;

	public Delay_or_event_controlContextExt(Delay_or_event_controlContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).delay_or_event_control());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Delay_or_event_controlContext){
				this.ctx = (Delay_or_event_controlContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Delay_or_event_controlContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
