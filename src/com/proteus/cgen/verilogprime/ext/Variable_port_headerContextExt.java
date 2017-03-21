package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_port_headerContext;

public class Variable_port_headerContextExt extends AbstractBaseExt{

	@Getter private Variable_port_headerContext ctx;

	public Variable_port_headerContextExt(Variable_port_headerContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).variable_port_header());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Variable_port_headerContext){
				this.ctx = (Variable_port_headerContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Variable_port_headerContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
