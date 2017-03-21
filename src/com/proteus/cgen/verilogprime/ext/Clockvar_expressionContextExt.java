package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Clockvar_expressionContext;

public class Clockvar_expressionContextExt extends AbstractBaseExt{

	@Getter private Clockvar_expressionContext ctx;

	public Clockvar_expressionContextExt(Clockvar_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).clockvar_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Clockvar_expressionContext){
				this.ctx = (Clockvar_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Clockvar_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
