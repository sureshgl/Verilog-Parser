package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Inst_clauseContext;

public class Inst_clauseContextExt extends AbstractBaseExt{

	@Getter private Inst_clauseContext ctx;

	public Inst_clauseContextExt(Inst_clauseContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).inst_clause());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Inst_clauseContext){
				this.ctx = (Inst_clauseContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Inst_clauseContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
