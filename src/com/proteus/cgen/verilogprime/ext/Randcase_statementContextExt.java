package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Randcase_statementContext;

public class Randcase_statementContextExt extends AbstractBaseExt{

	@Getter private Randcase_statementContext ctx;

	public Randcase_statementContextExt(Randcase_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).randcase_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Randcase_statementContext){
				this.ctx = (Randcase_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Randcase_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
