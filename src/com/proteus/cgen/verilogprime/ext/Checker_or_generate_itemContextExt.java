package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Checker_or_generate_itemContext;

public class Checker_or_generate_itemContextExt extends AbstractBaseExt{

	@Getter private Checker_or_generate_itemContext ctx;

	public Checker_or_generate_itemContextExt(Checker_or_generate_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).checker_or_generate_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Checker_or_generate_itemContext){
				this.ctx = (Checker_or_generate_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Checker_or_generate_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
