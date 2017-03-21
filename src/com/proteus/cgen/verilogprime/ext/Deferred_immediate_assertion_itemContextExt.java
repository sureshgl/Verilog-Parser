package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Deferred_immediate_assertion_itemContext;

public class Deferred_immediate_assertion_itemContextExt extends AbstractBaseExt{

	@Getter private Deferred_immediate_assertion_itemContext ctx;

	public Deferred_immediate_assertion_itemContextExt(Deferred_immediate_assertion_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).deferred_immediate_assertion_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Deferred_immediate_assertion_itemContext){
				this.ctx = (Deferred_immediate_assertion_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Deferred_immediate_assertion_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
