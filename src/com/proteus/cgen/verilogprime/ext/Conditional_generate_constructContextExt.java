package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Conditional_generate_constructContext;

public class Conditional_generate_constructContextExt extends AbstractBaseExt{

	@Getter private Conditional_generate_constructContext ctx;

	public Conditional_generate_constructContextExt(Conditional_generate_constructContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).conditional_generate_construct());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Conditional_generate_constructContext){
				this.ctx = (Conditional_generate_constructContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Conditional_generate_constructContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
