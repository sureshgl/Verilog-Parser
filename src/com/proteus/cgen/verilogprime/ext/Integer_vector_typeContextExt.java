package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Integer_vector_typeContext;

public class Integer_vector_typeContextExt extends AbstractBaseExt{

	@Getter private Integer_vector_typeContext ctx;

	public Integer_vector_typeContextExt(Integer_vector_typeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).integer_vector_type());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Integer_vector_typeContext){
				this.ctx = (Integer_vector_typeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Integer_vector_typeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
