package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_parameter_identifierContext;

public class Hierarchical_parameter_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_parameter_identifierContext ctx;

	public Hierarchical_parameter_identifierContextExt(Hierarchical_parameter_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_parameter_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_parameter_identifierContext){
				this.ctx = (Hierarchical_parameter_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_parameter_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
