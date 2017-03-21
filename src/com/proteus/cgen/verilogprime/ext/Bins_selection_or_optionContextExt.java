package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bins_selection_or_optionContext;

public class Bins_selection_or_optionContextExt extends AbstractBaseExt{

	@Getter private Bins_selection_or_optionContext ctx;

	public Bins_selection_or_optionContextExt(Bins_selection_or_optionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bins_selection_or_option());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bins_selection_or_optionContext){
				this.ctx = (Bins_selection_or_optionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bins_selection_or_optionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
