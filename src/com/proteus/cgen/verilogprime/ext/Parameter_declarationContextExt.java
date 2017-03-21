package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Parameter_declarationContext;

public class Parameter_declarationContextExt extends AbstractBaseExt{

	@Getter private Parameter_declarationContext ctx;

	public Parameter_declarationContextExt(Parameter_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).parameter_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Parameter_declarationContext){
				this.ctx = (Parameter_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Parameter_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void Statements_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			addToContexts(null);
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();
			if(ctx.list_of_type_assignments() != null){
				BailoutRule(ctx.getClass().getName(), ctx.getText());
			}
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
	}

	@Override
	protected Boolean returnModuleItem(){
		return false;
	}
}
