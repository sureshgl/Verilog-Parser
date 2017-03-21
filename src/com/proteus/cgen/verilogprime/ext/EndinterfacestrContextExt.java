package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndinterfacestrContext;

public class EndinterfacestrContextExt extends AbstractBaseExt{

	@Getter private EndinterfacestrContext ctx;

	public EndinterfacestrContextExt(EndinterfacestrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endinterfacestr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndinterfacestrContext){
				this.ctx = (EndinterfacestrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndinterfacestrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
