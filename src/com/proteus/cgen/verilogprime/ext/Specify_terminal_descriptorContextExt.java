package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Specify_terminal_descriptorContext;

public class Specify_terminal_descriptorContextExt extends AbstractBaseExt{

	@Getter private Specify_terminal_descriptorContext ctx;

	public Specify_terminal_descriptorContextExt(Specify_terminal_descriptorContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).specify_terminal_descriptor());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Specify_terminal_descriptorContext){
				this.ctx = (Specify_terminal_descriptorContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Specify_terminal_descriptorContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
