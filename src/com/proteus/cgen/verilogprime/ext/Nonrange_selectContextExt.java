package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Nonrange_selectContext;

public class Nonrange_selectContextExt extends AbstractBaseExt{

	@Getter private Nonrange_selectContext ctx;

	public Nonrange_selectContextExt(Nonrange_selectContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).nonrange_select());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Nonrange_selectContext){
				this.ctx = (Nonrange_selectContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Nonrange_selectContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
