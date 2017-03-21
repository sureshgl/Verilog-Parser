package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Covergroup_identifierContext;

public class Covergroup_identifierContextExt extends AbstractBaseExt{

	@Getter private Covergroup_identifierContext ctx;

	public Covergroup_identifierContextExt(Covergroup_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).covergroup_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Covergroup_identifierContext){
				this.ctx = (Covergroup_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Covergroup_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
