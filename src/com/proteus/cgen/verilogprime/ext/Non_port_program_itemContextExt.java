package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_port_program_itemContext;

public class Non_port_program_itemContextExt extends AbstractBaseExt{

	@Getter private Non_port_program_itemContext ctx;

	public Non_port_program_itemContextExt(Non_port_program_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).non_port_program_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Non_port_program_itemContext){
				this.ctx = (Non_port_program_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Non_port_program_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
