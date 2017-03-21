package com.proteus.cgen.verilogprime.ext;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_addContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Const_expr_mutlContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_expressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_part_select_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_selectContext;
import com.proteus.common.util.Utils.Pair;

public class Constant_selectContextExt extends AbstractBaseExt{

	@Getter private Constant_selectContext ctx;

	public Constant_selectContextExt(Constant_selectContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_select());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_selectContext){
				this.ctx = (Constant_selectContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_selectContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public Pair<String,String> getLeftRightOfConstantSelect(){
		if(ctx != null){
			Pair<String,String> range = null;
			String left =null, right =null;
			if(ctx.constant_part_select_range() != null && ctx.constant_part_select_range().size() >0) {
				List<Constant_part_select_rangeContext> constant_part_select_rangeContexts = ctx.constant_part_select_range();
				for (int i =0 ; i < constant_part_select_rangeContexts.size(); i++){
					Constant_rangeContext constant_rangeContext = constant_part_select_rangeContexts.get(i).constant_range();
					if(constant_rangeContext != null && constant_rangeContext.colon() != null){
						List<Constant_expressionContext> constant_expressionContexts =  constant_rangeContext.constant_expression();
						if(constant_expressionContexts != null && constant_expressionContexts.size() ==2 ){
							if(constant_expressionContexts.get(0) instanceof Const_expr_addContext){
								right = constant_expressionContexts.get(0).extendedContext.getFormattedText();
							}
							if(constant_expressionContexts.get(1) instanceof Const_expr_mutlContext){
								left = constant_expressionContexts.get(1).extendedContext.getFormattedText();
							}
						}
					}
				}
				range = new Pair<String, String>(left, right);
			}
			return range;
		}
		return null;
	}
	
	@Override
	public Boolean isConstantSelect(){
		return true;
	}
}
