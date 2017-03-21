package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Illegal_binsstrContext;

public class Illegal_binsstrContextExt extends AbstractBaseExt{

	@Getter private Illegal_binsstrContext ctx;

	public Illegal_binsstrContextExt(Illegal_binsstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).illegal_binsstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Illegal_binsstrContext){
				this.ctx = (Illegal_binsstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Illegal_binsstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
