package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Assertion_item_declarationContext;

public class Assertion_item_declarationContextExt extends AbstractBaseExt{

	@Getter private Assertion_item_declarationContext ctx;

	public Assertion_item_declarationContextExt(Assertion_item_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assertion_item_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Assertion_item_declarationContext){
				this.ctx = (Assertion_item_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Assertion_item_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
