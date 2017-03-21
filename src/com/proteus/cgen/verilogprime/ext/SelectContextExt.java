package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_expressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_multContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Expression_only_primaryContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Indexed_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.SelectContext;

public class SelectContextExt extends AbstractBaseExt{

	@Getter private SelectContext ctx;

	public SelectContextExt(SelectContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).select());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof SelectContext){
				this.ctx = (SelectContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+SelectContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(ctx != null){
			if(ctx.bit_select().size()>1){
				BailoutRule(ctx.getClass().getName(), "More than one BitSelects available");
			}

			if(ctx.part_select_range() != null){
				if(ctx.part_select_range().indexed_range() != null){
					Indexed_rangeContext indexed_rangeContext = ctx.part_select_range().indexed_range();
					if(indexed_rangeContext.pluscolon() != null){
						if (indexed_rangeContext.expression() != null && indexed_rangeContext.constant_expression() != null) {
							String ex_multiplier = null, ex_variable = null;
							if(indexed_rangeContext.expression() instanceof Expression_multContext){
								Expression_multContext expression_multContext = (Expression_multContext) indexed_rangeContext.expression() ;
								List<ExpressionContext> expressionContexts = (List<ExpressionContext>) expression_multContext.expression();
								if(expressionContexts != null && expressionContexts.size() == 2) {
									ex_multiplier = expressionContexts.get(0).extendedContext.getFormattedText();
									ex_variable = expressionContexts.get(1).extendedContext.getFormattedText();
								} else {
									BailoutRule(ctx.getClass().getName(), "Expression ctxs size is not equals to 2");
								}
								params.getStringBuilder().append(ctx.bit_select(0).extendedContext.getCString(classObj, moduleToParameters, functionalityName));
								params.getStringBuilder().append(".get(("+ex_multiplier+")*"+ex_variable+", (("+ex_multiplier+"+1) * "+ ex_variable+")-1)");
								params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
							} 
							else if(indexed_rangeContext.expression() instanceof Expression_only_primaryContext){
								Boolean isMinTypeMax = indexed_rangeContext.expression().extendedContext.isMinTypeMax();
								if(isMinTypeMax){
									Expression_only_primaryContext expression_only_primaryContext = (Expression_only_primaryContext) indexed_rangeContext.expression();
									if(expression_only_primaryContext != null){
										if(expression_only_primaryContext.primary() != null && 
												expression_only_primaryContext.primary().primary_no_function_call() !=null &&
												expression_only_primaryContext.primary().primary_no_function_call().mintypmax_expression() != null){
											List<ExpressionContext> expressionContexts = expression_only_primaryContext.primary().primary_no_function_call().mintypmax_expression().expression();
											for(ExpressionContext expressionContext : expressionContexts) {
												if(expressionContext instanceof Expression_multContext) {
													Expression_multContext expression_multContext = (Expression_multContext)expressionContext ;
													List<ExpressionContext> tmp_expressionContexts = (List<ExpressionContext>) expression_multContext.expression();
													if(tmp_expressionContexts != null && tmp_expressionContexts.size() == 2) {
														ex_multiplier = tmp_expressionContexts.get(0).extendedContext.getFormattedText();
														ex_variable = tmp_expressionContexts.get(1).extendedContext.getFormattedText();
														params.getStringBuilder().append(ctx.bit_select(0).extendedContext.getCString(classObj, moduleToParameters, functionalityName));
														params.getStringBuilder().append(".get(("+ex_multiplier+")*"+ex_variable+", (("+ex_multiplier+"+1) * "+ ex_variable+")-1)");
														params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
													} else {
														BailoutRule(ctx.getClass().getName(), "Expression ctxs size is not equals to 2");
													}
												}else {
													BailoutRule(ctx.getClass().getName(), "Its not Expression_multContext");
												}
											}

										} else {
											BailoutRule(ctx.getClass().getName(), "Some thing went wrong in mintypemax expression");
										}
									}
								}
							}
							// wadr.get(   (wi)*BITADDR, (((wi+1)*BITADDR) -1)   );
						} else {
							BailoutRule(ctx.getClass().getName(), "Hitting other rules (nt cnst exp , exp)");
						}
					} else {
						BailoutRule(ctx.getClass().getName(), "pluscolon (+:) not found ");
					}
				} else if (ctx.part_select_range().constant_range() != null){
					//TODO
					String right = null, left = null;
					List<Constant_expressionContext> constant_expressionContexts = ctx.part_select_range().constant_range().constant_expression();
					if(constant_expressionContexts != null && constant_expressionContexts.size() >0){
						//						for(int i=0; i< constant_expressionContexts.size(); i++) {
						if(constant_expressionContexts.size() == 2){
							right = constant_expressionContexts.get(0).extendedContext.getFormattedText();
							left = constant_expressionContexts.get(1).extendedContext.getFormattedText();
						}
						if(left != null && right != null){
							params.getStringBuilder().append(ctx.bit_select(0).extendedContext.getCString(classObj, moduleToParameters, functionalityName));
							params.getStringBuilder().append(".get("+left+","+right +")");
							params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
						}
					}

				} else {
					BailoutRule("select", ctx.getText());
				}
			}else {
				super.getCString(params, classObj, moduleToParameters,functionalityName);
			}
		} else {
			super.getCString(params, classObj, moduleToParameters,functionalityName);
		}
	}

	@Override
	public List<String> getSelectIdentifier(){
		List<String> identifierList = new ArrayList<String>();
		identifierList = ctx.extendedContext.Identifiers();
		if(identifierList.size() >0)
			return identifierList;
		else 
			return null;
	}

	@Override
	public Boolean isSelect(){
		return true;
	}
}
