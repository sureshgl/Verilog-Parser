package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.End_edge_offsetContext;

public class End_edge_offsetContextExt extends AbstractBaseExt{

	@Getter private End_edge_offsetContext ctx;

	public End_edge_offsetContextExt(End_edge_offsetContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).end_edge_offset());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof End_edge_offsetContext){
				this.ctx = (End_edge_offsetContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+End_edge_offsetContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
