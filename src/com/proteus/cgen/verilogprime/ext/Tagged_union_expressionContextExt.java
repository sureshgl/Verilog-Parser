package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Tagged_union_expressionContext;

public class Tagged_union_expressionContextExt extends AbstractBaseExt{

	@Getter private Tagged_union_expressionContext ctx;

	public Tagged_union_expressionContextExt(Tagged_union_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tagged_union_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tagged_union_expressionContext){
				this.ctx = (Tagged_union_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tagged_union_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
