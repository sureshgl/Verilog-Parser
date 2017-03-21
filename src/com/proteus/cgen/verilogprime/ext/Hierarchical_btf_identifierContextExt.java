package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_btf_identifierContext;

public class Hierarchical_btf_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_btf_identifierContext ctx;

	public Hierarchical_btf_identifierContextExt(Hierarchical_btf_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_btf_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_btf_identifierContext){
				this.ctx = (Hierarchical_btf_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_btf_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
