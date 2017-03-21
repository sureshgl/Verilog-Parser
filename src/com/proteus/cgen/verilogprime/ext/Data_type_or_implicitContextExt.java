package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_type_or_implicitContext;

public class Data_type_or_implicitContextExt extends AbstractBaseExt{

	@Getter private Data_type_or_implicitContext ctx;

	public Data_type_or_implicitContextExt(Data_type_or_implicitContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).data_type_or_implicit());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Data_type_or_implicitContext){
				this.ctx = (Data_type_or_implicitContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Data_type_or_implicitContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
