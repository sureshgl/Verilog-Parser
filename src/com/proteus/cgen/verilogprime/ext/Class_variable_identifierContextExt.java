package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Class_variable_identifierContext;

public class Class_variable_identifierContextExt extends AbstractBaseExt{

	@Getter private Class_variable_identifierContext ctx;

	public Class_variable_identifierContextExt(Class_variable_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).class_variable_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Class_variable_identifierContext){
				this.ctx = (Class_variable_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Class_variable_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
