package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Let_list_of_arguments_part1Context;

public class Let_list_of_arguments_part1ContextExt extends AbstractBaseExt{

	@Getter private Let_list_of_arguments_part1Context ctx;

	public Let_list_of_arguments_part1ContextExt(Let_list_of_arguments_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).let_list_of_arguments_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Let_list_of_arguments_part1Context){
				this.ctx = (Let_list_of_arguments_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Let_list_of_arguments_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
