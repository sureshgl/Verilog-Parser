package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Scalar_timing_check_conditionContext;

public class Scalar_timing_check_conditionContextExt extends AbstractBaseExt{

	@Getter private Scalar_timing_check_conditionContext ctx;

	public Scalar_timing_check_conditionContextExt(Scalar_timing_check_conditionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).scalar_timing_check_condition());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Scalar_timing_check_conditionContext){
				this.ctx = (Scalar_timing_check_conditionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Scalar_timing_check_conditionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
