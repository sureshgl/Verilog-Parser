package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Associative_dimensionContext;

public class Associative_dimensionContextExt extends AbstractBaseExt{

	@Getter private Associative_dimensionContext ctx;

	public Associative_dimensionContextExt(Associative_dimensionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).associative_dimension());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Associative_dimensionContext){
				this.ctx = (Associative_dimensionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Associative_dimensionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
