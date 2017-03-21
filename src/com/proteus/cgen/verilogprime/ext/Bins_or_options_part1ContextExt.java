package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bins_or_options_part1Context;

public class Bins_or_options_part1ContextExt extends AbstractBaseExt{

	@Getter private Bins_or_options_part1Context ctx;

	public Bins_or_options_part1ContextExt(Bins_or_options_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bins_or_options_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bins_or_options_part1Context){
				this.ctx = (Bins_or_options_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bins_or_options_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
