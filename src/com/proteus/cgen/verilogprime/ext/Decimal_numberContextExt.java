package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Decimal_numberContext;

public class Decimal_numberContextExt extends AbstractBaseExt{

	@Getter private Decimal_numberContext ctx;

	public Decimal_numberContextExt(Decimal_numberContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).decimal_number());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Decimal_numberContext){
				this.ctx = (Decimal_numberContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Decimal_numberContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
