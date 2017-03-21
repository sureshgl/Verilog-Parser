package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Boolean_abbrevContext;

public class Boolean_abbrevContextExt extends AbstractBaseExt{

	@Getter private Boolean_abbrevContext ctx;

	public Boolean_abbrevContextExt(Boolean_abbrevContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).boolean_abbrev());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Boolean_abbrevContext){
				this.ctx = (Boolean_abbrevContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Boolean_abbrevContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
