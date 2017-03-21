package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pulldown_strengthContext;

public class Pulldown_strengthContextExt extends AbstractBaseExt{

	@Getter private Pulldown_strengthContext ctx;

	public Pulldown_strengthContextExt(Pulldown_strengthContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pulldown_strength());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pulldown_strengthContext){
				this.ctx = (Pulldown_strengthContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pulldown_strengthContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
