package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Stream_concatenationContext;

public class Stream_concatenationContextExt extends AbstractBaseExt{

	@Getter private Stream_concatenationContext ctx;

	public Stream_concatenationContextExt(Stream_concatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).stream_concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Stream_concatenationContext){
				this.ctx = (Stream_concatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Stream_concatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
