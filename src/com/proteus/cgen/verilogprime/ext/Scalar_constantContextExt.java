package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Scalar_constantContext;

public class Scalar_constantContextExt extends AbstractBaseExt{

	@Getter private Scalar_constantContext ctx;

	public Scalar_constantContextExt(Scalar_constantContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).scalar_constant());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Scalar_constantContext){
				this.ctx = (Scalar_constantContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Scalar_constantContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
