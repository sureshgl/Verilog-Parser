package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequence_actual_argContext;

public class Sequence_actual_argContextExt extends AbstractBaseExt{

	@Getter private Sequence_actual_argContext ctx;

	public Sequence_actual_argContextExt(Sequence_actual_argContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequence_actual_arg());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequence_actual_argContext){
				this.ctx = (Sequence_actual_argContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequence_actual_argContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
