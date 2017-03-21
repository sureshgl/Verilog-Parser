package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Clocking_directionContext;

public class Clocking_directionContextExt extends AbstractBaseExt{

	@Getter private Clocking_directionContext ctx;

	public Clocking_directionContextExt(Clocking_directionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).clocking_direction());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Clocking_directionContext){
				this.ctx = (Clocking_directionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Clocking_directionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
