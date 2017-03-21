package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Polarity_operatorContext;

public class Polarity_operatorContextExt extends AbstractBaseExt{

	@Getter private Polarity_operatorContext ctx;

	public Polarity_operatorContextExt(Polarity_operatorContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).polarity_operator());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Polarity_operatorContext){
				this.ctx = (Polarity_operatorContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Polarity_operatorContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
