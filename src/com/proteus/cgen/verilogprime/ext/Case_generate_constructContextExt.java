package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Case_generate_constructContext;

public class Case_generate_constructContextExt extends AbstractBaseExt{

	@Getter private Case_generate_constructContext ctx;

	public Case_generate_constructContextExt(Case_generate_constructContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).case_generate_construct());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Case_generate_constructContext){
				this.ctx = (Case_generate_constructContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Case_generate_constructContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
