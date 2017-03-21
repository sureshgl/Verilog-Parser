package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Consecutive_repetitionContext;

public class Consecutive_repetitionContextExt extends AbstractBaseExt{

	@Getter private Consecutive_repetitionContext ctx;

	public Consecutive_repetitionContextExt(Consecutive_repetitionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).consecutive_repetition());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Consecutive_repetitionContext){
				this.ctx = (Consecutive_repetitionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Consecutive_repetitionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
