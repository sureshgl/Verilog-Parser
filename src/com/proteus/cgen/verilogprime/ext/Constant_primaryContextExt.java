package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import lombok.Getter;

import com.proteus.cgen.verilogprime.EvaluateVisitor;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_primaryContext;

public class Constant_primaryContextExt extends AbstractBaseExt{

	@Getter private Constant_primaryContext ctx;
	@Getter private String evaluatedString;

	public Constant_primaryContextExt(Constant_primaryContext ctx) {
		this.ctx = ctx;
		evaluatedString = null;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_primary());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_primaryContext){
				this.ctx = (Constant_primaryContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_primaryContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void eval(SymbolTable symbolTable){
		super.eval(symbolTable);
		evaluatedString = new String(new EvaluateVisitor(symbolTable).visit(getContext()));
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
		evaluatedString = null;
	}
}
