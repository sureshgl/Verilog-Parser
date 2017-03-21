package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_array_identifierContext;

public class Hierarchical_array_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_array_identifierContext ctx;

	public Hierarchical_array_identifierContextExt(Hierarchical_array_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_array_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_array_identifierContext){
				this.ctx = (Hierarchical_array_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_array_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
