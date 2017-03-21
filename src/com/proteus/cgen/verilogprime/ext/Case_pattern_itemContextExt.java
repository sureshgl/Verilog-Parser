package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Case_pattern_itemContext;

public class Case_pattern_itemContextExt extends AbstractBaseExt{

	@Getter private Case_pattern_itemContext ctx;

	public Case_pattern_itemContextExt(Case_pattern_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).case_pattern_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Case_pattern_itemContext){
				this.ctx = (Case_pattern_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Case_pattern_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
