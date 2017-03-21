package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Covergroup_variable_identifierContext;

public class Covergroup_variable_identifierContextExt extends AbstractBaseExt{

	@Getter private Covergroup_variable_identifierContext ctx;

	public Covergroup_variable_identifierContextExt(Covergroup_variable_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).covergroup_variable_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Covergroup_variable_identifierContext){
				this.ctx = (Covergroup_variable_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Covergroup_variable_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
