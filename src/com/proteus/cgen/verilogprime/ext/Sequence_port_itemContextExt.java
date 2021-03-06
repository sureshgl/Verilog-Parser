package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequence_port_itemContext;

public class Sequence_port_itemContextExt extends AbstractBaseExt{

	@Getter private Sequence_port_itemContext ctx;

	public Sequence_port_itemContextExt(Sequence_port_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequence_port_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequence_port_itemContext){
				this.ctx = (Sequence_port_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequence_port_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
