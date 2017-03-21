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
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Package_or_generate_item_declarationContext;

public class Package_or_generate_item_declarationContextExt extends AbstractBaseExt{

	@Getter private Package_or_generate_item_declarationContext ctx;

	public Package_or_generate_item_declarationContextExt(Package_or_generate_item_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).package_or_generate_item_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Package_or_generate_item_declarationContext){
				this.ctx = (Package_or_generate_item_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Package_or_generate_item_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			if(ctx.parameter_declaration() != null || ctx.data_declaration() != null 
					|| ctx.net_declaration() != null){
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();
				List<IStatement> childStatements = super.PopulateStatements(functionalityName);
				if(childStatements != null){
					for(IStatement childStatement : childStatements) {
						lVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
					}
					Statement statement = new Statement(lVariables, rVariables, ctx);
					iStatements.add(statement);
				}
			} else {
				BailoutRule(ctx.getClass().getName(), ctx.getText());
			}
		}
		if(iStatements.size()>0){
			return iStatements;
		} else {
			return null;
		}
	}
}
