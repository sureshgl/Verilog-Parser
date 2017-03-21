package com.proteus.cgen.reorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_port_module_itemContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Source_textContext;

public class StatementReOrder {

	private static final Logger L = LoggerFactory.getLogger(StatementReOrder.class);

	public static List<ParserRuleContext> SortModuleItems(List<Non_port_module_itemContext> contexts,Source_textContext stc,List<Parameter> parameters, List<String> outputPorts, String functionalityName) {
		List<ParserRuleContext> sorted_module_itemContexts= new ArrayList<ParserRuleContext>();
		ExtendedContextVisitor visitor = new ExtendedContextVisitor();
		List<IStatement> statements = new ArrayList<IStatement>();
		for(int i=0 ; i < contexts.size(); i++){
			List<IStatement> statementsTemp = visitor.visit(contexts.get(i)).PopulateStatements(functionalityName);
			if(statementsTemp != null){
				if(statementsTemp != null && statementsTemp.size()>0){
					for(IStatement iStatement : statementsTemp ){
						if(iStatement != null){
							iStatement.removeParameters(parameters);
							Set<Integer> posSet = new HashSet<Integer>();
							iStatement.setPosition(posSet);
							statements.add(iStatement);
						}
					}
				}
			}
		}
		List<IStatement> sortedStatements = iterate(SortR1L2(statements),outputPorts);
		for(IStatement statement:sortedStatements){
			sorted_module_itemContexts.add(statement.getContext());
		}
		return sorted_module_itemContexts;
	}

	public static List<IStatement> iterate(List<IStatement> statementList, List<String> outputPorts){
		int sizeB = statementList.size();
		List<IStatement> afterRemovingUnused = RemoveUnusedStatements(statementList,outputPorts);
		int sizeA = afterRemovingUnused.size();
		if(sizeA != sizeB)
			afterRemovingUnused = iterate(afterRemovingUnused,outputPorts);
		return afterRemovingUnused;
	}

	public static  List<IStatement> RemoveUnusedStatements(List<IStatement> statementList, List<String> outputPorts) {
		for ( int i=0; i < statementList.size() ; i++ ){
			L.debug("stmt i="+i+" : "+new ExtendedContextVisitor().visit(statementList.get(i).getContext()).getFormattedText());
			L.debug("Left =" + statementList.get(i).getLeftVariables());
			L.debug("Right =" + statementList.get(i).getRightVariables());
			boolean unUsedStatement = true;
			int j=i+1;
			for ( ; j < statementList.size() ; j++ ){ //index+1
				if(CompareForUnused(statementList.get(i), statementList.get(j), outputPorts)){
					L.debug("stmt j="+j+"= " + new ExtendedContextVisitor().visit(statementList.get(j).getContext()).getFormattedText());
					L.debug("Left =" + statementList.get(j).getLeftVariables());
					L.debug("Right =" + statementList.get(j).getRightVariables());
					unUsedStatement = false;
					break;
				}
			}
			if(i==(statementList.size()-1)){
				if(CompareForUnused(statementList.get(i), null,outputPorts)){
					unUsedStatement = false;
				}
			}
			if(unUsedStatement){
				L.debug("removed =" + new ExtendedContextVisitor().visit(statementList.get(i).getContext()).getFormattedText());
				statementList.remove(i);
				--i;
			}
		}
		return statementList;
	}


	public static List<IStatement> SortR1L2(List<IStatement> statementList){
		for(IStatement stmt : statementList){
			L.debug(new ExtendedContextVisitor().visit(stmt.getContext()).getFormattedText());
			L.debug("Left =" + stmt.getLeftVariables());
			L.debug("Right =" + stmt.getRightVariables());

		}
		boolean isSwap=false;
		for ( int i=0; i < statementList.size() ;  ){
			for ( int j=i+1; j < statementList.size() ; j++ ){ //index+1
				if(CompareR1L2(statementList.get(i),statementList.get(j))){
					L.debug("Swapped");
					L.debug("Text ="+ new ExtendedContextVisitor().visit(statementList.get(i).getContext()).getFormattedText());
					L.debug("1 : "+i +statementList.get(i).getLeftVariables() +"="+statementList.get(i).getRightVariables() +"="+statementList.get(i).getPosition());
					L.debug("2 Text ="+ new ExtendedContextVisitor().visit(statementList.get(j).getContext()).getFormattedText());
					L.debug("2 : "+j+statementList.get(j).getLeftVariables() +"=" +statementList.get(j).getRightVariables() +"="+ statementList.get(j).getPosition()+"=");
					Set<Integer> posSet = statementList.get(i).getPosition();
					if(posSet == null) {
						Set<Integer> positionSet = new HashSet<Integer>();
						statementList.get(i).setPosition(positionSet);
						posSet = statementList.get(i).getPosition();
					}
					for(Integer pos: posSet){
						if(pos == i){
							L.debug("Cyclic");
							throw new RuntimeException("Cyclic");
						}
					}
					posSet.add(i);

					L.debug("index=" +i+"... idx"+j);
					Collections.swap(statementList,i,j);
					isSwap = true;
					break;
				}
			}
			if(!isSwap) {
				L.debug("index=" +i);
				i++;
			}
			isSwap = false;
			L.debug("-------------------------------------------------------");
		}
		return statementList;
	}

	private static boolean CompareForUnused(IStatement statement1,IStatement statement2 , List<String> outputPorts){
		if(statement2 == null){
			if(statement1.getRightVariables().size() <= 0){
				return false;
			} else {
				return true;
			}
		}
		Set<SortVariable> lVariablesList = statement1.getLeftVariables();
		if(lVariablesList.size() == 0){
			return true;
		}
		Boolean ret = false;
		for(SortVariable lvariable :lVariablesList){
			if( (outputPorts.contains(lvariable.getParentName()) && statement1.getRightVariables().size() > 0)|| statement2.containsInRVar(lvariable)){
				return true;
			}
		}
		return ret;
	}

	private static boolean CompareR1L2(IStatement statement1,IStatement statement2){
		// return true if S1 RHS contains s2's left variable
		Set<SortVariable> lVariablesList = statement2.getLeftVariables();
		Set<SortVariable> rVariablesList = statement1.getRightVariables();
		boolean isDependent =false;

		for(SortVariable lvariable :lVariablesList){
			for(SortVariable rvariable : rVariablesList){
				if(rvariable.getCompleteVar() != null && lvariable.getCompleteVar() != null) { 
					if(rvariable.getCompleteVar().equals(lvariable.getCompleteVar())){
						isDependent=true;
						L.debug("dependent variable opt1 : "+lvariable);
						return isDependent;
					} else
						if(rvariable.getIndexRange() != null && lvariable.getIndexRange() != null && rvariable.getParentName().equals(lvariable.getParentName()))
							if(rvariable.getIndexRange().equals(lvariable.getIndexRange())){
								isDependent=true;
								L.debug("dependent variable opt1 same index : "+lvariable);
								return isDependent;
							}
				} else if(rvariable.getCompleteVar() != null ) {
					if(rvariable.getCompleteVar().equals(lvariable.getParentName())){
						isDependent=true;
						L.debug("dependent variable opt2 : "+lvariable);
						return isDependent;
					}
				} else if(lvariable.getCompleteVar() != null){
					if(lvariable.getCompleteVar().equals(rvariable.getParentName())){
						isDependent=true;
						L.debug("dependent variable opt3 : "+lvariable);
						return isDependent;
					}
				} else 
					if(rvariable.getParentName().equals(lvariable.getParentName())){
						isDependent=true;
						L.debug("dependent variable opt4 : "+lvariable);
						return isDependent;
					}
			}
		}
		return isDependent;
	}
}
