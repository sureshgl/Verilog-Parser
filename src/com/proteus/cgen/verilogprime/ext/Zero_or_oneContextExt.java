package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Zero_or_oneContext;

public class Zero_or_oneContextExt extends AbstractBaseExt{

	@Getter private Zero_or_oneContext ctx;

	public Zero_or_oneContextExt(Zero_or_oneContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).zero_or_one());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Zero_or_oneContext){
				this.ctx = (Zero_or_oneContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Zero_or_oneContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
