package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.verilogprime.EvaluateVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ExpressionOperand;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_conditional_expContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_only_primaryContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_unary_opContext;

public class ExpressionContextExt extends AbstractBaseExt{

	@Getter private ExpressionContext ctx;
	@Getter private String evaluatedString;
	private String CString;
	@Getter List<String> pragma_fn_statement_skip;

	public ExpressionContextExt(ExpressionContext ctx) {
		this.ctx = ctx;
		evaluatedString = null;
		CString = null;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof ExpressionContext){
				this.ctx = (ExpressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+ExpressionContext.class.getName());
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
			ExpressionContext tempctx = (ExpressionContext) getContext();
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
	public void evaluateConditionalExpression(SymbolTable st,String functionalityName){
		super.evaluateConditionalExpression(st, functionalityName);
		if(ctx instanceof Expression_conditional_expContext){
			Expression_conditional_expContext exprCtx = (Expression_conditional_expContext)ctx;
			if(!exprCtx.expression(1).extendedContext.getPragma_fn_statement_skip().contains(functionalityName) && !exprCtx.expression(2).extendedContext.getPragma_fn_statement_skip().contains(functionalityName)){
				eval(st);
				if(exprCtx.expression(0).extendedContext.getFormattedText().equals("0")){
					if(!exprCtx.expression(1).extendedContext.getPragma_fn_statement_skip().contains(functionalityName))
						exprCtx.expression(1).extendedContext.getPragma_fn_statement_skip().add(functionalityName);
				} else {
					try{
						Float.parseFloat(exprCtx.expression(0).extendedContext.getFormattedText());
						if(!exprCtx.expression(2).extendedContext.getPragma_fn_statement_skip().contains(functionalityName))
							exprCtx.expression(2).extendedContext.getPragma_fn_statement_skip().add(functionalityName);
					}catch(NumberFormatException exception){

					}
				}
				undoEvaluatedStrings();
			}
		}
	}


	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			if(ctx instanceof Expression_conditional_expContext){
				StringBuilder sb = new StringBuilder();
				String child1Text = ((Expression_conditional_expContext)ctx).expression(1).extendedContext.getCString(classObj, moduleToParameters,functionalityName);
				String child2Text = ((Expression_conditional_expContext)ctx).expression(2).extendedContext.getCString(classObj, moduleToParameters,functionalityName);
				if(child1Text.equals("")){
					sb.append("kiwibitset("+child2Text+")");
				} else if(child2Text.equals("")){
					sb.append("kiwibitset("+child1Text+")");
				} else {
					sb.append(((Expression_conditional_expContext)ctx).expression(0).extendedContext.getCString(classObj, moduleToParameters,functionalityName)+"?");
					sb.append("kiwibitset("+child1Text+") : ");
					sb.append("kiwibitset("+child2Text+")");
				}
				params.getStringBuilder().append(sb.toString());
				params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
			} else {
				if(CString != null){
					params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
					params.getStringBuilder().append(CString);
					params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
				} else {
					super.getCString(params,classObj,moduleToParameters,functionalityName);
				}
			}
		}
	}


	@Override
	public ExpressionOperand getOperand() {
		return this;
	}

	//TODO: GL Not sure whether we should expose this as AbstractBaseExt api or not.
	public void getBinaryRepresentation() {
		// Always perform transformations on the most recent one.
		if (getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED)
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
		CString = null;
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();

			if(ctx instanceof Expression_only_primaryContext){
				// primary 
				Expression_only_primaryContext eCtx = (Expression_only_primaryContext) ctx;

				List<String> ids = eCtx.primary().extendedContext.getHierarchicalIdentifier();
				List<String> selectIds = eCtx.primary().extendedContext.getSelectIdentifier();
				if(selectIds != null)
					for(String id :selectIds) {
						ids.remove(id);
					}
				if(ids != null){
					for(String id : ids){
						SortVariable sVar = new SortVariable();
						sVar.setParentName(id);

						if(((eCtx.primary().extendedContext.isSelect() != null) && (eCtx.primary().extendedContext.isSelect())) || 
								((eCtx.primary().extendedContext.isConstantSelect() != null) && (eCtx.primary().extendedContext.isConstantSelect()))){
							sVar.setType(TYPE.complex);
							sVar.setCompleteVar(eCtx.primary().getText());

						} else {
							sVar.setType(TYPE.simple);
						}
						rVariables.add(sVar);
					}
				}
			} else if (ctx instanceof Expression_unary_opContext) {
				Expression_unary_opContext eCtx = (Expression_unary_opContext) ctx;
				List<String> ids = eCtx.primary().extendedContext.getHierarchicalIdentifier();
				List<String> selectIds = eCtx.primary().extendedContext.getSelectIdentifier();
				if(selectIds != null)
					for(String id :selectIds) {
						ids.remove(id);
					}
				if(ids != null){
					for(String id : ids){
						SortVariable sVar = new SortVariable();
						sVar.setParentName(id);

						if(((eCtx.primary().extendedContext.isSelect() != null) && (eCtx.primary().extendedContext.isSelect())) || 
								((eCtx.primary().extendedContext.isConstantSelect() != null) && (eCtx.primary().extendedContext.isConstantSelect()))){
							sVar.setType(TYPE.complex);
							sVar.setCompleteVar(eCtx.primary().getText());

						} else {
							sVar.setType(TYPE.simple);
						}
						rVariables.add(sVar);
					}
				}
			}
			else {
				List<IStatement> childStatements = super.PopulateStatements(functionalityName);
				if(childStatements != null)
					for(IStatement childStatement : childStatements) {
						rVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
					}
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

	@Override
	public void prepForC(List<String> referenceVariables){
		super.prepForC(referenceVariables);
		if(ctx instanceof Expression_unary_opContext){
			Expression_unary_opContext expression_unary_opContext = (Expression_unary_opContext)getContext();
			if(expression_unary_opContext.unary_operator().getText().equals("&")){
				CString = expression_unary_opContext.primary().extendedContext.getFormattedText()+".unaryAnd()";
			} else if (expression_unary_opContext.unary_operator().getText().equals("|")){
				CString = expression_unary_opContext.primary().extendedContext.getFormattedText()+".unaryOr()";
			}
		}
	}
}
