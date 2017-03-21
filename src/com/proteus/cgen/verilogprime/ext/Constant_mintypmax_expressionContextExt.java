package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_mintypmax_expressionContext;

public class Constant_mintypmax_expressionContextExt extends AbstractBaseExt{

	@Getter private Constant_mintypmax_expressionContext ctx;

	public Constant_mintypmax_expressionContextExt(Constant_mintypmax_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_mintypmax_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_mintypmax_expressionContext){
				this.ctx = (Constant_mintypmax_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_mintypmax_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
