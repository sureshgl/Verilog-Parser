package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_bit_selectContext;

public class Constant_bit_selectContextExt extends AbstractBaseExt{

	@Getter private Constant_bit_selectContext ctx;

	public Constant_bit_selectContextExt(Constant_bit_selectContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_bit_select());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_bit_selectContext){
				this.ctx = (Constant_bit_selectContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_bit_selectContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
