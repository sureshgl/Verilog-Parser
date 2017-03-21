package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ShowcancelledstrContext;

public class ShowcancelledstrContextExt extends AbstractBaseExt{

	@Getter private ShowcancelledstrContext ctx;

	public ShowcancelledstrContextExt(ShowcancelledstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).showcancelledstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ShowcancelledstrContext){
				this.ctx = (ShowcancelledstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ShowcancelledstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
