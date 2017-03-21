package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Assignment_patternContext;

public class Assignment_patternContextExt extends AbstractBaseExt{

	@Getter private Assignment_patternContext ctx;

	public Assignment_patternContextExt(Assignment_patternContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assignment_pattern());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Assignment_patternContext){
				this.ctx = (Assignment_patternContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Assignment_patternContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
