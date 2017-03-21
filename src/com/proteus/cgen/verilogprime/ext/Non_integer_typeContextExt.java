package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_integer_typeContext;

public class Non_integer_typeContextExt extends AbstractBaseExt{

	@Getter private Non_integer_typeContext ctx;

	public Non_integer_typeContextExt(Non_integer_typeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).non_integer_type());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Non_integer_typeContext){
				this.ctx = (Non_integer_typeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Non_integer_typeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
