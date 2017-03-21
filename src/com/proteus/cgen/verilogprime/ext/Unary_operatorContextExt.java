package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unary_operatorContext;

public class Unary_operatorContextExt extends AbstractBaseExt{

	@Getter private Unary_operatorContext ctx;

	public Unary_operatorContextExt(Unary_operatorContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).unary_operator());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Unary_operatorContext){
				this.ctx = (Unary_operatorContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Unary_operatorContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
