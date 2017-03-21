package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;

import org.antlr.v4.runtime.misc.Interval;

import com.proteus.cgen.verilogprime.EvaluateVisitor;
import com.proteus.cgen.verilogprime.ExpressionOperand;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_expressionContext;

public class Constant_expressionContextExt extends AbstractBaseExt{

	@Getter private Constant_expressionContext ctx;
	@Getter private String evaluatedString;

	public Constant_expressionContextExt(Constant_expressionContext ctx) {
		this.ctx = ctx;
		evaluatedString = null;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_expressionContext){
				this.ctx = (Constant_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void eval(SymbolTable symbolTable){
		super.eval(symbolTable);
		if(symbolTable.symbolTable.containsKey(ctx.getText())){
			this.evaluatedString = symbolTable.get(ctx.getText());
		} else {
			Constant_expressionContext tempctx = (Constant_expressionContext) getContext();
			this.evaluatedString = new String(new EvaluateVisitor(symbolTable).visit(tempctx));
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
	public ExpressionOperand getOperand() {
		return this;
	}


	//TODO: GL Not sure whether we should expose this as AbstractBaseExt api or not.
	public void getBinaryRepresentation() {
		// Always perform transformations on the most recent one.
		if (evaluatedString != null && getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED)
		{
			Integer decimalValue = Integer.parseInt(evaluatedString);
			String binString = Integer.toBinaryString(decimalValue);
			binString = binString.length()+"\'B"+binString;
			evaluatedString = binString;
			ParserRuleContext expressionContext = getContext(binString);
			addToContexts(expressionContext);
		}
	}

	@Override
	protected void undoEvaluatedStrings(){
		super.undoEvaluatedStrings();
		evaluatedString = null;
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();
			
			List<String> varList = ctx.extendedContext.Identifiers();
			for( String var : varList){
				SortVariable sVar = new SortVariable();
				sVar.setType(TYPE.simple);
				sVar.setParentName(var);
				rVariables.add(sVar);
			}

			Statement statement = new Statement(lVariables, rVariables, ctx);
			iStatements.add(statement);
		}
		if(iStatements.size()>0){
			return iStatements;
		} else {
			return null;
		}
	}
}
