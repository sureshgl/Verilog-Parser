package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_indexed_rangeContext;

public class Constant_indexed_rangeContextExt extends AbstractBaseExt{

	@Getter private Constant_indexed_rangeContext ctx;

	public Constant_indexed_rangeContextExt(Constant_indexed_rangeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_indexed_range());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_indexed_rangeContext){
				this.ctx = (Constant_indexed_rangeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_indexed_rangeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
