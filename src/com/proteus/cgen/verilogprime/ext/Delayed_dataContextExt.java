package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Delayed_dataContext;

public class Delayed_dataContextExt extends AbstractBaseExt{

	@Getter private Delayed_dataContext ctx;

	public Delayed_dataContextExt(Delayed_dataContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).delayed_data());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Delayed_dataContext){
				this.ctx = (Delayed_dataContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Delayed_dataContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
