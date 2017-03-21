package com.proteus.cgen.verilogprime.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Combinational_entryContext;

public class Combinational_entryContextExt extends AbstractBaseExt{

	@Getter private Combinational_entryContext ctx;

	public Combinational_entryContextExt(Combinational_entryContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).combinational_entry());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Combinational_entryContext){
				this.ctx = (Combinational_entryContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Combinational_entryContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void paint(SymbolTable symbolTable, String functionalityName){
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.getText());
		}
	}
}
