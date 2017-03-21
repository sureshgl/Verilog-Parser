package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unbased_unsized_literalContext;

public class Unbased_unsized_literalContextExt extends AbstractBaseExt{

	@Getter private Unbased_unsized_literalContext ctx;

	public Unbased_unsized_literalContextExt(Unbased_unsized_literalContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).unbased_unsized_literal());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Unbased_unsized_literalContext){
				this.ctx = (Unbased_unsized_literalContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Unbased_unsized_literalContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
