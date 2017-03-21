package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Immediate_assertion_statementContext;

public class Immediate_assertion_statementContextExt extends AbstractBaseExt{

	@Getter private Immediate_assertion_statementContext ctx;

	public Immediate_assertion_statementContextExt(Immediate_assertion_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).immediate_assertion_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Immediate_assertion_statementContext){
				this.ctx = (Immediate_assertion_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Immediate_assertion_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
