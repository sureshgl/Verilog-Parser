package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Tf_port_itemContext;

public class Tf_port_itemContextExt extends AbstractBaseExt{

	@Getter private Tf_port_itemContext ctx;

	public Tf_port_itemContextExt(Tf_port_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tf_port_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tf_port_itemContext){
				this.ctx = (Tf_port_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tf_port_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
