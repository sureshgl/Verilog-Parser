package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.PrimitivestrContext;

public class PrimitivestrContextExt extends AbstractBaseExt{

	@Getter private PrimitivestrContext ctx;

	public PrimitivestrContextExt(PrimitivestrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).primitivestr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PrimitivestrContext){
				this.ctx = (PrimitivestrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+PrimitivestrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
