package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Dynamic_array_newContext;

public class Dynamic_array_newContextExt extends AbstractBaseExt{

	@Getter private Dynamic_array_newContext ctx;

	public Dynamic_array_newContextExt(Dynamic_array_newContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dynamic_array_new());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Dynamic_array_newContext){
				this.ctx = (Dynamic_array_newContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Dynamic_array_newContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
