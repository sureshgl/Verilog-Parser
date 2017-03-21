package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_consecutive_repetitionContext;

public class Non_consecutive_repetitionContextExt extends AbstractBaseExt{

	@Getter private Non_consecutive_repetitionContext ctx;

	public Non_consecutive_repetitionContextExt(Non_consecutive_repetitionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).non_consecutive_repetition());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Non_consecutive_repetitionContext){
				this.ctx = (Non_consecutive_repetitionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Non_consecutive_repetitionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
