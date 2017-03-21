package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.Statement;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Genvar_iterationContext;

public class Genvar_iterationContextExt extends AbstractBaseExt{

	@Getter private Genvar_iterationContext ctx;

	public Genvar_iterationContextExt(Genvar_iterationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).genvar_iteration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Genvar_iterationContext){
				this.ctx = (Genvar_iterationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Genvar_iterationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

//	@Override
//	public List<IStatement> PopulateStatements(){
//		List<IStatement> iStatements = new ArrayList<IStatement>();
//		if(ctx != null){
//			
//			Statement statement = new Statement(new HashSet<String>(), new HashSet<String>(), ctx);
//			iStatements.add(statement);
//		}
//		if(iStatements.size()>0){
//			return iStatements;
//		} else {
//			return null;
//		}
//	}
}
