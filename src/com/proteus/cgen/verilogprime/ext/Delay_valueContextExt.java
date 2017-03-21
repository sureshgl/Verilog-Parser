package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Delay_valueContext;

public class Delay_valueContextExt extends AbstractBaseExt{

	@Getter private Delay_valueContext ctx;
	private String evaluatedString;

	public Delay_valueContextExt(Delay_valueContext ctx) {
		this.ctx = ctx;
		evaluatedString = null;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).delay_value());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Delay_valueContext){
				this.ctx = (Delay_valueContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Delay_valueContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void eval(SymbolTable symbolTable){
		super.eval(symbolTable);
		if(symbolTable.symbolTable.containsKey(ctx.getText())){
			this.evaluatedString = new String(symbolTable.get(ctx.getText()));
		}
	}

	@Override
	protected void getFormattedText(Params params){
		if(evaluatedString != null){
			params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
			params.getStringBuilder().append(evaluatedString);
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			super.getFormattedText(params);
		}
	}
	
	@Override
	protected void undoEvaluatedStrings(){
		super.undoEvaluatedStrings();
		evaluatedString = null;
	}
}
