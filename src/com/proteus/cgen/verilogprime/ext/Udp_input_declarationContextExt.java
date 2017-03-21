package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Udp_input_declarationContext;

public class Udp_input_declarationContextExt extends AbstractBaseExt{

	@Getter private Udp_input_declarationContext ctx;

	public Udp_input_declarationContextExt(Udp_input_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).udp_input_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Udp_input_declarationContext){
				this.ctx = (Udp_input_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Udp_input_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
