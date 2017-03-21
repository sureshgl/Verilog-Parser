package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.io.File;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Initial_constructContext;

public class Initial_constructContextExt extends AbstractBaseExt{

	@Getter private Initial_constructContext ctx;

	public Initial_constructContextExt(Initial_constructContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).initial_construct());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Initial_constructContext){
				this.ctx = (Initial_constructContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Initial_constructContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void Blocks_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			super.Blocks_to_null();
			addToContexts(null);
		}
	}
	
	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();
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
}
