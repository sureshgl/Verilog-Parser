package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Slice_sizeContext;

public class Slice_sizeContextExt extends AbstractBaseExt{

	@Getter private Slice_sizeContext ctx;

	public Slice_sizeContextExt(Slice_sizeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).slice_size());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Slice_sizeContext){
				this.ctx = (Slice_sizeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Slice_sizeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
