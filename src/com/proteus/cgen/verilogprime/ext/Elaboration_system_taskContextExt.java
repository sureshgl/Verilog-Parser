package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Elaboration_system_taskContext;

public class Elaboration_system_taskContextExt extends AbstractBaseExt{

	@Getter private Elaboration_system_taskContext ctx;

	public Elaboration_system_taskContextExt(Elaboration_system_taskContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).elaboration_system_task());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Elaboration_system_taskContext){
				this.ctx = (Elaboration_system_taskContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Elaboration_system_taskContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void paint(SymbolTable symbolTable, String functionalityName){
		BailoutRule(ctx.getClass().getName(), ctx.getText());
	}
}
