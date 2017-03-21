package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.structures.Statement;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_assignmentContext;

public class Net_assignmentContextExt extends AbstractBaseExt{

	@Getter private Net_assignmentContext ctx;

	public Net_assignmentContextExt(Net_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).net_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Net_assignmentContext){
				this.ctx = (Net_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Net_assignmentContext.class.getName());
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
			
			if(ctx.net_lvalue() != null && ctx.net_lvalue().ps_or_hierarchical_net_identifier() != null) {
				SortVariable sVar = new SortVariable();
				List<String> varList = ctx.net_lvalue().ps_or_hierarchical_net_identifier().extendedContext.Identifiers();
				if(varList !=null ) {
					if(ctx.net_lvalue().constant_select() != null && ctx.net_lvalue().constant_select().getText().length() >0){
						sVar.setCompleteVar(ctx.net_lvalue().getText());
						sVar.setType(TYPE.complex);
					}
					if(varList.size() >1){
						BailoutRule(ctx.getClass().getName(), "identifies more than 1");
					}
					else{
						sVar.setType(TYPE.simple);
						sVar.setParentName(varList.get(0));
					}
					lVariables.add(sVar);
				}

			}

			List<IStatement> childStatements = ctx.expression().extendedContext.PopulateStatements(functionalityName);
			for(IStatement childStatement : childStatements) {
				rVariables.addAll(childStatement.getLeftVariables());
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
	}
}
