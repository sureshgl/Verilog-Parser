package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Design_statement_part1Context;

public class Design_statement_part1ContextExt extends AbstractBaseExt{

	@Getter private Design_statement_part1Context ctx;

	public Design_statement_part1ContextExt(Design_statement_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).design_statement_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Design_statement_part1Context){
				this.ctx = (Design_statement_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Design_statement_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
