package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollarinfostrContext;

public class DollarinfostrContextExt extends AbstractBaseExt{

	@Getter private DollarinfostrContext ctx;

	public DollarinfostrContextExt(DollarinfostrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollarinfostr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollarinfostrContext){
				this.ctx = (DollarinfostrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollarinfostrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
