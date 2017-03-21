package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unsized_dimensionContext;

public class Unsized_dimensionContextExt extends AbstractBaseExt{

	@Getter private Unsized_dimensionContext ctx;

	public Unsized_dimensionContextExt(Unsized_dimensionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).unsized_dimension());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Unsized_dimensionContext){
				this.ctx = (Unsized_dimensionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Unsized_dimensionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
