package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Solve_before_primaryContext;

public class Solve_before_primaryContextExt extends AbstractBaseExt{

	@Getter private Solve_before_primaryContext ctx;

	public Solve_before_primaryContextExt(Solve_before_primaryContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).solve_before_primary());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Solve_before_primaryContext){
				this.ctx = (Solve_before_primaryContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Solve_before_primaryContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
