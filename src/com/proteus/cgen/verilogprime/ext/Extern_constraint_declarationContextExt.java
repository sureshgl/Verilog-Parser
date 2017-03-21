package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Extern_constraint_declarationContext;

public class Extern_constraint_declarationContextExt extends AbstractBaseExt{

	@Getter private Extern_constraint_declarationContext ctx;

	public Extern_constraint_declarationContextExt(Extern_constraint_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).extern_constraint_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Extern_constraint_declarationContext){
				this.ctx = (Extern_constraint_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Extern_constraint_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
