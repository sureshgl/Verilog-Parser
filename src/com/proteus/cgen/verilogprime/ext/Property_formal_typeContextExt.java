package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Property_formal_typeContext;

public class Property_formal_typeContextExt extends AbstractBaseExt{

	@Getter private Property_formal_typeContext ctx;

	public Property_formal_typeContextExt(Property_formal_typeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).property_formal_type());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Property_formal_typeContext){
				this.ctx = (Property_formal_typeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Property_formal_typeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
