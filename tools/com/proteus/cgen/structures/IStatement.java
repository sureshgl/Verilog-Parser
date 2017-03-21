package com.proteus.cgen.structures;

import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;

public interface IStatement {
	public ParserRuleContext getContext();
	public Set<SortVariable> getLeftVariables();
	public Set<SortVariable> getRightVariables();
	boolean compare(IStatement thatStatement);
	public Set<Integer> getPosition();
	public void setPosition(Set<Integer> pos);
	public void removeParameters(List<Parameter> parameters);
	public boolean containsInRVar(SortVariable var);
}
