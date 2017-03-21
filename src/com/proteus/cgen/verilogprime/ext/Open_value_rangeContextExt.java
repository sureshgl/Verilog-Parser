package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Open_value_rangeContext;

public class Open_value_rangeContextExt extends AbstractBaseExt{

	@Getter private Open_value_rangeContext ctx;

	public Open_value_rangeContextExt(Open_value_rangeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).open_value_range());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Open_value_rangeContext){
				this.ctx = (Open_value_rangeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Open_value_rangeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
