package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.MinuscolonContext;

public class MinuscolonContextExt extends AbstractBaseExt{

	@Getter private MinuscolonContext ctx;

	public MinuscolonContextExt(MinuscolonContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).minuscolon());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof MinuscolonContext){
				this.ctx = (MinuscolonContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+MinuscolonContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
