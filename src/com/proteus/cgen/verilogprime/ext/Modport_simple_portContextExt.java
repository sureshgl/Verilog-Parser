package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Modport_simple_portContext;

public class Modport_simple_portContextExt extends AbstractBaseExt{

	@Getter private Modport_simple_portContext ctx;

	public Modport_simple_portContextExt(Modport_simple_portContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).modport_simple_port());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Modport_simple_portContext){
				this.ctx = (Modport_simple_portContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Modport_simple_portContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
