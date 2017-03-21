package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Assignment_pattern_expression_typeContext;

public class Assignment_pattern_expression_typeContextExt extends AbstractBaseExt{

	@Getter private Assignment_pattern_expression_typeContext ctx;

	public Assignment_pattern_expression_typeContextExt(Assignment_pattern_expression_typeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).assignment_pattern_expression_type());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Assignment_pattern_expression_typeContext){
				this.ctx = (Assignment_pattern_expression_typeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Assignment_pattern_expression_typeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
