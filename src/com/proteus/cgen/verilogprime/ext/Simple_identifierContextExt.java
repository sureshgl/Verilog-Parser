package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Simple_identifierContext;

public class Simple_identifierContextExt extends AbstractBaseExt{

	@Getter private Simple_identifierContext ctx;

	public Simple_identifierContextExt(Simple_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).simple_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Simple_identifierContext){
				this.ctx = (Simple_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Simple_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void eval(SymbolTable symbolTable){
		if(symbolTable.containsKey(ctx.getText())){
			setEvaluatedStatus(Evaluatable.COMPLETELY_EVALUATED);
		} else {
			setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
		}
	} 
}
