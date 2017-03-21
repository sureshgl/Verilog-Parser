package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Named_checker_port_connectionContext;

public class Named_checker_port_connectionContextExt extends AbstractBaseExt{

	@Getter private Named_checker_port_connectionContext ctx;

	public Named_checker_port_connectionContextExt(Named_checker_port_connectionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).named_checker_port_connection());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Named_checker_port_connectionContext){
				this.ctx = (Named_checker_port_connectionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Named_checker_port_connectionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
