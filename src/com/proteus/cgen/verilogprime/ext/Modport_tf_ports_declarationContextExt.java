package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Modport_tf_ports_declarationContext;

public class Modport_tf_ports_declarationContextExt extends AbstractBaseExt{

	@Getter private Modport_tf_ports_declarationContext ctx;

	public Modport_tf_ports_declarationContextExt(Modport_tf_ports_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).modport_tf_ports_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Modport_tf_ports_declarationContext){
				this.ctx = (Modport_tf_ports_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Modport_tf_ports_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
