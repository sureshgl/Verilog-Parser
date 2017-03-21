package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequential_entryContext;

public class Sequential_entryContextExt extends AbstractBaseExt{

	@Getter private Sequential_entryContext ctx;

	public Sequential_entryContextExt(Sequential_entryContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequential_entry());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequential_entryContext){
				this.ctx = (Sequential_entryContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequential_entryContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
