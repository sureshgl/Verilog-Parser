package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_lvalueContext;

public class Variable_lvalueContextExt extends AbstractBaseExt{

	@Getter private Variable_lvalueContext ctx;

	public Variable_lvalueContextExt(Variable_lvalueContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).variable_lvalue());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Variable_lvalueContext){
				this.ctx = (Variable_lvalueContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Variable_lvalueContext.class.getName());
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
			if(ctx.hierarchical_variable_identifier() != null) {
				SortVariable sVar = new SortVariable();
				SortVariable sVarRight = new SortVariable();
				sVar.setParentName(ctx.hierarchical_variable_identifier().getText());
				if(ctx.select() != null && ctx.select().getText().length() >0){
					sVar.setType(TYPE.complex);
					sVar.setCompleteVar(ctx.getText());
					List<String> selects = ctx.select().extendedContext.Identifiers();
					for(String tmp: selects){
						sVarRight.setParentName(tmp);
						sVarRight.setType(TYPE.simple);
						rVariables.add(sVarRight);
					}
				} else {
					sVar.setType(TYPE.simple);
				}
				lVariables.add(sVar);
				
				
			}else{
				BailoutRule(ctx.getClass().getName(),"Hitting other rules");
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
