package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expect_property_statementContext;

public class Expect_property_statementContextExt extends AbstractBaseExt{

	@Getter private Expect_property_statementContext ctx;

	public Expect_property_statementContextExt(Expect_property_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).expect_property_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Expect_property_statementContext){
				this.ctx = (Expect_property_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Expect_property_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
