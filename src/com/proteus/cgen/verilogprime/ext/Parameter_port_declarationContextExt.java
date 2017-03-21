package com.proteus.cgen.verilogprime.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_param_assignmentsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Param_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Parameter_port_declarationContext;

public class Parameter_port_declarationContextExt extends AbstractBaseExt{

	@Getter private Parameter_port_declarationContext ctx;

	public Parameter_port_declarationContextExt(Parameter_port_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).parameter_port_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Parameter_port_declarationContext){
				this.ctx = (Parameter_port_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Parameter_port_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
