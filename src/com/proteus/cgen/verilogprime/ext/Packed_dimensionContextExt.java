package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Packed_dimensionContext;

public class Packed_dimensionContextExt extends AbstractBaseExt{

	@Getter private Packed_dimensionContext ctx;

	public Packed_dimensionContextExt(Packed_dimensionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).packed_dimension());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Packed_dimensionContext){
				this.ctx = (Packed_dimensionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Packed_dimensionContext.class.getName());
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
			List<String> varList = ctx.extendedContext.Identifiers();
			for( String var : varList){
				SortVariable sVar = new SortVariable();
				sVar.setType(TYPE.simple);
				sVar.setParentName(var);
				rVariables.add(sVar);
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
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String funtionalityName){
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
