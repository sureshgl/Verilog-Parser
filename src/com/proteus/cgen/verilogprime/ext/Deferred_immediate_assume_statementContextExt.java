package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Deferred_immediate_assume_statementContext;

public class Deferred_immediate_assume_statementContextExt extends AbstractBaseExt{

	@Getter private Deferred_immediate_assume_statementContext ctx;

	public Deferred_immediate_assume_statementContextExt(Deferred_immediate_assume_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).deferred_immediate_assume_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Deferred_immediate_assume_statementContext){
				this.ctx = (Deferred_immediate_assume_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Deferred_immediate_assume_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
