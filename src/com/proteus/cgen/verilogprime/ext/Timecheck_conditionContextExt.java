package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Timecheck_conditionContext;

public class Timecheck_conditionContextExt extends AbstractBaseExt{

	@Getter private Timecheck_conditionContext ctx;

	public Timecheck_conditionContextExt(Timecheck_conditionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).timecheck_condition());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Timecheck_conditionContext){
				this.ctx = (Timecheck_conditionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Timecheck_conditionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
