package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.T10_path_delay_expressionContext;

public class T10_path_delay_expressionContextExt extends AbstractBaseExt{

	@Getter private T10_path_delay_expressionContext ctx;

	public T10_path_delay_expressionContextExt(T10_path_delay_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).t10_path_delay_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof T10_path_delay_expressionContext){
				this.ctx = (T10_path_delay_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+T10_path_delay_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
