package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Name_of_instanceContext;

public class Name_of_instanceContextExt extends AbstractBaseExt{

	@Getter private Name_of_instanceContext ctx;

	public Name_of_instanceContextExt(Name_of_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).name_of_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Name_of_instanceContext){
				this.ctx = (Name_of_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Name_of_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
