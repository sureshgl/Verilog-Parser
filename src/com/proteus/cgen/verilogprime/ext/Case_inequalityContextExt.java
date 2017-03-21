package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Case_inequalityContext;

public class Case_inequalityContextExt extends AbstractBaseExt{

	@Getter private Case_inequalityContext ctx;

	public Case_inequalityContextExt(Case_inequalityContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).case_inequality());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Case_inequalityContext){
				this.ctx = (Case_inequalityContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Case_inequalityContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
