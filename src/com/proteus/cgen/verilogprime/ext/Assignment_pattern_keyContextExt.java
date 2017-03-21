package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Assignment_pattern_keyContext;

public class Assignment_pattern_keyContextExt extends AbstractBaseExt{

	@Getter private Assignment_pattern_keyContext ctx;

	public Assignment_pattern_keyContextExt(Assignment_pattern_keyContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assignment_pattern_key());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Assignment_pattern_keyContext){
				this.ctx = (Assignment_pattern_keyContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Assignment_pattern_keyContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
