package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Concurrent_assertion_statementContext;

public class Concurrent_assertion_statementContextExt extends AbstractBaseExt{

	@Getter private Concurrent_assertion_statementContext ctx;

	public Concurrent_assertion_statementContextExt(Concurrent_assertion_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).concurrent_assertion_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Concurrent_assertion_statementContext){
				this.ctx = (Concurrent_assertion_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Concurrent_assertion_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
