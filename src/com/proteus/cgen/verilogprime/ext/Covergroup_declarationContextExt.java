package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Covergroup_declarationContext;

public class Covergroup_declarationContextExt extends AbstractBaseExt{

	@Getter private Covergroup_declarationContext ctx;

	public Covergroup_declarationContextExt(Covergroup_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).covergroup_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Covergroup_declarationContext){
				this.ctx = (Covergroup_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Covergroup_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
