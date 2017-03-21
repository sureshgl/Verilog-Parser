package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Integer_atom_typeContext;

public class Integer_atom_typeContextExt extends AbstractBaseExt{

	@Getter private Integer_atom_typeContext ctx;

	public Integer_atom_typeContextExt(Integer_atom_typeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).integer_atom_type());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Integer_atom_typeContext){
				this.ctx = (Integer_atom_typeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Integer_atom_typeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
