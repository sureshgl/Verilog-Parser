package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ordered_port_connectionContext;

public class Ordered_port_connectionContextExt extends AbstractBaseExt{

	@Getter private Ordered_port_connectionContext ctx;

	public Ordered_port_connectionContextExt(Ordered_port_connectionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ordered_port_connection());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ordered_port_connectionContext){
				this.ctx = (Ordered_port_connectionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ordered_port_connectionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
