package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Timestamp_conditionContext;

public class Timestamp_conditionContextExt extends AbstractBaseExt{

	@Getter private Timestamp_conditionContext ctx;

	public Timestamp_conditionContextExt(Timestamp_conditionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).timestamp_condition());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Timestamp_conditionContext){
				this.ctx = (Timestamp_conditionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Timestamp_conditionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
