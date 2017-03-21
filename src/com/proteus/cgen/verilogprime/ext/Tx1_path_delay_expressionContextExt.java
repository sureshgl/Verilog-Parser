package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Tx1_path_delay_expressionContext;

public class Tx1_path_delay_expressionContextExt extends AbstractBaseExt{

	@Getter private Tx1_path_delay_expressionContext ctx;

	public Tx1_path_delay_expressionContextExt(Tx1_path_delay_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).tx1_path_delay_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Tx1_path_delay_expressionContext){
				this.ctx = (Tx1_path_delay_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Tx1_path_delay_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
