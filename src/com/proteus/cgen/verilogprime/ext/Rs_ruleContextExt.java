package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Rs_ruleContext;

public class Rs_ruleContextExt extends AbstractBaseExt{

	@Getter private Rs_ruleContext ctx;

	public Rs_ruleContextExt(Rs_ruleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).rs_rule());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Rs_ruleContext){
				this.ctx = (Rs_ruleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Rs_ruleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
