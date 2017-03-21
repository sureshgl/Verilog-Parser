package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Built_in_method_callContext;

public class Built_in_method_callContextExt extends AbstractBaseExt{

	@Getter private Built_in_method_callContext ctx;

	public Built_in_method_callContextExt(Built_in_method_callContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).built_in_method_call());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Built_in_method_callContext){
				this.ctx = (Built_in_method_callContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Built_in_method_callContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
