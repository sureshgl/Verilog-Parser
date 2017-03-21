package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Defparam_assignmentContext;

public class Defparam_assignmentContextExt extends AbstractBaseExt{

	@Getter private Defparam_assignmentContext ctx;

	public Defparam_assignmentContextExt(Defparam_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).defparam_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Defparam_assignmentContext){
				this.ctx = (Defparam_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Defparam_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
