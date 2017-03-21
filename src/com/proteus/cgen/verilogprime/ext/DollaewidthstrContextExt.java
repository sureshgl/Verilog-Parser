package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollaewidthstrContext;

public class DollaewidthstrContextExt extends AbstractBaseExt{

	@Getter private DollaewidthstrContext ctx;

	public DollaewidthstrContextExt(DollaewidthstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollaewidthstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollaewidthstrContext){
				this.ctx = (DollaewidthstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollaewidthstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
