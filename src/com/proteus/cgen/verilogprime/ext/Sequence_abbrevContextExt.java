package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Sequence_abbrevContext;

public class Sequence_abbrevContextExt extends AbstractBaseExt{

	@Getter private Sequence_abbrevContext ctx;

	public Sequence_abbrevContextExt(Sequence_abbrevContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).sequence_abbrev());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Sequence_abbrevContext){
				this.ctx = (Sequence_abbrevContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Sequence_abbrevContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
