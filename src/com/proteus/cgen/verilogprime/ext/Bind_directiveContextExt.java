package com.proteus.cgen.verilogprime.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bind_directiveContext;

public class Bind_directiveContextExt extends AbstractBaseExt{

	@Getter private Bind_directiveContext ctx;

	public Bind_directiveContextExt(Bind_directiveContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bind_directive());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bind_directiveContext){
				this.ctx = (Bind_directiveContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bind_directiveContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.extendedContext.getFormattedText());
		}
		return null;
	}

	@Override
	public void paint(SymbolTable symbolTable, String functionalityName){
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.extendedContext.getFormattedText());
		}
	}
}
