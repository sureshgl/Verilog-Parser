package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Timing_check_limitContext;

public class Timing_check_limitContextExt extends AbstractBaseExt{

	@Getter private Timing_check_limitContext ctx;

	public Timing_check_limitContextExt(Timing_check_limitContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).timing_check_limit());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Timing_check_limitContext){
				this.ctx = (Timing_check_limitContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Timing_check_limitContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
