package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pullup_strengthContext;

public class Pullup_strengthContextExt extends AbstractBaseExt{

	@Getter private Pullup_strengthContext ctx;

	public Pullup_strengthContextExt(Pullup_strengthContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pullup_strength());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pullup_strengthContext){
				this.ctx = (Pullup_strengthContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pullup_strengthContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
