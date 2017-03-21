package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Cycle_delay_const_range_expressionContext;

public class Cycle_delay_const_range_expressionContextExt extends AbstractBaseExt{

	@Getter private Cycle_delay_const_range_expressionContext ctx;

	public Cycle_delay_const_range_expressionContextExt(Cycle_delay_const_range_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).cycle_delay_const_range_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Cycle_delay_const_range_expressionContext){
				this.ctx = (Cycle_delay_const_range_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Cycle_delay_const_range_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
