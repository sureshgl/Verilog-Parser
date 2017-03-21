package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_multiple_concatenationContext;

public class Constant_multiple_concatenationContextExt extends AbstractBaseExt{

	@Getter private Constant_multiple_concatenationContext ctx;

	public Constant_multiple_concatenationContextExt(Constant_multiple_concatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_multiple_concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_multiple_concatenationContext){
				this.ctx = (Constant_multiple_concatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_multiple_concatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
