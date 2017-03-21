package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Case_inside_itemContext;

public class Case_inside_itemContextExt extends AbstractBaseExt{

	@Getter private Case_inside_itemContext ctx;

	public Case_inside_itemContextExt(Case_inside_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).case_inside_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Case_inside_itemContext){
				this.ctx = (Case_inside_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Case_inside_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
