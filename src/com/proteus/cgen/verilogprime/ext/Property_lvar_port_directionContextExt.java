package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Property_lvar_port_directionContext;

public class Property_lvar_port_directionContextExt extends AbstractBaseExt{

	@Getter private Property_lvar_port_directionContext ctx;

	public Property_lvar_port_directionContextExt(Property_lvar_port_directionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).property_lvar_port_direction());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Property_lvar_port_directionContext){
				this.ctx = (Property_lvar_port_directionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Property_lvar_port_directionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
