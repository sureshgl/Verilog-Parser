package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Checker_always_constructContext;

public class Checker_always_constructContextExt extends AbstractBaseExt{

	@Getter private Checker_always_constructContext ctx;

	public Checker_always_constructContextExt(Checker_always_constructContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).checker_always_construct());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Checker_always_constructContext){
				this.ctx = (Checker_always_constructContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Checker_always_constructContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
