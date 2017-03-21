package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Assignment_pattern_expressionContext;

public class Assignment_pattern_expressionContextExt extends AbstractBaseExt{

	@Getter private Assignment_pattern_expressionContext ctx;

	public Assignment_pattern_expressionContextExt(Assignment_pattern_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assignment_pattern_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Assignment_pattern_expressionContext){
				this.ctx = (Assignment_pattern_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Assignment_pattern_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
