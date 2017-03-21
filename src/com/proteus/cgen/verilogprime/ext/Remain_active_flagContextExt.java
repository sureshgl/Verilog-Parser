package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Remain_active_flagContext;

public class Remain_active_flagContextExt extends AbstractBaseExt{

	@Getter private Remain_active_flagContext ctx;

	public Remain_active_flagContextExt(Remain_active_flagContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).remain_active_flag());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Remain_active_flagContext){
				this.ctx = (Remain_active_flagContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Remain_active_flagContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
