package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Period_timing_checkContext;

public class Period_timing_checkContextExt extends AbstractBaseExt{

	@Getter private Period_timing_checkContext ctx;

	public Period_timing_checkContextExt(Period_timing_checkContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).period_timing_check());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Period_timing_checkContext){
				this.ctx = (Period_timing_checkContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Period_timing_checkContext.class.getName());
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
