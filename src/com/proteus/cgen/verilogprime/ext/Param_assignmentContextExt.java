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
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Param_assignmentContext;

public class Param_assignmentContextExt extends AbstractBaseExt{

	@Getter private Param_assignmentContext ctx;

	public Param_assignmentContextExt(Param_assignmentContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).param_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Param_assignmentContext){
				this.ctx = (Param_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Param_assignmentContext.class.getName());
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
			
			if(ctx.parameter_identifier() != null){
				List<String> varList = ctx.parameter_identifier().extendedContext.Identifiers();
				for( String var : varList){
					SortVariable sVar = new SortVariable();
					sVar.setType(TYPE.simple);
					sVar.setParentName(var);
					lVariables.add(sVar);
				}
			}
			if(ctx.unpacked_dimension() != null && ctx.unpacked_dimension().size() >0){
				BailoutRule(ctx.getClass().getName(), ctx.getText());
			}
			if(ctx.constant_param_expression() != null && ctx.constant_param_expression().size() >0){
				for(int index=0 ; index < ctx.constant_param_expression().size();index++) {
					List<String> varList = ctx.constant_param_expression().get(index).extendedContext.Identifiers();
					for( String var : varList){
						SortVariable sVar = new SortVariable();
						sVar.setType(TYPE.simple);
						sVar.setParentName(var);
						rVariables.add(sVar);
					}
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
}
