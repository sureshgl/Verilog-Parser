package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Class_item_qualifierContext;

public class Class_item_qualifierContextExt extends AbstractBaseExt{

	@Getter private Class_item_qualifierContext ctx;

	public Class_item_qualifierContextExt(Class_item_qualifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).class_item_qualifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Class_item_qualifierContext){
				this.ctx = (Class_item_qualifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Class_item_qualifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
