package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Let_list_of_argumentsContext;

public class Let_list_of_argumentsContextExt extends AbstractBaseExt{

	@Getter private Let_list_of_argumentsContext ctx;

	public Let_list_of_argumentsContextExt(Let_list_of_argumentsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).let_list_of_arguments());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Let_list_of_argumentsContext){
				this.ctx = (Let_list_of_argumentsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Let_list_of_argumentsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
