package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hold_timing_checkContext;

public class Hold_timing_checkContextExt extends AbstractBaseExt{

	@Getter private Hold_timing_checkContext ctx;

	public Hold_timing_checkContextExt(Hold_timing_checkContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hold_timing_check());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hold_timing_checkContext){
				this.ctx = (Hold_timing_checkContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hold_timing_checkContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void paint(SymbolTable symbolTable, String functionalityName) {
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.getText());
		}
	}
}
