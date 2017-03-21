package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Mos_switch_instanceContext;

public class Mos_switch_instanceContextExt extends AbstractBaseExt{

	@Getter private Mos_switch_instanceContext ctx;

	public Mos_switch_instanceContextExt(Mos_switch_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).mos_switch_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Mos_switch_instanceContext){
				this.ctx = (Mos_switch_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Mos_switch_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
