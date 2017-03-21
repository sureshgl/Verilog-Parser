package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Liblist_clauseContext;

public class Liblist_clauseContextExt extends AbstractBaseExt{

	@Getter private Liblist_clauseContext ctx;

	public Liblist_clauseContextExt(Liblist_clauseContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).liblist_clause());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Liblist_clauseContext){
				this.ctx = (Liblist_clauseContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Liblist_clauseContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
