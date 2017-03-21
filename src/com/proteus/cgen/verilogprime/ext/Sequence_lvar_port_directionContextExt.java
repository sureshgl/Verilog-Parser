package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequence_lvar_port_directionContext;

public class Sequence_lvar_port_directionContextExt extends AbstractBaseExt{

	@Getter private Sequence_lvar_port_directionContext ctx;

	public Sequence_lvar_port_directionContextExt(Sequence_lvar_port_directionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequence_lvar_port_direction());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequence_lvar_port_directionContext){
				this.ctx = (Sequence_lvar_port_directionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequence_lvar_port_directionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
