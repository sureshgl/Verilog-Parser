package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Named_parameter_assignmentContext;

public class Named_parameter_assignmentContextExt extends AbstractBaseExt{

	@Getter private Named_parameter_assignmentContext ctx;

	public Named_parameter_assignmentContextExt(Named_parameter_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).named_parameter_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Named_parameter_assignmentContext){
				this.ctx = (Named_parameter_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Named_parameter_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
