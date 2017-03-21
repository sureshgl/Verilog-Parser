package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Function_data_type_or_implicitContext;

public class Function_data_type_or_implicitContextExt extends AbstractBaseExt{

	@Getter private Function_data_type_or_implicitContext ctx;

	public Function_data_type_or_implicitContextExt(Function_data_type_or_implicitContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).function_data_type_or_implicit());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Function_data_type_or_implicitContext){
				this.ctx = (Function_data_type_or_implicitContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Function_data_type_or_implicitContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
