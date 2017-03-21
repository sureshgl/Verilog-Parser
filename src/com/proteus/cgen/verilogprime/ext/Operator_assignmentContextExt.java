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
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bit_selectContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_expressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_multContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Indexed_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Operator_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_lvalueContext;

public class Operator_assignmentContextExt extends AbstractBaseExt{

	@Getter private Operator_assignmentContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Operator_assignmentContextExt(Operator_assignmentContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).operator_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Operator_assignmentContext){
				this.ctx = (Operator_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Operator_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void paint(SymbolTable st,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			String beforeEval = getFormattedText();
			super.eval(st);
			String afterEval =  getFormattedText();
			Variable_lvalueContext variable_lvalueContext = (Variable_lvalueContext)ctx.variable_lvalue().extendedContext.getContext();
			Boolean forward = null;
			if(variable_lvalueContext.hierarchical_variable_identifier() == null) {
				forward = false;
			} else if(st.containsKey(variable_lvalueContext.hierarchical_variable_identifier().getText())){
				forward = true;
			} else {
				forward = false;
			}
			if((!beforeEval.equals(afterEval)) || forward){
				String expression = ctx.expression().extendedContext.getFormattedText();
				String lvalue;
				if(variable_lvalueContext.hierarchical_variable_identifier() == null){
					lvalue = variable_lvalueContext.extendedContext.getFormattedText();
				} else {
					lvalue = variable_lvalueContext.hierarchical_variable_identifier().getText();
				}
				expression = st.containsKey(expression) ? st.get(expression) : expression;
				lvalue = st.containsKey(lvalue) ? st.get(lvalue) : lvalue;
				try{
					Float.parseFloat(expression);
					try{
						Float.parseFloat(lvalue);
					}catch(NumberFormatException exception){
						if(variable_lvalueContext.select() == null || variable_lvalueContext.select().getText().equals("") )
							st.put(lvalue,"0");
					}
					if(!pragma_fn_statement_skip.contains(functionalityName))
						pragma_fn_statement_skip.add(functionalityName);
				}catch(NumberFormatException exception){
					try{
						Float.parseFloat(lvalue);
						if(!pragma_fn_statement_skip.contains(functionalityName))
							pragma_fn_statement_skip.add(functionalityName);
					}catch(NumberFormatException exception1){

					}
				}
			}
			undoEvaluatedStrings();
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(ctx != null){
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();
				if(ctx.variable_lvalue() != null ){
					List<IStatement> childStatements = ctx.variable_lvalue().extendedContext.PopulateStatements(functionalityName);
					for(IStatement childStatement : childStatements) {
						lVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
					}
				}
				if(ctx.expression() != null){
					List<IStatement> childStatements = ctx.expression().extendedContext.PopulateStatements(functionalityName);
					for(IStatement childStatement : childStatements) {
						rVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
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
		} else {
			return null;
		}
	}

	//TODO GL has to review this
	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			if(ctx != null) {
				boolean isIndexed = false;
				boolean simpleExp = true;
				if(ctx.variable_lvalue() != null){
					if(ctx.variable_lvalue().hierarchical_variable_identifier() != null) {
						params.getStringBuilder().append(ctx.variable_lvalue().hierarchical_variable_identifier().extendedContext.getCString(classObj, moduleToParameters, functionalityName));
					}
					if(ctx.variable_lvalue().select() != null && ctx.variable_lvalue().package_scope() == null && ctx.variable_lvalue().implicit_class_handle() ==null) {
						if(ctx.variable_lvalue().select().bit_select(0).getText().length() >0) {
							List<Bit_selectContext> bit_selectContexts = ctx.variable_lvalue().select().bit_select();
							for (Bit_selectContext bctx : bit_selectContexts)
								params.getStringBuilder().append(bctx.extendedContext.getFormattedText());
						} else
							if(ctx.variable_lvalue().select().part_select_range() != null){
								if(ctx.variable_lvalue().select().part_select_range().indexed_range() != null){
									Indexed_rangeContext indexed_rangeContext = ctx.variable_lvalue().select().part_select_range().indexed_range();
									if(indexed_rangeContext.pluscolon() != null){
										if (indexed_rangeContext.expression() != null && indexed_rangeContext.constant_expression() != null) {
											String ex_multiplier = null, ex_variable = null, cnst_variable = null;
											isIndexed = true;

											// qcnt_afout[prt_var][i*(BITFIFO+1)+:BITFIFO+1] = qcnt_fout_wire[prt_var][i*(BITFIFO+1)+:BITFIFO+1]
											cnst_variable = indexed_rangeContext.constant_expression().extendedContext.getFormattedText();

											if(indexed_rangeContext.expression() instanceof Expression_multContext){
												Expression_multContext expression_multContext = (Expression_multContext) indexed_rangeContext.expression() ;
												List<ExpressionContext> expressionContexts = (List<ExpressionContext>) expression_multContext.expression();
												if(expressionContexts != null && expressionContexts.size() == 2) {
													ex_multiplier = expressionContexts.get(0).extendedContext.getFormattedText();
													ex_variable = expressionContexts.get(1).extendedContext.getFormattedText();
												} else {
													BailoutRule(ctx.getClass().getName(), "Expression ctxs size is not equals to 2");
												}
												//											if(ex_variable.replaceAll("\\s+","").equals(cnst_variable.replaceAll("\\s+",""))){
												simpleExp =false;
												params.getStringBuilder().append(ctx.variable_lvalue().select().bit_select(0).extendedContext.getCString(classObj, moduleToParameters, functionalityName));
												params.getStringBuilder().append(".set(("+ex_multiplier+")*"+ex_variable+", (("+ex_multiplier+"+1) * "+ ex_variable+")-1, ");
											} else {
												BailoutRule(ctx.getClass().getName(), "Hitting other rules (nt Expression_multContext)");
											}
											// wadr.get(   (wi)*BITADDR, (((wi+1)*BITADDR) -1)   );

										} else {
											BailoutRule(ctx.getClass().getName(), "Hitting other rules (nt cnst exp , exp)");
										}
									} else {
										BailoutRule(ctx.getClass().getName(), "pluscolon (+:) not found ");
									}
								} else if (ctx.variable_lvalue().select().part_select_range().constant_range() != null){
									String right = null, left = null;
									List<Constant_expressionContext> constant_expressionContexts = ctx.variable_lvalue().select().part_select_range().constant_range().constant_expression();
									if(constant_expressionContexts != null && constant_expressionContexts.size() >0){
										//						for(int i=0; i< constant_expressionContexts.size(); i++) {
										if(constant_expressionContexts.size() == 2){
											right = constant_expressionContexts.get(0).extendedContext.getFormattedText();
											left = constant_expressionContexts.get(1).extendedContext.getFormattedText();
										}
										if(left != null && right != null){
											params.getStringBuilder().append(ctx.variable_lvalue().select().bit_select(0).extendedContext.getCString(classObj, moduleToParameters, functionalityName));
											params.getStringBuilder().append(".set("+left+","+right +", ");
											simpleExp = false;
											isIndexed = true;
										}
									}

								} else {
									BailoutRule(ctx.getClass().getName(), ctx.getText());
								}
							} 
							else if(ctx.variable_lvalue().select().getText().length() > 0){
								BailoutRule(ctx.getClass().getName(), "hitting other rules"+ctx.getText());
							}
					} else {
						BailoutRule(ctx.getClass().getName(), "Hitting other rules in Variable lvalue"+ctx.getText());
					}
				} else {
					BailoutRule(ctx.getClass().getName(), "Variable lvalue is null"+ctx.getText());
				}

				if(ctx.expression() != null){
					if(simpleExp)
						params.getStringBuilder().append(" "+ctx.assignment_operator().getText()+" ");
					String exp = ctx.expression().extendedContext.getCString(classObj, moduleToParameters, functionalityName);
					params.getStringBuilder().append(exp);
					if(isIndexed)
						params.getStringBuilder().append(")");
					params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
				}
			}
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters, String fucntionalityName){
		return null;
	}
}
