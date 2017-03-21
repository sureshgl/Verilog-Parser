package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.LparenstarrparenContext;

public class LparenstarrparenContextExt extends AbstractBaseExt{

	@Getter private LparenstarrparenContext ctx;

	public LparenstarrparenContextExt(LparenstarrparenContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).lparenstarrparen());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof LparenstarrparenContext){
				this.ctx = (LparenstarrparenContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+LparenstarrparenContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
