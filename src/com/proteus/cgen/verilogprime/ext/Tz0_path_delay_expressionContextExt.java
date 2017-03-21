package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Tz0_path_delay_expressionContext;

public class Tz0_path_delay_expressionContextExt extends AbstractBaseExt{

	@Getter private Tz0_path_delay_expressionContext ctx;

	public Tz0_path_delay_expressionContextExt(Tz0_path_delay_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tz0_path_delay_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tz0_path_delay_expressionContext){
				this.ctx = (Tz0_path_delay_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tz0_path_delay_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
