package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Nonblocking_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_lvalueContext;

public class Nonblocking_assignmentContextExt extends AbstractBaseExt{

	@Getter private Nonblocking_assignmentContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Nonblocking_assignmentContextExt(Nonblocking_assignmentContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).nonblocking_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Nonblocking_assignmentContext){
				this.ctx = (Nonblocking_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Nonblocking_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void paint(SymbolTable st,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			String beforeEval = getFormattedText();
			super.eval(st);
			String afterEval =  getFormattedText();
			Variable_lvalueContext variable_lvalueContext = (Variable_lvalueContext)ctx.variable_lvalue().extendedContext.getContext();
			Boolean forward = null;
			if(variable_lvalueContext.hierarchical_variable_identifier() == null) {
				forward = false;
			} else if(st.containsKey(variable_lvalueContext.hierarchical_variable_identifier().getText())){
				forward = true;
			} else {
				forward = false;
			}
			if((!beforeEval.equals(afterEval)) || forward){
				String expression = ctx.expression().extendedContext.getFormattedText();
				String lvalue;
				if(variable_lvalueContext.hierarchical_variable_identifier() == null){
					lvalue = variable_lvalueContext.extendedContext.getFormattedText();
				} else {
					lvalue = variable_lvalueContext.hierarchical_variable_identifier().getText();
				}
				expression = st.containsKey(expression) ? st.get(expression) : expression;
				lvalue = st.containsKey(lvalue) ? st.get(lvalue) : lvalue;
				try{
					Float.parseFloat(expression);
					try{
						Float.parseFloat(lvalue);
					}catch(NumberFormatException exception){
						if(variable_lvalueContext.select() == null || variable_lvalueContext.select().getText().equals("") )
							st.put(lvalue,"0");
					}
					if(!pragma_fn_statement_skip.contains(functionalityName))
						pragma_fn_statement_skip.add(functionalityName);
				}catch(NumberFormatException exception){
					try{
						Float.parseFloat(lvalue);
						if(!pragma_fn_statement_skip.contains(functionalityName))
							pragma_fn_statement_skip.add(functionalityName);
					}catch(NumberFormatException exception1){

					}
				}
			}
			undoEvaluatedStrings();
		}
	}

	@Override
	public void Statements_to_null(){
		addToContexts(null);
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(ctx != null){
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();
				if(ctx.variable_lvalue() != null ){
					List<String> varList = ctx.variable_lvalue().extendedContext.Identifiers();
					for( String var : varList){
						SortVariable sVar = new SortVariable();
						sVar.setType(TYPE.simple);
						sVar.setParentName(var);
						lVariables.add(sVar);
					}
				}
				if(ctx.expression() != null){
					List<String> varList = ctx.expression().extendedContext.Identifiers();
					for( String var : varList){
						SortVariable sVar = new SortVariable();
						sVar.setType(TYPE.simple);
						sVar.setParentName(var);
						rVariables.add(sVar);
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
		} else {
			return null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			ParserRuleContext ctx = getContext();
			if(ctx != null && ctx.children != null && ctx.children.size()>0){
				for(ParseTree childCtx : ctx.children){
					if(childCtx.getText().equals("<=")){
						params.getStringBuilder().append("=");
						params.setBeginingOfAlignemtText(((TerminalNode)childCtx.getChild(0)).getSymbol().getStopIndex()+1);
					} else if(childCtx instanceof TerminalNode){
						printTerminalNode((TerminalNode)childCtx,params);
					}
					else if(childCtx.getText().length() >0){
						params.setContext((ParserRuleContext)childCtx);
						Params thisCtxParams = getExtendedContext(childCtx).getUpdatedParams(params);
						getExtendedContext(childCtx).getFormattedText(thisCtxParams);
					}
				}
			}
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		return null;
	}
}
