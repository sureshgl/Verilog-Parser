package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Charge_strengthContext;

public class Charge_strengthContextExt extends AbstractBaseExt{

	@Getter private Charge_strengthContext ctx;

	public Charge_strengthContextExt(Charge_strengthContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).charge_strength());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Charge_strengthContext){
				this.ctx = (Charge_strengthContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Charge_strengthContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
