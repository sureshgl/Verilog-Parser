package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollarerrorstrContext;

public class DollarerrorstrContextExt extends AbstractBaseExt{

	@Getter private DollarerrorstrContext ctx;

	public DollarerrorstrContextExt(DollarerrorstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollarerrorstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollarerrorstrContext){
				this.ctx = (DollarerrorstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollarerrorstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
