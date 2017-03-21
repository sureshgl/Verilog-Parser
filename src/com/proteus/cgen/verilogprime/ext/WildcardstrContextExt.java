package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.WildcardstrContext;

public class WildcardstrContextExt extends AbstractBaseExt{

	@Getter private WildcardstrContext ctx;

	public WildcardstrContextExt(WildcardstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).wildcardstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof WildcardstrContext){
				this.ctx = (WildcardstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+WildcardstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
