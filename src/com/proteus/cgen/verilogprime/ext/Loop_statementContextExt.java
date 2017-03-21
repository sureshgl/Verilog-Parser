package com.proteus.cgen.verilogprime.ext;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.Range;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_compContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.For_step_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Loop_statementContext;

public class Loop_statementContextExt extends AbstractBaseExt{

	@Getter private Loop_statementContext ctx;
	private static final Logger L = LoggerFactory.getLogger(Loop_statementContextExt.class);
	
	public Loop_statementContextExt(Loop_statementContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).loop_statement());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Loop_statementContext){
				this.ctx = (Loop_statementContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Loop_statementContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void Statements_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
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
			if(childStatements != null){
				for(IStatement childStatement : childStatements) {
					lVariables.addAll(childStatement.getLeftVariables());
					rVariables.addAll(childStatement.getRightVariables());
				}
				if(ctx.for_initialization() != null){
					List<String> initVar = ctx.for_initialization().extendedContext.Identifiers();
					if(initVar != null){
						for(String var : initVar){
							for (Iterator<SortVariable> iterator = lVariables.iterator(); iterator.hasNext();) {
								if(iterator.next().getParentName().equals(var)){
									iterator.remove();
								}
							}
						}
					}
				}
				Range range = new Range();
				String upperlimit = null;
				if(ctx.expression() != null && ctx.expression() instanceof Expression_compContext){
					Expression_compContext expression_compContext = (Expression_compContext) ctx.expression();
					upperlimit = expression_compContext.expression(1).getText();
				}
				String iterator = "";
				if(ctx.for_step() != null && ctx.for_step().for_step_assignment().size()>0){
					List<For_step_assignmentContext> for_step_assignmentContexts = ctx.for_step().for_step_assignment();
					for(For_step_assignmentContext fctx : for_step_assignmentContexts ){
						if(fctx.operator_assignment() != null) {
							String lvar="";
							if(fctx.operator_assignment().expression() instanceof Expression_compContext) {
								Expression_compContext expression_compContext = (Expression_compContext) fctx.operator_assignment().expression();
								String left = expression_compContext.expression(0).getText();
								String right = expression_compContext.expression(1).getText();
								if(expression_compContext.getText().contains("+")){
									iterator = "+";
								}else if(expression_compContext.getText().contains("-")){
									iterator = "-";
								}
								if(lvar.contains(right)){
									iterator = iterator+left;
								}else if (lvar.contains(left)){
									iterator = iterator+right;
								} else {
									BailoutRule(ctx.getClass().getName(), "hitting other expressions");
								}
							}
							if(fctx.operator_assignment().variable_lvalue().hierarchical_variable_identifier() != null){
								lvar = fctx.operator_assignment().variable_lvalue().hierarchical_variable_identifier().getText();
							}
						} else if (fctx.inc_or_dec_expression() != null){
							if (fctx.inc_or_dec_expression().inc_or_dec_expression_part1() != null) {
								if (fctx.inc_or_dec_expression().inc_or_dec_expression_part1().inc_or_dec_operator().increment() != null) {
									iterator = "+1";
								} else if (fctx.inc_or_dec_expression().inc_or_dec_expression_part1().inc_or_dec_operator().decrement() != null) {
									iterator = "-1";
								}
							}else{
								if(fctx.inc_or_dec_expression().inc_or_dec_operator() != null){
									if(fctx.inc_or_dec_expression().inc_or_dec_operator().increment() != null ){
										iterator = "+1";
									} else if (fctx.inc_or_dec_expression().inc_or_dec_operator().decrement() != null ){
										iterator = "-1";
									}
								}
							}
						} else {
							BailoutRule(ctx.getClass().getName(), "Rule not yet implemented");
						}
					}
				}
				String init="";
				//TODO recheck
				if(ctx.for_initialization().list_of_variable_assignments()!= null){
//					L.info("Declaration not found, please check if cyclic");
				} else if(ctx.for_initialization().for_variable_declaration(0) != null ){
					init = ctx.for_initialization().for_variable_declaration(0).expression(0).getText();
					if(!init.matches("-?\\d+(\\.\\d+)?")){
						L.info(ctx.for_initialization().getText() + "for initialization contains variables");
					}
				}
				range.setInit(init);
				range.setIterator(iterator);
				range.setUpper(upperlimit);

				for(SortVariable variable : lVariables){
					if(variable.getCompleteVar()!=null){
						variable.setIndexRange(range);
					}
				}
				for(SortVariable variable : rVariables){
					if(variable.getCompleteVar()!=null){
						variable.setIndexRange(range);
					}
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
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		StringBuilder sb = new StringBuilder();
		if(ctx.statement_or_null() != null){
			String statement_or_nullCString = ctx.statement_or_null().extendedContext.getAssignString(classObj, moduleToParameters,functionalityName);
			if(statement_or_nullCString != null){
				if(ctx.foreverstr() != null){
					sb.append("forever ");
					sb.append(statement_or_nullCString);
				} else if(ctx.repeatstr() != null){
					sb.append("repeat("+ctx.expression().extendedContext.getFormattedText()+")");
					sb.append("\n"+statement_or_nullCString);
				} else if(ctx.whilestr() != null){
					sb.append("while("+ctx.expression().extendedContext.getFormattedText()+")");
					sb.append("\n"+statement_or_nullCString);
				} else if(ctx.forstr() != null){
					sb.append("for("+ctx.for_initialization().extendedContext.getFormattedText().replace("integer", "int")+";");
					sb.append(ctx.expression().extendedContext.getFormattedText()+";");
					sb.append(ctx.for_step().extendedContext.getFormattedText()+")\n");
					sb.append(statement_or_nullCString);
				} else if(ctx.dostr() != null){
					sb.append("do\n");
					sb.append(statement_or_nullCString);
					sb.append("\nwhile("+ctx.expression().extendedContext.getFormattedText()+");");
				}
			} else {
				return null;
			}
		}
		if(ctx.statement() != null){
			String statementCString = ctx.statement().extendedContext.getAssignString(classObj, moduleToParameters,functionalityName);
			if(statementCString != null){
				sb.append("foreach("+ctx.ps_or_hierarchical_array_identifier().extendedContext.getFormattedText()+" ");
				if(ctx.loop_variables() != null){
					sb.append(ctx.loop_variables().extendedContext.getFormattedText());
				}
				sb.append(")\n"+statementCString);
			} else {
				return null;
			}
		}
		if(sb.toString().equals("")){
			return null;
		} else {
			return sb.toString();
		}
	}	
}
