package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.If_generate_constructContext;

public class If_generate_constructContextExt extends AbstractBaseExt{

	@Getter private If_generate_constructContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public If_generate_constructContextExt(If_generate_constructContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).if_generate_construct());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof If_generate_constructContext){
				this.ctx = (If_generate_constructContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+If_generate_constructContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void evaluateConditionalExpression(SymbolTable st,String functionalityName){
		super.evaluateConditionalExpression(st, functionalityName);
		ctx.constant_expression().extendedContext.eval(st);
		if(ctx.constant_expression().extendedContext.getFormattedText().equals("0")){
			ctx.generate_block(0).extendedContext.pragma_fn_statement_skip.add(functionalityName);
		}
		undoEvaluatedStrings();
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters, String fName){
		if(!pragma_fn_statement_skip.contains(fName)){
			StringBuilder sb = new StringBuilder();
			String temp  = ctx.generate_block(0).extendedContext.getAssignString(classObj, moduleToParameters, fName);
			if(temp != null){
				sb.append("if("+ctx.constant_expression().extendedContext.getCString(classObj, moduleToParameters,fName)+"){\n");
				sb.append(temp+"\n}\n");
			}
			if(ctx.elsestr() != null){
				String temp1 = ctx.generate_block(1).extendedContext.getAssignString(classObj, moduleToParameters,fName);
				if(temp1 != null){
					if(sb.toString().equals("")){
						sb.append(temp1+"\n");
					} else {
						sb.append("else{\n");
						sb.append(ctx.generate_block(1).extendedContext.getCString(classObj, moduleToParameters,fName)+"\n}\n");
					}
				}
			}
			if(sb.toString().equals("")){
				return null;
			} else {
				return sb.toString();
			}
		} 
		else {
			return null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters, String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			StringBuilder sb = new StringBuilder();
			if(!ctx.generate_block(0).extendedContext.pragma_fn_statement_skip.contains(functionalityName)){
				sb.append("if("+ctx.constant_expression().extendedContext.getCString(classObj, moduleToParameters, functionalityName)+")\n");
				sb.append(ctx.generate_block(0).extendedContext.getCString(classObj, moduleToParameters, functionalityName)+"\n");
			}
			if(!ctx.generate_block(1).extendedContext.pragma_fn_statement_skip.contains(functionalityName)){
				if(!sb.toString().equals("")){
					sb.append(" else\n");
				}
				sb.append(ctx.generate_block(1).extendedContext.getCString(classObj, moduleToParameters, functionalityName)+"\n");
			}
			params.getStringBuilder().append(sb.toString());
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
		else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(ctx != null){
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
			}
			if(iStatements.size()>0){
				return iStatements;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

}
