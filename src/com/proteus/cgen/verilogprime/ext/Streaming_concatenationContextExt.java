package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Streaming_concatenationContext;

public class Streaming_concatenationContextExt extends AbstractBaseExt{

	@Getter private Streaming_concatenationContext ctx;

	public Streaming_concatenationContextExt(Streaming_concatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).streaming_concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Streaming_concatenationContext){
				this.ctx = (Streaming_concatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Streaming_concatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
