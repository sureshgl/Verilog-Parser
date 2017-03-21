package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Primary_no_function_callContext;

public class Primary_no_function_callContextExt extends AbstractBaseExt{

	@Getter private Primary_no_function_callContext ctx;

	public Primary_no_function_callContextExt(Primary_no_function_callContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).primary_no_function_call());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Primary_no_function_callContext){
				this.ctx = (Primary_no_function_callContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Primary_no_function_callContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
