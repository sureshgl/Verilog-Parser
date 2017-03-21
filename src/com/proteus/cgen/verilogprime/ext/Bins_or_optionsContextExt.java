package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bins_or_optionsContext;

public class Bins_or_optionsContextExt extends AbstractBaseExt{

	@Getter private Bins_or_optionsContext ctx;

	public Bins_or_optionsContextExt(Bins_or_optionsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bins_or_options());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bins_or_optionsContext){
				this.ctx = (Bins_or_optionsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bins_or_optionsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
