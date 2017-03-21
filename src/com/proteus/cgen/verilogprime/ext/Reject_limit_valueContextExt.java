package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Reject_limit_valueContext;

public class Reject_limit_valueContextExt extends AbstractBaseExt{

	@Getter private Reject_limit_valueContext ctx;

	public Reject_limit_valueContextExt(Reject_limit_valueContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).reject_limit_value());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Reject_limit_valueContext){
				this.ctx = (Reject_limit_valueContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Reject_limit_valueContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
