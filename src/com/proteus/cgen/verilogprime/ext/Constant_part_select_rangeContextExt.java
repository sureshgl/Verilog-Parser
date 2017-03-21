package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_part_select_rangeContext;

public class Constant_part_select_rangeContextExt extends AbstractBaseExt{

	@Getter private Constant_part_select_rangeContext ctx;

	public Constant_part_select_rangeContextExt(Constant_part_select_rangeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).constant_part_select_range());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Constant_part_select_rangeContext){
				this.ctx = (Constant_part_select_rangeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Constant_part_select_rangeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
