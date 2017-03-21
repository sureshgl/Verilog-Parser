package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.SortOrder;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;

import org.antlr.v4.runtime.misc.Interval;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Conditional_statementContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Statement_or_nullContext;

public class Conditional_statementContextExt extends AbstractBaseExt{

	@Getter private Conditional_statementContext ctx;
	@Getter List<String> pragma_fn_statement_skip;
	String evaluatedString;

	public Conditional_statementContextExt(Conditional_statementContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).conditional_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Conditional_statementContext){
				this.ctx = (Conditional_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Conditional_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void evaluateConditionalExpression(SymbolTable st,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<ExpressionContext> expressionContexts = ctx.expression();
			for(int i=0;i<expressionContexts.size();i++){
				ctx.expression(i).extendedContext.eval(st);
				if(ctx.expression(i).extendedContext.getFormattedText().equals("0")){
					ctx.statement_or_null(i).extendedContext.pragma_fn_statement_skip.add(functionalityName);
				}
				undoEvaluatedStrings();
			}
		}
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters, String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			StringBuilder sb = new StringBuilder();
			List<ExpressionContext> expressionContexts = ctx.expression();
			List<Statement_or_nullContext> statement_or_nullContexts = ctx.statement_or_null();
			int count =0;
			int i;
			for(i=0;i<expressionContexts.size();i++){
				String statement_or_null = statement_or_nullContexts.get(i).extendedContext.getAssignString(classObj, moduleToParameters, functionalityName);
				if(statement_or_null != null && !statement_or_null.equals("")){
					if(count ==0){
						sb.append("if("+expressionContexts.get(i).extendedContext.getFormattedText()+")\n");
						sb.append(statement_or_null+"\n");
						count = count+1;
					} else {
						sb.append("else if("+expressionContexts.get(i).extendedContext.getFormattedText()+")\n");
						sb.append(statement_or_null+"\n");
						count = count+1;
					}
				}
			}
			if(statement_or_nullContexts.size() == i+1){
				String statement_or_null = statement_or_nullContexts.get(i).extendedContext.getAssignString(classObj, moduleToParameters,functionalityName);
				if(statement_or_null != null && !statement_or_null.equals("")){
					sb.append("else \n");
					sb.append(statement_or_null+"\n");
				}
			}
			if(sb.toString().equals("")){
				return null;
			} else {
				return sb.toString();
			}
		} else {
			return null;
		}
	}

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
	public void Blocks_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			super.Blocks_to_null();
			addToContexts(null);
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(ctx != null){
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();

				List<IStatement> childStatements = super.PopulateStatements(functionalityName);
				for(IStatement childStatement : childStatements) {
					lVariables.addAll(childStatement.getLeftVariables());
					rVariables.addAll(childStatement.getRightVariables());
				}

				Statement statement = new Statement(lVariables, rVariables, ctx);
				iStatements.add(statement);
			}
			if(iStatements.size()>0){
				return iStatements;
			} else {
				return null;
			}
		}else{
			return null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters, String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<ctx.expression().size();i++){
				if(!sb.toString().equals("")){
					sb.append(" else \n");
				} 
				sb.append("if("+ctx.expression(i).extendedContext.getCString(classObj, moduleToParameters, functionalityName)+")\n");
				if(!ctx.statement_or_null(i).extendedContext.pragma_fn_statement_skip.contains(functionalityName)){
					sb.append(ctx.statement_or_null(i).extendedContext.getCString(classObj, moduleToParameters, functionalityName)+"\n");
				} else {
					sb.append("{}\n");
				}
			}
			if(ctx.expression().size()+1 == ctx.statement_or_null().size()){
				sb.append(" else\n");
				if(!ctx.statement_or_null(ctx.statement_or_null().size()-1).extendedContext.pragma_fn_statement_skip.contains(functionalityName)){
					sb.append(ctx.statement_or_null(ctx.statement_or_null().size()-1).extendedContext.getCString(classObj, moduleToParameters, functionalityName)+"\n");
				} else {
					sb.append("{}\n");
				}
			}
			params.getStringBuilder().append(sb.toString());
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}
}
