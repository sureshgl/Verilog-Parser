package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Dpi_function_protoContext;

public class Dpi_function_protoContextExt extends AbstractBaseExt{

	@Getter private Dpi_function_protoContext ctx;

	public Dpi_function_protoContextExt(Dpi_function_protoContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dpi_function_proto());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Dpi_function_protoContext){
				this.ctx = (Dpi_function_protoContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Dpi_function_protoContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
