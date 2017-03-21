package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Edge_descriptorContext;

public class Edge_descriptorContextExt extends AbstractBaseExt{

	@Getter private Edge_descriptorContext ctx;

	public Edge_descriptorContextExt(Edge_descriptorContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).edge_descriptor());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Edge_descriptorContext){
				this.ctx = (Edge_descriptorContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Edge_descriptorContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
