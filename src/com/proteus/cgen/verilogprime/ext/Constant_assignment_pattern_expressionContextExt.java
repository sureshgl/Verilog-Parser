package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_assignment_pattern_expressionContext;

public class Constant_assignment_pattern_expressionContextExt extends AbstractBaseExt{

	@Getter private Constant_assignment_pattern_expressionContext ctx;

	public Constant_assignment_pattern_expressionContextExt(Constant_assignment_pattern_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_assignment_pattern_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_assignment_pattern_expressionContext){
				this.ctx = (Constant_assignment_pattern_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_assignment_pattern_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
