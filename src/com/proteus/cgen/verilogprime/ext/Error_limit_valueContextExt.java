package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Error_limit_valueContext;

public class Error_limit_valueContextExt extends AbstractBaseExt{

	@Getter private Error_limit_valueContext ctx;

	public Error_limit_valueContextExt(Error_limit_valueContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).error_limit_value());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Error_limit_valueContext){
				this.ctx = (Error_limit_valueContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Error_limit_valueContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
