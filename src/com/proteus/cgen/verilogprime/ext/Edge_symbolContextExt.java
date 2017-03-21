package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Edge_symbolContext;

public class Edge_symbolContextExt extends AbstractBaseExt{

	@Getter private Edge_symbolContext ctx;

	public Edge_symbolContextExt(Edge_symbolContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).edge_symbol());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Edge_symbolContext){
				this.ctx = (Edge_symbolContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Edge_symbolContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
