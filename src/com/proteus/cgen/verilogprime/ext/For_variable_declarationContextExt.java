package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.For_variable_declarationContext;

public class For_variable_declarationContextExt extends AbstractBaseExt{

	@Getter private For_variable_declarationContext ctx;

	public For_variable_declarationContextExt(For_variable_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).for_variable_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof For_variable_declarationContext){
				this.ctx = (For_variable_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+For_variable_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
