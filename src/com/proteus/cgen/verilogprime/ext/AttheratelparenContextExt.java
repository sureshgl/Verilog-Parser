package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.AttheratelparenContext;

public class AttheratelparenContextExt extends AbstractBaseExt{

	@Getter private AttheratelparenContext ctx;

	public AttheratelparenContextExt(AttheratelparenContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).attheratelparen());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof AttheratelparenContext){
				this.ctx = (AttheratelparenContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+AttheratelparenContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
