package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Tfall_path_delay_expressionContext;

public class Tfall_path_delay_expressionContextExt extends AbstractBaseExt{

	@Getter private Tfall_path_delay_expressionContext ctx;

	public Tfall_path_delay_expressionContextExt(Tfall_path_delay_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tfall_path_delay_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tfall_path_delay_expressionContext){
				this.ctx = (Tfall_path_delay_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tfall_path_delay_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
