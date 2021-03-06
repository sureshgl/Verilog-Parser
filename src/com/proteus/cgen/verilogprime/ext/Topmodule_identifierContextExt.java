package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Topmodule_identifierContext;

public class Topmodule_identifierContextExt extends AbstractBaseExt{

	@Getter private Topmodule_identifierContext ctx;

	public Topmodule_identifierContextExt(Topmodule_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).topmodule_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Topmodule_identifierContext){
				this.ctx = (Topmodule_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Topmodule_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
