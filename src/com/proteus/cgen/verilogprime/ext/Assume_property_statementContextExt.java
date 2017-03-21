package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Assume_property_statementContext;

public class Assume_property_statementContextExt extends AbstractBaseExt{

	@Getter private Assume_property_statementContext ctx;

	public Assume_property_statementContextExt(Assume_property_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assume_property_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Assume_property_statementContext){
				this.ctx = (Assume_property_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Assume_property_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
