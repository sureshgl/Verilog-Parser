package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.AttheratestarContext;

public class AttheratestarContextExt extends AbstractBaseExt{

	@Getter private AttheratestarContext ctx;

	public AttheratestarContextExt(AttheratestarContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).attheratestar());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof AttheratestarContext){
				this.ctx = (AttheratestarContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+AttheratestarContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
