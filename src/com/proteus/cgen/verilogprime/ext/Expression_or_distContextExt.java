package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_or_distContext;

public class Expression_or_distContextExt extends AbstractBaseExt{

	@Getter private Expression_or_distContext ctx;

	public Expression_or_distContextExt(Expression_or_distContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).expression_or_dist());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Expression_or_distContext){
				this.ctx = (Expression_or_distContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Expression_or_distContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
