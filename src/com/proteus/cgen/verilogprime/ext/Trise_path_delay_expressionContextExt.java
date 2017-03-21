package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Trise_path_delay_expressionContext;

public class Trise_path_delay_expressionContextExt extends AbstractBaseExt{

	@Getter private Trise_path_delay_expressionContext ctx;

	public Trise_path_delay_expressionContextExt(Trise_path_delay_expressionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).trise_path_delay_expression());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Trise_path_delay_expressionContext){
				this.ctx = (Trise_path_delay_expressionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Trise_path_delay_expressionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
