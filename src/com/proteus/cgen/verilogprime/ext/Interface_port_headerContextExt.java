package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Interface_port_headerContext;

public class Interface_port_headerContextExt extends AbstractBaseExt{

	@Getter private Interface_port_headerContext ctx;

	public Interface_port_headerContextExt(Interface_port_headerContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).interface_port_header());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Interface_port_headerContext){
				this.ctx = (Interface_port_headerContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Interface_port_headerContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
