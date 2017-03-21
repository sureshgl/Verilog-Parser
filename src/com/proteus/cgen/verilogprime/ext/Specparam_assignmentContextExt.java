package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Specparam_assignmentContext;

public class Specparam_assignmentContextExt extends AbstractBaseExt{

	@Getter private Specparam_assignmentContext ctx;

	public Specparam_assignmentContextExt(Specparam_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).specparam_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Specparam_assignmentContext){
				this.ctx = (Specparam_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Specparam_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
