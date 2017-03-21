package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_or_range_expressionContext;

public class Const_or_range_expressionContextExt extends AbstractBaseExt{

	@Getter private Const_or_range_expressionContext ctx;

	public Const_or_range_expressionContextExt(Const_or_range_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).const_or_range_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Const_or_range_expressionContext){
				this.ctx = (Const_or_range_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Const_or_range_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
