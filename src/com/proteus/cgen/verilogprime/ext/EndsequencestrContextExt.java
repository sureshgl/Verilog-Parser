package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndsequencestrContext;

public class EndsequencestrContextExt extends AbstractBaseExt{

	@Getter private EndsequencestrContext ctx;

	public EndsequencestrContextExt(EndsequencestrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endsequencestr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndsequencestrContext){
				this.ctx = (EndsequencestrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndsequencestrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
