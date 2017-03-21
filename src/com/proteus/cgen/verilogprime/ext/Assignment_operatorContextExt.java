package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Assignment_operatorContext;

public class Assignment_operatorContextExt extends AbstractBaseExt{

	@Getter private Assignment_operatorContext ctx;

	public Assignment_operatorContextExt(Assignment_operatorContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assignment_operator());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Assignment_operatorContext){
				this.ctx = (Assignment_operatorContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Assignment_operatorContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
