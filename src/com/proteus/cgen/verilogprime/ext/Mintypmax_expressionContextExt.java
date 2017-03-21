package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Mintypmax_expressionContext;

public class Mintypmax_expressionContextExt extends AbstractBaseExt{

	@Getter private Mintypmax_expressionContext ctx;

	public Mintypmax_expressionContextExt(Mintypmax_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).mintypmax_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Mintypmax_expressionContext){
				this.ctx = (Mintypmax_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Mintypmax_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public Boolean isMinTypeMax(){
		return true;
	}
}
