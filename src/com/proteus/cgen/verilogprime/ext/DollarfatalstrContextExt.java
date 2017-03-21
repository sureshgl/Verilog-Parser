package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollarfatalstrContext;

public class DollarfatalstrContextExt extends AbstractBaseExt{

	@Getter private DollarfatalstrContext ctx;

	public DollarfatalstrContextExt(DollarfatalstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollarfatalstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollarfatalstrContext){
				this.ctx = (DollarfatalstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollarfatalstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
