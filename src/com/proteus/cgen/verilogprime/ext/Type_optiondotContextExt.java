package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Type_optiondotContext;

public class Type_optiondotContextExt extends AbstractBaseExt{

	@Getter private Type_optiondotContext ctx;

	public Type_optiondotContextExt(Type_optiondotContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).type_optiondot());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Type_optiondotContext){
				this.ctx = (Type_optiondotContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Type_optiondotContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
