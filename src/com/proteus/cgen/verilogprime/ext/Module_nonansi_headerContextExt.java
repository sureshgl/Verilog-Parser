package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_nonansi_headerContext;

public class Module_nonansi_headerContextExt extends AbstractBaseExt{

	@Getter private Module_nonansi_headerContext ctx;

	public Module_nonansi_headerContextExt(Module_nonansi_headerContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_nonansi_header());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_nonansi_headerContext){
				this.ctx = (Module_nonansi_headerContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_nonansi_headerContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	public String getName(){
		return ctx.module_identifier().getText();
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
			if(ctx.list_of_ports() != null) {
				List<String> varList = ctx.extendedContext.Identifiers();
				for( String var : varList){
					SortVariable sVar = new SortVariable();
					sVar.setType(TYPE.simple);
					sVar.setParentName(var);
					lVariables.add(sVar);
				}
			} else {
				BailoutRule(ctx.getClass().getName(), ctx.extendedContext.getFormattedText());
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
