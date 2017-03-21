package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Function_subroutine_callContext;

public class Function_subroutine_callContextExt extends AbstractBaseExt{

	@Getter private Function_subroutine_callContext ctx;

	public Function_subroutine_callContextExt(Function_subroutine_callContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).function_subroutine_call());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Function_subroutine_callContext){
				this.ctx = (Function_subroutine_callContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Function_subroutine_callContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
