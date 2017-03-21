package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ps_or_hierarchical_array_identifier_part1Context;

public class Ps_or_hierarchical_array_identifier_part1ContextExt extends AbstractBaseExt{

	@Getter private Ps_or_hierarchical_array_identifier_part1Context ctx;

	public Ps_or_hierarchical_array_identifier_part1ContextExt(Ps_or_hierarchical_array_identifier_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ps_or_hierarchical_array_identifier_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ps_or_hierarchical_array_identifier_part1Context){
				this.ctx = (Ps_or_hierarchical_array_identifier_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ps_or_hierarchical_array_identifier_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
