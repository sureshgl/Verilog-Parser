package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constraint_block_itemContext;

public class Constraint_block_itemContextExt extends AbstractBaseExt{

	@Getter private Constraint_block_itemContext ctx;

	public Constraint_block_itemContextExt(Constraint_block_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constraint_block_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constraint_block_itemContext){
				this.ctx = (Constraint_block_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constraint_block_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
