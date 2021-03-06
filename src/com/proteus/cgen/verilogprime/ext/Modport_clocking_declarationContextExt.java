package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Modport_clocking_declarationContext;

public class Modport_clocking_declarationContextExt extends AbstractBaseExt{

	@Getter private Modport_clocking_declarationContext ctx;

	public Modport_clocking_declarationContextExt(Modport_clocking_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).modport_clocking_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Modport_clocking_declarationContext){
				this.ctx = (Modport_clocking_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Modport_clocking_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
