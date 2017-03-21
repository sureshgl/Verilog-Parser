package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ordered_parameter_assignmentContext;

public class Ordered_parameter_assignmentContextExt extends AbstractBaseExt{

	@Getter private Ordered_parameter_assignmentContext ctx;

	public Ordered_parameter_assignmentContextExt(Ordered_parameter_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ordered_parameter_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ordered_parameter_assignmentContext){
				this.ctx = (Ordered_parameter_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ordered_parameter_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
