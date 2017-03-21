package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_expressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_dimensionContext;

public class Variable_dimensionContextExt extends AbstractBaseExt{

	@Getter private Variable_dimensionContext ctx;

	public Variable_dimensionContextExt(Variable_dimensionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).variable_dimension());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Variable_dimensionContext){
				this.ctx = (Variable_dimensionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Variable_dimensionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(ctx != null && ctx.unpacked_dimension() != null) {
			String left =null ,right =null;
			Constant_rangeContext constant_rangeContext = ctx.unpacked_dimension().constant_range();
			if(constant_rangeContext != null){
				List<Constant_expressionContext> constant_ExpressionContexts= constant_rangeContext.constant_expression();
				if(constant_ExpressionContexts != null && constant_ExpressionContexts.size() ==2){
					left = constant_ExpressionContexts.get(0).extendedContext.getFormattedText();
					right = constant_ExpressionContexts.get(1).extendedContext.getFormattedText();
					params.getStringBuilder().append(".set("+right+"," +left+")");
					params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
				} else {
					super.getCString(params, classObj, moduleToParameters,functionalityName);
				}
			} else if(ctx.unpacked_dimension() != null) {
				if(ctx.unpacked_dimension().constant_expression() != null){
					super.getCString(params, classObj, moduleToParameters,functionalityName);
				}
			}
			else{
				BailoutRule(ctx.getClass().getName(), "hitting other rules");
			}
		} else {
			super.getCString(params, classObj, moduleToParameters,functionalityName);
		}
	}

}
