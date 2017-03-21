package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.NoshowcancelledstrContext;

public class NoshowcancelledstrContextExt extends AbstractBaseExt{

	@Getter private NoshowcancelledstrContext ctx;

	public NoshowcancelledstrContextExt(NoshowcancelledstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).noshowcancelledstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof NoshowcancelledstrContext){
				this.ctx = (NoshowcancelledstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+NoshowcancelledstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
