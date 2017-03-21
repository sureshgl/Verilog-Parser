package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Array_pattern_keyContext;

public class Array_pattern_keyContextExt extends AbstractBaseExt{

	@Getter private Array_pattern_keyContext ctx;

	public Array_pattern_keyContextExt(Array_pattern_keyContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).array_pattern_key());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Array_pattern_keyContext){
				this.ctx = (Array_pattern_keyContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Array_pattern_keyContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
