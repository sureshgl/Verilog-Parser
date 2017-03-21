package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Goto_repetitionContext;

public class Goto_repetitionContextExt extends AbstractBaseExt{

	@Getter private Goto_repetitionContext ctx;

	public Goto_repetitionContextExt(Goto_repetitionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).goto_repetition());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Goto_repetitionContext){
				this.ctx = (Goto_repetitionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Goto_repetitionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
