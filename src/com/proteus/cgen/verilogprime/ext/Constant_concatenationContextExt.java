package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ConcatenationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_concatenationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;

public class Constant_concatenationContextExt extends AbstractBaseExt{

	@Getter private Constant_concatenationContext ctx;

	public Constant_concatenationContextExt(Constant_concatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_concatenationContext){
				this.ctx = (Constant_concatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_concatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void eval(SymbolTable symbolTable){
		super.eval(symbolTable);
		ConcatenationContext concatenationContext = (ConcatenationContext)getContext();
		for(ExpressionContext expressionContext : concatenationContext.expression())
		{
			ExpressionContextExt mostRecentExpressionExtendedContext = (ExpressionContextExt)expressionContext.extendedContext;
			if ( mostRecentExpressionExtendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED )
			{
				mostRecentExpressionExtendedContext.getBinaryRepresentation();
			}
			else{
				//TODO: GL don't know whether we have to convert the sub expressions to binary.
			}
		}
	}
}
