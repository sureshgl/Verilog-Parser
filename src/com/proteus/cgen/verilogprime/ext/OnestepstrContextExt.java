package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.OnestepstrContext;

public class OnestepstrContextExt extends AbstractBaseExt{

	@Getter private OnestepstrContext ctx;

	public OnestepstrContextExt(OnestepstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).onestepstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof OnestepstrContext){
				this.ctx = (OnestepstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+OnestepstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
