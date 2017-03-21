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
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Genvar_initializationContext;

public class Genvar_initializationContextExt extends AbstractBaseExt{

	@Getter private Genvar_initializationContext ctx;

	public Genvar_initializationContextExt(Genvar_initializationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).genvar_initialization());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Genvar_initializationContext){
				this.ctx = (Genvar_initializationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Genvar_initializationContext.class.getName());
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
			
			if(ctx.genvar_identifier() != null) {
				List<String> varList = ctx.genvar_identifier().extendedContext.Identifiers();
				for( String var : varList){
					SortVariable sVar = new SortVariable();
					sVar.setType(TYPE.simple);
					sVar.setParentName(var);
					lVariables.add(sVar);
				}
			}
			if(ctx.constant_expression() != null){
				List<String> varList = ctx.constant_expression().extendedContext.Identifiers();
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
	}
}
