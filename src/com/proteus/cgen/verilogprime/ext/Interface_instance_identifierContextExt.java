package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Interface_instance_identifierContext;

public class Interface_instance_identifierContextExt extends AbstractBaseExt{

	@Getter private Interface_instance_identifierContext ctx;

	public Interface_instance_identifierContextExt(Interface_instance_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).interface_instance_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Interface_instance_identifierContext){
				this.ctx = (Interface_instance_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Interface_instance_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
