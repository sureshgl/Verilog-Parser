package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_path_delay_expressionsContext;

public class List_of_path_delay_expressionsContextExt extends AbstractBaseExt{

	@Getter private List_of_path_delay_expressionsContext ctx;

	public List_of_path_delay_expressionsContextExt(List_of_path_delay_expressionsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).list_of_path_delay_expressions());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof List_of_path_delay_expressionsContext){
				this.ctx = (List_of_path_delay_expressionsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+List_of_path_delay_expressionsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
