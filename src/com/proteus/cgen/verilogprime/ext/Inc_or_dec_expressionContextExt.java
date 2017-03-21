package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Inc_or_dec_expressionContext;

public class Inc_or_dec_expressionContextExt extends AbstractBaseExt{

	@Getter private Inc_or_dec_expressionContext ctx;

	public Inc_or_dec_expressionContextExt(Inc_or_dec_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).inc_or_dec_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Inc_or_dec_expressionContext){
				this.ctx = (Inc_or_dec_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Inc_or_dec_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
