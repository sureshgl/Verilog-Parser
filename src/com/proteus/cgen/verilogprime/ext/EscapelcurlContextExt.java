package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EscapelcurlContext;

public class EscapelcurlContextExt extends AbstractBaseExt{

	@Getter private EscapelcurlContext ctx;

	public EscapelcurlContextExt(EscapelcurlContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).escapelcurl());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EscapelcurlContext){
				this.ctx = (EscapelcurlContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EscapelcurlContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
