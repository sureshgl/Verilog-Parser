package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Loop_variables_part1Context;

public class Loop_variables_part1ContextExt extends AbstractBaseExt{

	@Getter private Loop_variables_part1Context ctx;

	public Loop_variables_part1ContextExt(Loop_variables_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).loop_variables_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Loop_variables_part1Context){
				this.ctx = (Loop_variables_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Loop_variables_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
