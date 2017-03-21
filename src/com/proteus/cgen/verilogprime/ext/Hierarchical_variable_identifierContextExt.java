package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_variable_identifierContext;

public class Hierarchical_variable_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_variable_identifierContext ctx;
	private String evaluatedString;

	public Hierarchical_variable_identifierContextExt(Hierarchical_variable_identifierContext ctx) {
		this.ctx = ctx;
		evaluatedString = null;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_variable_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_variable_identifierContext){
				this.ctx = (Hierarchical_variable_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_variable_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void eval(SymbolTable st){
		if(st.containsKey(ctx.getText())){
			evaluatedString = st.get(ctx.getText());
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
