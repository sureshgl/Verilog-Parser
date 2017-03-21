package com.proteus.cgen.verilogprime.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bins_or_emptyContext;

public class Bins_or_emptyContextExt extends AbstractBaseExt{

	@Getter private Bins_or_emptyContext ctx;

	public Bins_or_emptyContextExt(Bins_or_emptyContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bins_or_empty());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bins_or_emptyContext){
				this.ctx = (Bins_or_emptyContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bins_or_emptyContext.class.getName());
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
			BailoutRule(ctx.getClass().getName(), ctx.getText());
		}
	}
}
