package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Inc_or_dec_operatorContext;

public class Inc_or_dec_operatorContextExt extends AbstractBaseExt{

	@Getter private Inc_or_dec_operatorContext ctx;

	public Inc_or_dec_operatorContextExt(Inc_or_dec_operatorContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).inc_or_dec_operator());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Inc_or_dec_operatorContext){
				this.ctx = (Inc_or_dec_operatorContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Inc_or_dec_operatorContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
