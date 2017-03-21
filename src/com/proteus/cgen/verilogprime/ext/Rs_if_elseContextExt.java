package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Rs_if_elseContext;

public class Rs_if_elseContextExt extends AbstractBaseExt{

	@Getter private Rs_if_elseContext ctx;

	public Rs_if_elseContextExt(Rs_if_elseContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).rs_if_else());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Rs_if_elseContext){
				this.ctx = (Rs_if_elseContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Rs_if_elseContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
