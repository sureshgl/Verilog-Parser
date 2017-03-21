package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Inout_port_identifierContext;

public class Inout_port_identifierContextExt extends AbstractBaseExt{

	@Getter private Inout_port_identifierContext ctx;

	public Inout_port_identifierContextExt(Inout_port_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).inout_port_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Inout_port_identifierContext){
				this.ctx = (Inout_port_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Inout_port_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
