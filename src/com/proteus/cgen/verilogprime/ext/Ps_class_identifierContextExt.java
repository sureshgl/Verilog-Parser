package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ps_class_identifierContext;

public class Ps_class_identifierContextExt extends AbstractBaseExt{

	@Getter private Ps_class_identifierContext ctx;

	public Ps_class_identifierContextExt(Ps_class_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ps_class_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ps_class_identifierContext){
				this.ctx = (Ps_class_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ps_class_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
