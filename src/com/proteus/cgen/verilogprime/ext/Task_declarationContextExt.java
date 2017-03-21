package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Task_declarationContext;

public class Task_declarationContextExt extends AbstractBaseExt{

	@Getter private Task_declarationContext ctx;

	public Task_declarationContextExt(Task_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).task_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Task_declarationContext){
				this.ctx = (Task_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Task_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void paint(SymbolTable st,String functionalityName) {
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.getText());
		}
	}
}
