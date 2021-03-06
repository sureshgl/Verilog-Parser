package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Interface_port_declarationContext;

public class Interface_port_declarationContextExt extends AbstractBaseExt{

	@Getter private Interface_port_declarationContext ctx;

	public Interface_port_declarationContextExt(Interface_port_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).interface_port_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Interface_port_declarationContext){
				this.ctx = (Interface_port_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Interface_port_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
