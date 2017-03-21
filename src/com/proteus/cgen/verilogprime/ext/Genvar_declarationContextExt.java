package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Genvar_declarationContext;

public class Genvar_declarationContextExt extends AbstractBaseExt{

	@Getter private Genvar_declarationContext ctx;

	public Genvar_declarationContextExt(Genvar_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).genvar_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Genvar_declarationContext){
				this.ctx = (Genvar_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Genvar_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void Statements_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			super.Statements_to_null();
			addToContexts(null);
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();
			List<String> varList = ctx.list_of_genvar_identifiers().extendedContext.Identifiers();
			for( String var : varList){
				SortVariable sVar = new SortVariable();
				sVar.setType(TYPE.simple);
				sVar.setParentName(var);
				lVariables.add(sVar);
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
	protected void getCString(Params params ,CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		//int i; i= kiwibitset (1,0)) we cannot create i with size 64 so we do as int
		params.getStringBuilder().append("int " + ctx.list_of_genvar_identifiers().extendedContext.getCString(classObj,moduleToParameters,functionalityName) + ";\n");
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
	
	@Override
	protected Boolean returnModuleItem(){
		return true;
	}

}
