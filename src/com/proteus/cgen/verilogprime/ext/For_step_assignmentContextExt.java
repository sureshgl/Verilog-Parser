package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.For_step_assignmentContext;

public class For_step_assignmentContextExt extends AbstractBaseExt{

	@Getter private For_step_assignmentContext ctx;

	public For_step_assignmentContextExt(For_step_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).for_step_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof For_step_assignmentContext){
				this.ctx = (For_step_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+For_step_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
