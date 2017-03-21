package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ThroughoutstrContext;

public class ThroughoutstrContextExt extends AbstractBaseExt{

	@Getter private ThroughoutstrContext ctx;

	public ThroughoutstrContextExt(ThroughoutstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).throughoutstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ThroughoutstrContext){
				this.ctx = (ThroughoutstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ThroughoutstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
