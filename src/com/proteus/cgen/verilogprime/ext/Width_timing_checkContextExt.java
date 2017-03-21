package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Width_timing_checkContext;

public class Width_timing_checkContextExt extends AbstractBaseExt{

	@Getter private Width_timing_checkContext ctx;

	public Width_timing_checkContextExt(Width_timing_checkContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).width_timing_check());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Width_timing_checkContext){
				this.ctx = (Width_timing_checkContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Width_timing_checkContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
