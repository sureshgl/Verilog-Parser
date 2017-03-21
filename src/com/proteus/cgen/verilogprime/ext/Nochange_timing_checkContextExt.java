package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Nochange_timing_checkContext;

public class Nochange_timing_checkContextExt extends AbstractBaseExt{

	@Getter private Nochange_timing_checkContext ctx;

	public Nochange_timing_checkContextExt(Nochange_timing_checkContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).nochange_timing_check());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Nochange_timing_checkContext){
				this.ctx = (Nochange_timing_checkContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Nochange_timing_checkContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
