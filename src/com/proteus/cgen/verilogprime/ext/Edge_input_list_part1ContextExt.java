package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Edge_input_list_part1Context;

public class Edge_input_list_part1ContextExt extends AbstractBaseExt{

	@Getter private Edge_input_list_part1Context ctx;

	public Edge_input_list_part1ContextExt(Edge_input_list_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).edge_input_list_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Edge_input_list_part1Context){
				this.ctx = (Edge_input_list_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Edge_input_list_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
