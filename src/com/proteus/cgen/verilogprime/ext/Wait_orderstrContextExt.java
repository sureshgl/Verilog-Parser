package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Wait_orderstrContext;

public class Wait_orderstrContextExt extends AbstractBaseExt{

	@Getter private Wait_orderstrContext ctx;

	public Wait_orderstrContextExt(Wait_orderstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).wait_orderstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Wait_orderstrContext){
				this.ctx = (Wait_orderstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Wait_orderstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
