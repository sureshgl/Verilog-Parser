package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Let_actual_argContext;

public class Let_actual_argContextExt extends AbstractBaseExt{

	@Getter private Let_actual_argContext ctx;

	public Let_actual_argContextExt(Let_actual_argContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).let_actual_arg());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Let_actual_argContext){
				this.ctx = (Let_actual_argContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Let_actual_argContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
