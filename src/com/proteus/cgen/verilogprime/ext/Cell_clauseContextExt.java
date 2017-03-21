package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Cell_clauseContext;

public class Cell_clauseContextExt extends AbstractBaseExt{

	@Getter private Cell_clauseContext ctx;

	public Cell_clauseContextExt(Cell_clauseContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).cell_clause());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Cell_clauseContext){
				this.ctx = (Cell_clauseContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Cell_clauseContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
