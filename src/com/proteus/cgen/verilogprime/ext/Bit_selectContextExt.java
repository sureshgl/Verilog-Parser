package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bit_selectContext;

public class Bit_selectContextExt extends AbstractBaseExt{

	@Getter private Bit_selectContext ctx;

	public Bit_selectContextExt(Bit_selectContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bit_select());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bit_selectContext){
				this.ctx = (Bit_selectContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bit_selectContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public Boolean isBitSelect(){
		return true;
	}
}
