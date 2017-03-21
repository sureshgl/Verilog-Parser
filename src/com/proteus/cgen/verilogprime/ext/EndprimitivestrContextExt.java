package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndprimitivestrContext;

public class EndprimitivestrContextExt extends AbstractBaseExt{

	@Getter private EndprimitivestrContext ctx;

	public EndprimitivestrContextExt(EndprimitivestrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endprimitivestr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndprimitivestrContext){
				this.ctx = (EndprimitivestrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndprimitivestrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
