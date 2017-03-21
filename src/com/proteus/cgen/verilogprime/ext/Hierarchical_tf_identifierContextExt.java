package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_tf_identifierContext;

public class Hierarchical_tf_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_tf_identifierContext ctx;

	public Hierarchical_tf_identifierContextExt(Hierarchical_tf_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_tf_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_tf_identifierContext){
				this.ctx = (Hierarchical_tf_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_tf_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
