package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.CmosstrContext;

public class CmosstrContextExt extends AbstractBaseExt{

	@Getter private CmosstrContext ctx;

	public CmosstrContextExt(CmosstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).cmosstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof CmosstrContext){
				this.ctx = (CmosstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+CmosstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
