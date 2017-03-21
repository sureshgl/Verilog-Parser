package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Weight_specificationContext;

public class Weight_specificationContextExt extends AbstractBaseExt{

	@Getter private Weight_specificationContext ctx;

	public Weight_specificationContextExt(Weight_specificationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).weight_specification());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Weight_specificationContext){
				this.ctx = (Weight_specificationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Weight_specificationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
