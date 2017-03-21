package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Rs_code_blockContext;

public class Rs_code_blockContextExt extends AbstractBaseExt{

	@Getter private Rs_code_blockContext ctx;

	public Rs_code_blockContextExt(Rs_code_blockContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).rs_code_block());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Rs_code_blockContext){
				this.ctx = (Rs_code_blockContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Rs_code_blockContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
