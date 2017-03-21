package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndcheckerstrContext;

public class EndcheckerstrContextExt extends AbstractBaseExt{

	@Getter private EndcheckerstrContext ctx;

	public EndcheckerstrContextExt(EndcheckerstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endcheckerstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndcheckerstrContext){
				this.ctx = (EndcheckerstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndcheckerstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
