package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ps_type_identifierContext;

public class Ps_type_identifierContextExt extends AbstractBaseExt{

	@Getter private Ps_type_identifierContext ctx;

	public Ps_type_identifierContextExt(Ps_type_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ps_type_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ps_type_identifierContext){
				this.ctx = (Ps_type_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ps_type_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
