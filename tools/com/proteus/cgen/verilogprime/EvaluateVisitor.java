package com.proteus.cgen.verilogprime;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.cgen.verilogprime.ext.AbstractBaseExt;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Evaluatable;
import com.proteus.cgen.verilogprime.ext.Constant_expressionContextExt;
import com.proteus.cgen.verilogprime.ext.ExpressionContextExt;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ConcatenationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_addContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_binary_andContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_binary_orContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_binary_xorContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_compContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_conditionalContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_equalityContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_log_andContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_log_orContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_mutlContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_only_primaryContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_shiftContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_st_stContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_unary_opContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_expressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_mintypmax_expressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_primaryContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_addContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_binary_andContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_binary_orContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_binary_xorContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_compContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_conditional_expContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_equalityContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_inc_or_decContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_inside_expContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_log_andContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_log_orContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_multContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_only_primaryContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_op_assignContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_shiftContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_st_stContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_tagged_unionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_unary_opContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Function_subroutine_callContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Mintypmax_expressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.NumberContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Operator_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.PrimaryContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Primary_literalContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Primary_no_function_callContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.SelectContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParserBaseVisitor;

public class EvaluateVisitor extends VerilogPrimeParserBaseVisitor<String> {

	private static final Logger L = LoggerFactory.getLogger(EvaluateVisitor.class);
	SymbolTable symbolTable;

	public EvaluateVisitor(SymbolTable symbolTable){
		this.symbolTable = symbolTable;
	}

	@Override public String visitConst_expr_binary_and(Const_expr_binary_andContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_binary_andContext const_expr_binary_andContext = (Const_expr_binary_andContext)ctx.extendedContext.getContext();
		if(const_expr_binary_andContext != null){
			if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_binary_andContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) const_expr_binary_andContext.constant_expression(0).extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_binary_andContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						return Integer.toString(lhs.intValue()&rhs.intValue());
					}
					else
					{
						throw new IllegalArgumentException(ctx.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(ctx.getText());
				}
			} else if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0") 
					|| 
					(ctx.constant_expression(1).extendedContext.getFormattedText().equals("0")) 
					){
				return "0";
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_mutl(Const_expr_mutlContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_mutlContext const_expr_mutlContext = (Const_expr_mutlContext) ctx.extendedContext.getContext();
		if(const_expr_mutlContext != null){
			if(const_expr_mutlContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_mutlContext.constant_expression(0).extendedContext.getContext();
				if(ctx1.extendedContext.getFormattedText().equals("0")){
					return "0";
				}
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_mutlContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = null;
						if(const_expr_mutlContext.star() != null){
							ret = lhs.intValue()*rhs.intValue();
						} else if(const_expr_mutlContext.div() != null){
							ret = lhs.intValue()/rhs.intValue();
						} else if(const_expr_mutlContext.modulo() != null){
							ret = lhs.intValue()%rhs.intValue();
						}
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(const_expr_mutlContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_mutlContext.getText());
				}
			} else if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0")){
				return "0";
			}else if(ctx.constant_expression(1).extendedContext.getFormattedText().equals("0")){
				if(const_expr_mutlContext.star() != null){
					return "0";
				} else if(const_expr_mutlContext.div() != null){
					throw new IllegalArgumentException("Devide by Zero at "+ctx.extendedContext.getFormattedText());
				} else if(const_expr_mutlContext.modulo() != null){
					return ctx.constant_expression(0).extendedContext.getFormattedText();
				}
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		}else {
			return ctx.extendedContext.getFormattedText();
		}
		return ctx.extendedContext.getFormattedText();
	}

	@Override public String visitConst_expr_add(Const_expr_addContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_addContext const_expr_addContext = (Const_expr_addContext) ctx.extendedContext.getContext();
		if(const_expr_addContext != null){
			if(const_expr_addContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_addContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_addContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = null;
						if(const_expr_addContext.plus() != null){
							ret = lhs.intValue() + rhs.intValue();
						} else if(const_expr_addContext.minus() != null){
							ret = lhs.intValue() - rhs.intValue();
						}
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(const_expr_addContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_addContext.getText());
				}
			} else if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0")){
				if(const_expr_addContext.plus() != null){
					return ctx.constant_expression(1).extendedContext.getFormattedText();
				}
			}else if(ctx.constant_expression(1).extendedContext.getFormattedText().equals("0")){
				if(const_expr_addContext.plus() != null){
					return ctx.constant_expression(0).extendedContext.getFormattedText();
				}
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		}else {
			return ctx.extendedContext.getFormattedText();
		}
		return ctx.extendedContext.getFormattedText();
	}


	@Override public String visitConst_expr_equality(Const_expr_equalityContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_equalityContext const_expr_equalityContext  = (Const_expr_equalityContext) ctx.extendedContext.getContext();
		if(const_expr_equalityContext != null){
			if(const_expr_equalityContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_equalityContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_equalityContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						String ret = null;
						if(const_expr_equalityContext.equals() != null){
							ret = (lhs.intValue() == rhs.intValue())?"1":"0";
						} else if(const_expr_equalityContext.not_equals() != null){
							ret = (lhs.intValue() != rhs.intValue())?"1":"0";
						}else if(const_expr_equalityContext.case_equality() != null){
							ret = lhs.toString() + " "  + ctx.case_equality().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(const_expr_equalityContext.case_inequality() != null){
							ret = lhs.toString() + " "  + ctx.case_inequality().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(const_expr_equalityContext.case_q() != null){
							ret = lhs.toString() + " "  + ctx.case_q().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(const_expr_equalityContext.not_case_q() != null){
							ret = lhs.toString() + " "  + ctx.not_case_q().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}
						return ret;
					}
					else
					{
						throw new IllegalArgumentException(const_expr_equalityContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_equalityContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_comp(Const_expr_compContext ctx) {
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_compContext const_expr_compContext = (Const_expr_compContext) ctx.extendedContext.getContext();
		if(const_expr_compContext != null){
			if(const_expr_compContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_compContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_compContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = null;
						if(const_expr_compContext.lt() != null){
							ret = (lhs.intValue() < rhs.intValue())?1:0;
						} else if(const_expr_compContext.gt() != null){
							ret = (lhs.intValue() > rhs.intValue())?1:0;
						}else if(const_expr_compContext.le() != null){
							ret = (lhs.intValue() <= rhs.intValue())?1:0;
						}else if(const_expr_compContext.ge() != null){
							ret = (lhs.intValue() >= rhs.intValue())?1:0;
						}
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(const_expr_compContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_compContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_log_or(Const_expr_log_orContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_log_orContext const_expr_log_orContext  = (Const_expr_log_orContext) ctx.extendedContext.getContext();
		if(const_expr_log_orContext != null){
			if(const_expr_log_orContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_log_orContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_log_orContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret =  (lhs.intValue()>0 || rhs.intValue()>0)?1:0;
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(const_expr_log_orContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_log_orContext.getText());
				}
			} else if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0")){
				return ctx.constant_expression(1).extendedContext.getFormattedText();
			}else if(ctx.constant_expression(1).extendedContext.getFormattedText().equals("0")){
				return ctx.constant_expression(0).extendedContext.getFormattedText();
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_binary_or(Const_expr_binary_orContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_binary_orContext const_expr_binary_orContext = (Const_expr_binary_orContext) ctx.extendedContext.getContext();
		if(const_expr_binary_orContext != null){
			if(const_expr_binary_orContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_binary_orContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_binary_orContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = lhs.intValue()|rhs.intValue();
						return ret.toString();
					}
					else
					{
						throw new IllegalArgumentException(const_expr_binary_orContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_binary_orContext.getText());
				}
			} else if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0")){
				return ctx.constant_expression(1).extendedContext.getFormattedText();
			}else if(ctx.constant_expression(1).extendedContext.getFormattedText().equals("0")){
				return ctx.constant_expression(0).extendedContext.getFormattedText();
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		}else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_only_primary(Const_expr_only_primaryContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_only_primaryContext const_expr_only_primaryContext = (Const_expr_only_primaryContext)ctx.extendedContext.getContext();
		if(const_expr_only_primaryContext != null){
			if(const_expr_only_primaryContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_primaryContext Constant_primaryContext = (Constant_primaryContext)const_expr_only_primaryContext.constant_primary().extendedContext.getContext();
				if(Constant_primaryContext != null){
					return Constant_primaryContext.extendedContext.getFormattedText();
				}
			} 
			return ctx.extendedContext.getFormattedText();
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_binary_xor(Const_expr_binary_xorContext ctx) {
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_binary_xorContext const_expr_binary_xorContext = (Const_expr_binary_xorContext) ctx.extendedContext.getContext();
		if(const_expr_binary_xorContext != null){
			if(const_expr_binary_xorContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_binary_xorContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_binary_xorContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						String ret = null;
						if(const_expr_binary_xorContext.xor() != null){
							ret = lhs.toString() + " " + ctx.xor().getText() + " " + rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						} else if(const_expr_binary_xorContext.xnor() != null){
							ret = lhs.toString() + " " + ctx.xnor().getText() + " " + rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(const_expr_binary_xorContext.xorn() != null){
							ret = lhs.toString() + " " + ctx.xorn().getText() + " " + rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}
						return ret;
					}
					else
					{
						throw new IllegalArgumentException(const_expr_binary_xorContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_binary_xorContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		}else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_log_and(Const_expr_log_andContext ctx) {
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_log_andContext const_expr_log_andContext = (Const_expr_log_andContext) ctx.extendedContext.getContext();
		if(const_expr_log_andContext != null){
			if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0") 
					|| 
					(ctx.constant_expression(1).extendedContext.getFormattedText().equals("0")) 
					){
				return "0";
			} else if(const_expr_log_andContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_log_andContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_log_andContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret =  (lhs.intValue()>0 && rhs.intValue()>0)?1:0;
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(const_expr_log_andContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_log_andContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_shift(Const_expr_shiftContext ctx) {
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0") ){
			return "0";
		} else {
			Const_expr_shiftContext const_expr_shiftContext = (Const_expr_shiftContext) ctx.extendedContext.getContext();
			if(const_expr_shiftContext != null){
				if(const_expr_shiftContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
					Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_shiftContext.constant_expression(0).extendedContext.getContext();
					if(ctx1 != null){
						Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
						ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_shiftContext.constant_expression(1).extendedContext.getContext();
						if(ctx2 != null){
							Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
							L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
							L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
							ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
							if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
								return ctx.extendedContext.getFormattedText();
							}
							Integer lhs = Integer.parseInt(arg1.getFormattedText());
							Integer rhs = Integer.parseInt(arg2.getFormattedText());
							Integer ret =  null;
							if(const_expr_shiftContext.lshift() != null || const_expr_shiftContext.alshift() != null){
								ret = lhs.intValue() << rhs.intValue();
							} else if(const_expr_shiftContext.rshift() != null){
								ret = lhs.intValue() >> rhs.intValue();
							} else if(const_expr_shiftContext.arshift() != null){
								ret = lhs.intValue() >>> rhs.intValue();
							}
							return ret.toString();
						}
						else
						{
							throw new IllegalArgumentException(const_expr_shiftContext.getText());
						}
					}
					else
					{
						throw new IllegalArgumentException(const_expr_shiftContext.getText());
					}
				} 
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		}
		return ctx.extendedContext.getFormattedText(); 
	}

	@Override public String visitConst_expr_st_st(Const_expr_st_stContext ctx) {
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_st_stContext const_expr_st_stContext = (Const_expr_st_stContext)ctx.extendedContext.getContext();
		if(const_expr_st_stContext != null){
			if(const_expr_st_stContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				Constant_expressionContext ctx1 = (Constant_expressionContext)const_expr_st_stContext.constant_expression(0).extendedContext.getContext();
				if(ctx1 != null){
					Constant_expressionContextExt operand1ExtendedContext =  (Constant_expressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					Constant_expressionContext ctx2 = (Constant_expressionContext)const_expr_st_stContext.constant_expression(1).extendedContext.getContext();
					if(ctx2 != null){
						Constant_expressionContextExt operand2ExtendedContext =  (Constant_expressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret =  new Double(Math.pow(lhs.intValue(),rhs.intValue())).intValue();
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(const_expr_st_stContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(const_expr_st_stContext.getText());
				}
			}  else if(ctx.constant_expression(0).extendedContext.getFormattedText().equals("0") ){
				return "0";
			} else if(ctx.constant_expression(1).extendedContext.getFormattedText().equals("0") ){
				return "1";
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitConst_expr_conditional(Const_expr_conditionalContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_conditionalContext const_expr_conditionalContext = (Const_expr_conditionalContext) ctx.extendedContext.getContext();
		if(const_expr_conditionalContext != null){
			Constant_expressionContext constant_expressionContext = (Constant_expressionContext) const_expr_conditionalContext.constant_expression(0).extendedContext.getContext();
			if(constant_expressionContext != null && constant_expressionContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				if(Integer.parseInt(constant_expressionContext.extendedContext.getFormattedText()) >0){
					Constant_expressionContext returnConstant_expressionContext = (Constant_expressionContext)const_expr_conditionalContext.constant_expression(1).extendedContext.getContext();
					if(returnConstant_expressionContext != null){
						return ctx.extendedContext.getFormattedText();
					}
				} else {
					Constant_expressionContext returnConstant_expressionContext = (Constant_expressionContext)const_expr_conditionalContext.constant_expression(2).extendedContext.getContext();
					if(returnConstant_expressionContext != null){
						return ctx.extendedContext.getFormattedText();
					}
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
		return ctx.extendedContext.getFormattedText();
	}

	@Override public String visitConst_expr_unary_op(Const_expr_unary_opContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Const_expr_unary_opContext const_expr_unary_opContext = (Const_expr_unary_opContext) ctx.extendedContext.getContext();
		if(const_expr_unary_opContext != null){
			if(const_expr_unary_opContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				String ret = null;
				Constant_primaryContext constant_primaryContext = (Constant_primaryContext) const_expr_unary_opContext.constant_primary().extendedContext.getContext();
				ret = constant_primaryContext.extendedContext.getFormattedText();
				if(const_expr_unary_opContext.unary_operator().plus() != null){
					return ret;
				} else if(const_expr_unary_opContext.unary_operator().minus() != null){
					return "-"+ret;
				}else if(const_expr_unary_opContext.unary_operator().compliment() != null){
					return Integer.toString(~Integer.parseInt(ret));
				} else if(const_expr_unary_opContext.unary_operator().not() != null){
					return (Integer.parseInt(ret)>0)?"0":"1";
				} else {
					ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
					return const_expr_unary_opContext.extendedContext.getFormattedText();
				}
			}
			else
			{
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//primary
	@Override
	public String visitExpression_only_primary(Expression_only_primaryContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_only_primaryContext expression_only_primaryContext = (Expression_only_primaryContext) ctx.extendedContext.getContext();
		if(expression_only_primaryContext != null && expression_only_primaryContext.primary() != null){
			PrimaryContext primaryContext = (PrimaryContext) expression_only_primaryContext.primary().extendedContext.getContext();
			if(primaryContext != null){
				return visit(primaryContext);
			}
		}
		return ctx.extendedContext.getFormattedText();
	}

	//inc_or_dec_expression
	@Override
	public String visitExpression_inc_or_dec (Expression_inc_or_decContext  ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		return ctx.extendedContext.getFormattedText();
	}

	//tagged_union_expression      
	@Override
	public String visitExpression_tagged_union(Expression_tagged_unionContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		return ctx.extendedContext.getFormattedText();
	}

	//unary_operator attribute_instance* primary 
	@Override 
	public String visitExpression_unary_op(Expression_unary_opContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_unary_opContext expression_unary_opContext = (Expression_unary_opContext) ctx.extendedContext.getContext();
		if(expression_unary_opContext != null){
			if(expression_unary_opContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				PrimaryContext primaryContext = (PrimaryContext) expression_unary_opContext.primary().extendedContext.getContext();
				String ret = primaryContext.extendedContext.getFormattedText();
				if(expression_unary_opContext.unary_operator().plus() != null){
					return ret;
				} else if(expression_unary_opContext.unary_operator().minus() != null){
					return "-"+ret;
				}else if(expression_unary_opContext.unary_operator().compliment() != null){
					return Integer.toString(~Integer.parseInt(ret));
				} else if(expression_unary_opContext.unary_operator().not() != null){
					return (Integer.parseInt(ret)>0)?"0":"1";
				} else {
					ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
					return ctx.extendedContext.getFormattedText();
				}
			}
			else
			{
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//LPAREN operator_assignment RPAREN   
	@Override 
	public String visitExpression_op_assign(Expression_op_assignContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		} 
		//GL Need to test this function.
		Expression_op_assignContext expression_op_assignContext = (Expression_op_assignContext) ctx.extendedContext.getContext();
		if(expression_op_assignContext != null){
			Operator_assignmentContext operator_assignmentContext = (Operator_assignmentContext)expression_op_assignContext.operator_assignment().extendedContext.getContext();
			ExpressionContext exprCtx = (ExpressionContext) operator_assignmentContext.expression().extendedContext.getContext();
			if(expression_op_assignContext.operator_assignment().assignment_operator().getText().equals("=")){
				String key = expression_op_assignContext.operator_assignment().variable_lvalue().extendedContext.getFormattedText();
				String value =  exprCtx.extendedContext.getFormattedText();
				symbolTable.put(key.trim(),value.trim());
			} else {
				if(symbolTable.containsKey(operator_assignmentContext.variable_lvalue().extendedContext.getFormattedText())){
					String expressionStringtoEval = symbolTable.get(operator_assignmentContext.variable_lvalue().extendedContext.getFormattedText()) 
							+ " "
							+operator_assignmentContext.assignment_operator().extendedContext.getFormattedText().replace("=", "") 
							+ " "
							+ exprCtx.extendedContext.getFormattedText();
					ExpressionContext newExpressionContext = (ExpressionContext) expression_op_assignContext.extendedContext.getContext(expressionStringtoEval);
					newExpressionContext.extendedContext.eval(symbolTable);
					String key = operator_assignmentContext.variable_lvalue().extendedContext.getFormattedText();
					String value = newExpressionContext.extendedContext.getFormattedText();
					symbolTable.put(key.trim(),value.trim());
				} else {
					String key = operator_assignmentContext.variable_lvalue().extendedContext.getFormattedText();
					String value = exprCtx.extendedContext.getFormattedText();
					symbolTable.put(key.trim(), value.trim());
				}
			}
			return ctx.extendedContext.getFormattedText();
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression starstar attribute_instance* expression
	@Override 
	public String visitExpression_st_st(Expression_st_stContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_st_stContext expression_st_stContext = (Expression_st_stContext) ctx.extendedContext.getContext();
		if(expression_st_stContext != null){
			if(expression_st_stContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_st_stContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_st_stContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret =  new Double(Math.pow(lhs.intValue(),rhs.intValue())).intValue();
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(expression_st_stContext.expression(1).getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_st_stContext.expression(0).getText());
				}
			}else if(ctx.expression(0).extendedContext.getFormattedText().equals("0") ){
				return "0";
			} else if(ctx.expression(1).extendedContext.getFormattedText().equals("0") ){
				return "1";
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression (star| div| modulo) attribute_instance* expression 
	@Override 
	public String visitExpression_mult(Expression_multContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_multContext expression_multContext = (Expression_multContext) ctx.extendedContext.getContext();
		if(expression_multContext != null){
			if(expression_multContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_multContext.expression(0).extendedContext.getContext();
				if(ctx1.extendedContext.getFormattedText().equals("0")){
					return "0";
				}
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_multContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = null;
						if(expression_multContext.star() != null){
							ret = lhs.intValue()*rhs.intValue();
						} else if(expression_multContext.div() != null){
							ret = lhs.intValue()/rhs.intValue();
						} else if(expression_multContext.modulo() != null){
							ret = lhs.intValue()%rhs.intValue();
						}
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(expression_multContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_multContext.getText());
				}
			} else if( ctx.expression(0).extendedContext.getFormattedText().equals("0")){
				return "0";
			}else if( ctx.expression(1).extendedContext.getFormattedText().equals("0")){
				if(expression_multContext.star() != null){
					return "0";
				} else if(expression_multContext.div() != null){
					throw new IllegalArgumentException("Devide by Zero at "+ctx.extendedContext.getFormattedText());
				} else if(expression_multContext.modulo() != null){
					return ctx.expression(0).extendedContext.getFormattedText();
				}
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
		return ctx.extendedContext.getFormattedText();
	}

	//expression (plus| minus) attribute_instance* expression
	@Override 
	public String visitExpression_add(Expression_addContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_addContext expression_addContext = (Expression_addContext) ctx.extendedContext.getContext();
		if(expression_addContext != null){
			if(expression_addContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_addContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_addContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = null;
						if(expression_addContext.plus() != null){
							ret = lhs.intValue() + rhs.intValue();
						} else if(expression_addContext.minus() != null){
							ret = lhs.intValue() - rhs.intValue();
						}
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(expression_addContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_addContext.getText());
				}
			} else if(ctx.expression(0).extendedContext.getFormattedText().equals("0")){
				if(expression_addContext.plus() != null){
					return ctx.expression(1).extendedContext.getFormattedText();
				}
			}else if(ctx.expression(1).extendedContext.getFormattedText().equals("0")){
				return ctx.expression(0).extendedContext.getFormattedText();
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
		return ctx.extendedContext.getFormattedText();
	}

	/*expression (LSHIFT| RSHIFT| ALSHIFT| ARSHIFT) attribute_instance* expression*/ 
	@Override 
	public String visitExpression_shift(Expression_shiftContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_shiftContext expression_shiftContext = (Expression_shiftContext) ctx.extendedContext.getContext();
		if(expression_shiftContext != null){
			if(((ExpressionContext)expression_shiftContext.expression(0).extendedContext.getContext()).extendedContext.getFormattedText().equals("0")){
				return "0";
			} else {
				if(expression_shiftContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
					ExpressionContext ctx1 = (ExpressionContext)expression_shiftContext.expression(0).extendedContext.getContext();
					if(ctx1 != null){
						ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
						ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						ExpressionContext ctx2 = (ExpressionContext)expression_shiftContext.expression(1).extendedContext.getContext();
						if(ctx2 != null){
							ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
							L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
							L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
							ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
							if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
								return ctx.extendedContext.getFormattedText();
							}
							Integer lhs = Integer.parseInt(arg1.getFormattedText());
							Integer rhs = Integer.parseInt(arg2.getFormattedText());
							Integer ret =  null;
							if(expression_shiftContext.lshift() != null || expression_shiftContext.alshift() != null){
								ret = lhs.intValue() << rhs.intValue();
							} else if(expression_shiftContext.rshift() != null){
								ret = lhs.intValue() >> rhs.intValue();
							} else if(expression_shiftContext.arshift() != null){
								ret = lhs.intValue() >>> rhs.intValue();
							}
							return ret.toString();
						}
						else
						{
							throw new IllegalArgumentException(expression_shiftContext.getText());
						}
					}
					else
					{
						throw new IllegalArgumentException(expression_shiftContext.getText());
					}
				} else {
					return ctx.extendedContext.getFormattedText();
				} 
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression (lt| GT| LE| GE) attribute_instance* expression 
	@Override 
	public String visitExpression_comp(Expression_compContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_compContext expression_compContext = (Expression_compContext) ctx.extendedContext.getContext();
		if(expression_compContext != null){
			if(expression_compContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_compContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_compContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = null;
						if(expression_compContext.lt() != null){
							ret = (lhs.intValue() < rhs.intValue())?1:0;
						} else if(expression_compContext.gt() != null){
							ret = (lhs.intValue() > rhs.intValue())?1:0;
						}else if(expression_compContext.le() != null){
							ret = (lhs.intValue() <= rhs.intValue())?1:0;
						}else if(expression_compContext.ge() != null){
							ret = (lhs.intValue() >= rhs.intValue())?1:0;
						}
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(expression_compContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_compContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override 
	public String visitExpression_inside_exp(Expression_inside_expContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		return ctx.extendedContext.getFormattedText();
	}

	/*
	 * expression (equals| NOT_equals| case_equality| case_inequality| case_q| NOT_case_q) 
	                attribute_instance* expression        
	 */
	@Override 
	public String visitExpression_equality(Expression_equalityContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_equalityContext expression_equalityContext = (Expression_equalityContext) ctx.extendedContext.getContext();
		if(expression_equalityContext != null){
			if(expression_equalityContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_equalityContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_equalityContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						String ret = null;
						if(expression_equalityContext.equals() != null){
							ret = (lhs.intValue() == rhs.intValue())?"1":"0";
						} else if(expression_equalityContext.not_equals() != null){
							ret = (lhs.intValue() != rhs.intValue())?"1":"0";
						}else if(expression_equalityContext.case_equality() != null){
							ret = lhs.toString() + " "  + ctx.case_equality().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(expression_equalityContext.case_inequality() != null){
							ret = lhs.toString() + " "  + ctx.case_inequality().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
							expression_equalityContext.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(expression_equalityContext.case_q() != null){
							ret = lhs.toString() + " "  + ctx.case_q().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(expression_equalityContext.not_case_q() != null){
							ret = lhs.toString() + " "  + ctx.not_case_q().getText() + " " +rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}
						return ret;
					}
					else
					{
						throw new IllegalArgumentException(expression_equalityContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_equalityContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression (AND) attribute_instance* expression  
	@Override 
	public String visitExpression_binary_and(Expression_binary_andContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_binary_andContext expression_binary_andContext = (Expression_binary_andContext) ctx.extendedContext.getContext();
		if(expression_binary_andContext != null){
			if(expression_binary_andContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_binary_andContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_binary_andContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						return Integer.toString(lhs.intValue()&rhs.intValue());
					}
					else
					{
						throw new IllegalArgumentException(expression_binary_andContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_binary_andContext.getText());
				}
			}  else if(ctx.expression(0).extendedContext.getFormattedText().equals("0") 
					|| 
					(ctx.expression(1).extendedContext.getFormattedText().equals("0")) 
					){
				return "0";
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression (XOR| XNOR|XORN) attribute_instance* expression 
	@Override 
	public String visitExpression_binary_xor(Expression_binary_xorContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_binary_xorContext expression_binary_xorContext = (Expression_binary_xorContext) ctx.extendedContext.getContext();
		if(expression_binary_xorContext != null){
			if(expression_binary_xorContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_binary_xorContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_binary_xorContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						String ret = null;
						if(expression_binary_xorContext.xor() != null){
							ret = lhs.toString() + " " + ctx.xor().getText() + " " + rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						} else if(expression_binary_xorContext.xnor() != null){
							ret = lhs.toString() + " " + ctx.xnor().getText() + " " + rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}else if(expression_binary_xorContext.xorn() != null){
							ret = lhs.toString() + " " + ctx.xorn().getText() + " " + rhs.toString();
							ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
						}
						return ret;
					}
					else
					{
						throw new IllegalArgumentException(expression_binary_xorContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_binary_xorContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression (OR) attribute_instance* expression   
	@Override 
	public String visitExpression_binary_or(Expression_binary_orContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_binary_orContext expression_binary_orContext = (Expression_binary_orContext) ctx.extendedContext.getContext();
		if(expression_binary_orContext != null){
			if(expression_binary_orContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_binary_orContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_binary_orContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret = lhs.intValue()|rhs.intValue();
						return ret.toString();
					}
					else
					{
						throw new IllegalArgumentException(expression_binary_orContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_binary_orContext.getText());
				}
			} else if(ctx.expression(0).extendedContext.getFormattedText().equals("0")){
				return ctx.expression(1).extendedContext.getFormattedText();
			}else if(ctx.expression(1).extendedContext.getFormattedText().equals("0")){
				return ctx.expression(0).extendedContext.getFormattedText();
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression (LOG_AND) attribute_instance* expression               #expression_log_and
	@Override 
	public String visitExpression_log_and(Expression_log_andContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_log_andContext expression_log_andContext = (Expression_log_andContext) ctx.extendedContext.getContext();
		if(expression_log_andContext != null){
			if(ctx.expression(0).extendedContext.getFormattedText().equals("0") 
					|| 
					(ctx.expression(1).extendedContext.getFormattedText().equals("0")) 
					){
				return "0";
			} else if(expression_log_andContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_log_andContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_log_andContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret =  (lhs.intValue()>0 && rhs.intValue()>0)?1:0;
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(expression_log_andContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_log_andContext.getText());
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String  visitExpression_conditional_exp(VerilogPrimeParser.Expression_conditional_expContext ctx) {
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_conditional_expContext expression_conditional_expContext = (Expression_conditional_expContext) ctx.extendedContext.getContext();
		if(expression_conditional_expContext != null){
			ExpressionContext expressionContext = (ExpressionContext) expression_conditional_expContext.expression(0).extendedContext.getContext();
			if(expressionContext != null && expressionContext.extendedContext.getFormattedText().matches("\\d+")){
				if(Integer.parseInt(expressionContext.extendedContext.getFormattedText()) >0){
					ExpressionContext returnExpressionContext = (ExpressionContext)expression_conditional_expContext.expression(1).extendedContext.getContext();
					return returnExpressionContext.extendedContext.getFormattedText();
				} else {
					ExpressionContext returnExpressionContext = (ExpressionContext)expression_conditional_expContext.expression(2).extendedContext.getContext();
					return returnExpressionContext.extendedContext.getFormattedText();
				}
			} else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	//expression (LOG_OR) attribute_instance* expression  
	@Override 
	public String visitExpression_log_or(Expression_log_orContext ctx){
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Expression_log_orContext expression_log_orContext = (Expression_log_orContext) ctx.extendedContext.getContext();
		if(expression_log_orContext != null){
			if(expression_log_orContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				ExpressionContext ctx1 = (ExpressionContext)expression_log_orContext.expression(0).extendedContext.getContext();
				if(ctx1 != null){
					ExpressionContextExt operand1ExtendedContext =  (ExpressionContextExt) ctx1.extendedContext;
					ExpressionOperand arg1 = operand1ExtendedContext.getOperand();
					if(((AbstractBaseExt)arg1).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
						return ctx.extendedContext.getFormattedText();
					}
					ExpressionContext ctx2 = (ExpressionContext)expression_log_orContext.expression(1).extendedContext.getContext();
					if(ctx2 != null){
						ExpressionContextExt operand2ExtendedContext =  (ExpressionContextExt) ctx2.extendedContext;
						L.debug("arg1 = "+ operand1ExtendedContext.getContext().getClass() +"\t" + operand1ExtendedContext.getEvaluatedString());
						L.debug("arg2 = "+ operand2ExtendedContext.getContext().getClass() +"\t" + operand2ExtendedContext.getEvaluatedString());
						ExpressionOperand arg2 = operand2ExtendedContext.getOperand();
						if(((AbstractBaseExt)arg2).getEvaluatedStatus() != Evaluatable.COMPLETELY_EVALUATED){
							return ctx.extendedContext.getFormattedText();
						}
						Integer lhs = Integer.parseInt(arg1.getFormattedText());
						Integer rhs = Integer.parseInt(arg2.getFormattedText());
						Integer ret =  (lhs.intValue()>0 || rhs.intValue()>0)?1:0;
						return Integer.toString(ret);
					}
					else
					{
						throw new IllegalArgumentException(expression_log_orContext.getText());
					}
				}
				else
				{
					throw new IllegalArgumentException(expression_log_orContext.getText());
				}
			} else if(ctx.expression(0).extendedContext.getFormattedText().equals("0")){
				return ctx.expression(1).extendedContext.getFormattedText();
			}else if(ctx.expression(1).extendedContext.getFormattedText().equals("0")){
				return ctx.expression(0).extendedContext.getFormattedText();
			}else {
				return ctx.extendedContext.getFormattedText();
			}
		} else {
			return ctx.extendedContext.getFormattedText();
		}
	}

	@Override public String visitPrimary(VerilogPrimeParser.PrimaryContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		PrimaryContext primaryContext  = (PrimaryContext) ctx.extendedContext.getContext();
		if(primaryContext != null){
			Function_subroutine_callContext function_subroutine_callContext = null;
			Primary_no_function_callContext primary_no_function_callContext = null;
			if(primaryContext.function_subroutine_call() !=null){
				function_subroutine_callContext = (Function_subroutine_callContext) primaryContext.function_subroutine_call().extendedContext.getContext();
			}
			if(primaryContext.primary_no_function_call() != null){
				primary_no_function_callContext	= (Primary_no_function_callContext) primaryContext.primary_no_function_call().extendedContext.getContext();
			}
			if(symbolTable.containsKey(primaryContext.getText())){
				return symbolTable.get(primaryContext.getText());
			} else if(function_subroutine_callContext != null){
				ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
				return ctx.extendedContext.getFormattedText();
			} else if(primary_no_function_callContext != null) {
				if(primary_no_function_callContext.primary_literal() != null){
					Primary_literalContext primary_literalContext = (Primary_literalContext) primary_no_function_callContext.primary_literal().extendedContext.getContext();
					if(primary_literalContext != null && primary_literalContext.number() != null){
						NumberContext numberContext = (NumberContext) primary_literalContext.number().extendedContext.getContext();
						if(numberContext != null){
							return numberContext.extendedContext.getFormattedText();
						}
					}
				} else if(primary_no_function_callContext.mintypmax_expression() != null){
					Mintypmax_expressionContext mintypmax_expressionContext = (Mintypmax_expressionContext)primary_no_function_callContext.mintypmax_expression().extendedContext.getContext();
					if(mintypmax_expressionContext != null && mintypmax_expressionContext.expression().size() ==1){
						ExpressionContext expressionContext = (ExpressionContext) mintypmax_expressionContext.expression(0).extendedContext.getContext();
						if(expressionContext != null){
							return expressionContext.extendedContext.getFormattedText();
						}
					}
				} else if(primary_no_function_callContext.concatenation() != null){ 
					ConcatenationContext concatenationContext = (ConcatenationContext) primary_no_function_callContext.concatenation().extendedContext.getContext();
					List<ExpressionContext> expressionContexts = concatenationContext.expression();
					Boolean shouldReturnZero = true;
					for(ExpressionContext expressionContext : expressionContexts){
						if(!expressionContext.extendedContext.getFormattedText().equals("0")){
							shouldReturnZero = false;
							break;
						}
					}
					if(shouldReturnZero){
						return "0";
					}						
				}else if(primary_no_function_callContext.select() != null && primary_no_function_callContext.hierarchical_identifier() !=null) {
					if(symbolTable.containsKey(primary_no_function_callContext.hierarchical_identifier())){
						return symbolTable.get(primary_no_function_callContext.hierarchical_identifier());
					}

				}
				else {
					ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
					return ctx.extendedContext.getFormattedText();
				}
			}
		}
		return ctx.extendedContext.getFormattedText();
	}


	@Override public String visitConstant_primary(VerilogPrimeParser.Constant_primaryContext ctx) { 
		if(ctx.extendedContext.getEvaluatedStatus() == Evaluatable.NOT_EVALUATED){
			AbstractBaseExt abstractBaseExt = ctx.extendedContext;
			abstractBaseExt.eval(symbolTable);
		}
		Constant_primaryContext constant_primaryContext  = (Constant_primaryContext) ctx.extendedContext.getContext();
		if(constant_primaryContext != null){
			if(constant_primaryContext.extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
				if(symbolTable.containsKey(constant_primaryContext.getText())){
					return symbolTable.get(constant_primaryContext.getText());
				} else if(constant_primaryContext.primary_literal() != null){
					Primary_literalContext primary_literalContext = (Primary_literalContext) constant_primaryContext.primary_literal().extendedContext.getContext();
					if(primary_literalContext != null && primary_literalContext.number() != null){
						NumberContext numberContext = (NumberContext) primary_literalContext.number().extendedContext.getContext();
						if(numberContext != null){
							return numberContext.extendedContext.getFormattedText();
						}
					}
				} else if(constant_primaryContext.constant_mintypmax_expression() != null){
					Constant_mintypmax_expressionContext constant_mintypmax_expressionContext = (Constant_mintypmax_expressionContext) constant_primaryContext.constant_mintypmax_expression().extendedContext.getContext();
					if(constant_mintypmax_expressionContext != null && constant_mintypmax_expressionContext.constant_expression().size() ==1){
						Constant_expressionContext constant_expressionContext = (Constant_expressionContext) constant_mintypmax_expressionContext.constant_expression(0).extendedContext.getContext();
						if(constant_expressionContext != null){
							return constant_expressionContext.extendedContext.getFormattedText();
						}
					}
				} else {
					ctx.extendedContext.setEvaluatedStatus(Evaluatable.PARTIALLY_EVALUATED);
					return ctx.extendedContext.getFormattedText();
				}
			}
			return ctx.extendedContext.getFormattedText();
		}else {
			return ctx.extendedContext.getFormattedText();
		}
	}
}
