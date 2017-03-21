package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_decl_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_dimensionContext;

public class Variable_decl_assignmentContextExt extends AbstractBaseExt{

	@Getter private Variable_decl_assignmentContext ctx;

	public Variable_decl_assignmentContextExt(Variable_decl_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).variable_decl_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Variable_decl_assignmentContext){
				this.ctx = (Variable_decl_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Variable_decl_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			if(ctx.variable_identifier() != null) { 
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();
				boolean isSimple= true;
				SortVariable sVar = new SortVariable();
				List<String> varList = ctx.variable_identifier().extendedContext.Identifiers();
				List<String> varDimList= new ArrayList<String>();
				if(varList != null && varList.size() >1){
					BailoutRule("Variable_decl", ctx.getText());
				}
				if(ctx.variable_dimension() != null && ctx.variable_dimension().size() >0){
					List<Variable_dimensionContext> variable_dimensionContextList = ctx.variable_dimension();
					String dimension = "";
					for(Variable_dimensionContext variable_dimensionContext : variable_dimensionContextList) {
						dimension += variable_dimensionContext.getText();
						varDimList.addAll(variable_dimensionContext.extendedContext.Identifiers());
					}
					sVar.setType(TYPE.complex);
					isSimple = false;
					sVar.setCompleteVar(varList.get(0)+dimension);
				} 

				if(isSimple)
					sVar.setType(TYPE.simple);
				sVar.setParentName(varList.get(0));
				sVar.setDeclaration(true);
				lVariables.add(sVar);

				if(varDimList != null &&  varDimList.size() >0){
					for(String var : varDimList) {
						SortVariable sVarTemp = new SortVariable();
						sVarTemp.setParentName(var);
						sVarTemp.setType(TYPE.simple);
						rVariables.add(sVarTemp);
					}
				}

				if(ctx.expression() != null){
					List<IStatement> childStatements = ctx.expression().extendedContext.PopulateStatements(functionalityName);
					for(IStatement childStatement : childStatements) {
						rVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
					}
				}

				Statement statement = new Statement(lVariables, rVariables, ctx);
				iStatements.add(statement);
			} else {
				BailoutRule("Variable_decl", ctx.getText());
			}
		}
		if(iStatements.size()>0){
			return iStatements;
		} else {
			return null;
		}
	}
}
