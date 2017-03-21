package com.proteus.cgen.structures;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;
import lombok.Setter;

import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;


public class Statement implements IStatement{
	@Setter Set<SortVariable> leftVariables;
	@Setter Set<SortVariable> rightVariables;
	@Setter @Getter Set<Integer> position;
	ParserRuleContext context;


	public Statement(){

	}

	public Statement(Set<SortVariable> lVariables, Set<SortVariable> rVariables, ParserRuleContext context){
		this.leftVariables = lVariables;
		this.rightVariables = rVariables;
		this.context = context;
	}

	@Override
	public ParserRuleContext getContext() {
		return context;
	}


	@Override
	public Set<SortVariable> getLeftVariables() {
		return leftVariables;
	}

	@Override
	public Set<SortVariable> getRightVariables() {
		return rightVariables;
	}

	@Override
	public boolean compare(IStatement thatStatement) {
		return false;
	}

	@Override
	public void removeParameters(List<Parameter> parameters) {
		for(Parameter parameter : parameters){
			Iterator<SortVariable> lVarItr = leftVariables.iterator();
			while(lVarItr.hasNext()) {
				SortVariable lVar = (SortVariable) lVarItr.next();

				if(lVar.getParentName().equals(parameter.getName())){
					lVarItr.remove();
				}
			}
			Iterator<SortVariable> rVarItr = rightVariables.iterator();
			while(rVarItr.hasNext()) {
				SortVariable rVar = (SortVariable) rVarItr.next();

				if(rVar.getParentName().equals(parameter.getName())){
					rVarItr.remove();
				}
			}
		}
	}

	@Override
	public boolean containsInRVar(SortVariable var) {
		return rightVariables.contains(var);
	}



}

