package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Timeunits_declarationContext;

public class Timeunits_declarationContextExt extends AbstractBaseExt{

	@Getter private Timeunits_declarationContext ctx;

	public Timeunits_declarationContextExt(Timeunits_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).timeunits_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Timeunits_declarationContext){
				this.ctx = (Timeunits_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Timeunits_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
