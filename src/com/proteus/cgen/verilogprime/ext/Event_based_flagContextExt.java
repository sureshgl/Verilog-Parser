package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Event_based_flagContext;

public class Event_based_flagContextExt extends AbstractBaseExt{

	@Getter private Event_based_flagContext ctx;

	public Event_based_flagContextExt(Event_based_flagContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).event_based_flag());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Event_based_flagContext){
				this.ctx = (Event_based_flagContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Event_based_flagContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
