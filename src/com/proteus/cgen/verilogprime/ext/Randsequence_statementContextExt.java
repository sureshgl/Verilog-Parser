package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Randsequence_statementContext;

public class Randsequence_statementContextExt extends AbstractBaseExt{

	@Getter private Randsequence_statementContext ctx;

	public Randsequence_statementContextExt(Randsequence_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).randsequence_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Randsequence_statementContext){
				this.ctx = (Randsequence_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Randsequence_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
