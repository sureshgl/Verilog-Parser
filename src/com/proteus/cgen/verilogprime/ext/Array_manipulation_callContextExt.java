package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Array_manipulation_callContext;

public class Array_manipulation_callContextExt extends AbstractBaseExt{

	@Getter private Array_manipulation_callContext ctx;

	public Array_manipulation_callContextExt(Array_manipulation_callContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).array_manipulation_call());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Array_manipulation_callContext){
				this.ctx = (Array_manipulation_callContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Array_manipulation_callContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
