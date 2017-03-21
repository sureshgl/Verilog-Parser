package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequence_list_of_arguments_part1Context;

public class Sequence_list_of_arguments_part1ContextExt extends AbstractBaseExt{

	@Getter private Sequence_list_of_arguments_part1Context ctx;

	public Sequence_list_of_arguments_part1ContextExt(Sequence_list_of_arguments_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequence_list_of_arguments_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequence_list_of_arguments_part1Context){
				this.ctx = (Sequence_list_of_arguments_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequence_list_of_arguments_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
