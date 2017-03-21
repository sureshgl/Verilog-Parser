package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Property_list_of_arguments_part2Context;

public class Property_list_of_arguments_part2ContextExt extends AbstractBaseExt{

	@Getter private Property_list_of_arguments_part2Context ctx;

	public Property_list_of_arguments_part2ContextExt(Property_list_of_arguments_part2Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).property_list_of_arguments_part2());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Property_list_of_arguments_part2Context){
				this.ctx = (Property_list_of_arguments_part2Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Property_list_of_arguments_part2Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
