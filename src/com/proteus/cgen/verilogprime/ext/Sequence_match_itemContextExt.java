package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequence_match_itemContext;

public class Sequence_match_itemContextExt extends AbstractBaseExt{

	@Getter private Sequence_match_itemContext ctx;

	public Sequence_match_itemContextExt(Sequence_match_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequence_match_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequence_match_itemContext){
				this.ctx = (Sequence_match_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequence_match_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
