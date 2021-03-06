package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_net_assignmentsContext;

public class List_of_net_assignmentsContextExt extends AbstractBaseExt{

	@Getter private List_of_net_assignmentsContext ctx;

	public List_of_net_assignmentsContextExt(List_of_net_assignmentsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).list_of_net_assignments());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof List_of_net_assignmentsContext){
				this.ctx = (List_of_net_assignmentsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+List_of_net_assignmentsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();
			if(ctx.net_assignment() != null && ctx.net_assignment().size() >0) {
				List<IStatement> childStatements = super.PopulateStatements(functionalityName);
				for(IStatement childStatement : childStatements) {
					lVariables.addAll(childStatement.getLeftVariables());
					rVariables.addAll(childStatement.getRightVariables());
				}
			}else{
				BailoutRule(ctx.getClass().getName(),"Hitting other rules");
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
