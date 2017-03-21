package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Tz1_path_delay_expressionContext;

public class Tz1_path_delay_expressionContextExt extends AbstractBaseExt{

	@Getter private Tz1_path_delay_expressionContext ctx;

	public Tz1_path_delay_expressionContextExt(Tz1_path_delay_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tz1_path_delay_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tz1_path_delay_expressionContext){
				this.ctx = (Tz1_path_delay_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tz1_path_delay_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
