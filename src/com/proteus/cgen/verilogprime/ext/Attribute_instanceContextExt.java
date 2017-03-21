package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Attribute_instanceContext;

public class Attribute_instanceContextExt extends AbstractBaseExt{

	@Getter private Attribute_instanceContext ctx;

	public Attribute_instanceContextExt(Attribute_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).attribute_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Attribute_instanceContext){
				this.ctx = (Attribute_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Attribute_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
