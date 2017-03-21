package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bins_keywordContext;

public class Bins_keywordContextExt extends AbstractBaseExt{

	@Getter private Bins_keywordContext ctx;

	public Bins_keywordContextExt(Bins_keywordContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bins_keyword());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bins_keywordContext){
				this.ctx = (Bins_keywordContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bins_keywordContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
