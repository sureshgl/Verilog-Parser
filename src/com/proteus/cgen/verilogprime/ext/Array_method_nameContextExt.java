package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Array_method_nameContext;

public class Array_method_nameContextExt extends AbstractBaseExt{

	@Getter private Array_method_nameContext ctx;

	public Array_method_nameContextExt(Array_method_nameContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).array_method_name());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Array_method_nameContext){
				this.ctx = (Array_method_nameContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Array_method_nameContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
