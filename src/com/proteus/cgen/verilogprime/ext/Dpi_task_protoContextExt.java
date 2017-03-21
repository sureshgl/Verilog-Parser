package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Dpi_task_protoContext;

public class Dpi_task_protoContextExt extends AbstractBaseExt{

	@Getter private Dpi_task_protoContext ctx;

	public Dpi_task_protoContextExt(Dpi_task_protoContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dpi_task_proto());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Dpi_task_protoContext){
				this.ctx = (Dpi_task_protoContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Dpi_task_protoContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
