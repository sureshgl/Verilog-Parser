package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Scalar_constant0Context;

public class Scalar_constant0ContextExt extends AbstractBaseExt{

	@Getter private Scalar_constant0Context ctx;

	public Scalar_constant0ContextExt(Scalar_constant0Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).scalar_constant0());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Scalar_constant0Context){
				this.ctx = (Scalar_constant0Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Scalar_constant0Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
