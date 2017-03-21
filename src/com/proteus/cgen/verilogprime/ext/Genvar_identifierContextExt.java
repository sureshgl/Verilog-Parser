package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Genvar_identifierContext;

public class Genvar_identifierContextExt extends AbstractBaseExt{

	@Getter private Genvar_identifierContext ctx;

	public Genvar_identifierContextExt(Genvar_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).genvar_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Genvar_identifierContext){
				this.ctx = (Genvar_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Genvar_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	public void PopulateStatements(List<IStatement> statements){
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();
			List<String> varList = ctx.extendedContext.Identifiers();
			for( String var : varList){
				SortVariable sVar = new SortVariable();
				sVar.setType(TYPE.simple);
				sVar.setParentName(var);
				lVariables.add(sVar);
			}
			Statement statement = new Statement(lVariables, rVariables, ctx);
			statements.add(statement);
		}
	}
}
