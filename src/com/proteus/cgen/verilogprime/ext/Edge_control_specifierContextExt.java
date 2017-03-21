package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Edge_control_specifierContext;

public class Edge_control_specifierContextExt extends AbstractBaseExt{

	@Getter private Edge_control_specifierContext ctx;

	public Edge_control_specifierContextExt(Edge_control_specifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).edge_control_specifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Edge_control_specifierContext){
				this.ctx = (Edge_control_specifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Edge_control_specifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
