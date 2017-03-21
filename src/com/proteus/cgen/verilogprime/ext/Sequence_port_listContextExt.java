package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequence_port_listContext;

public class Sequence_port_listContextExt extends AbstractBaseExt{

	@Getter private Sequence_port_listContext ctx;

	public Sequence_port_listContextExt(Sequence_port_listContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequence_port_list());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequence_port_listContext){
				this.ctx = (Sequence_port_listContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequence_port_listContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
