package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bind_instantiationContext;

public class Bind_instantiationContextExt extends AbstractBaseExt{

	@Getter private Bind_instantiationContext ctx;

	public Bind_instantiationContextExt(Bind_instantiationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bind_instantiation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bind_instantiationContext){
				this.ctx = (Bind_instantiationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bind_instantiationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
