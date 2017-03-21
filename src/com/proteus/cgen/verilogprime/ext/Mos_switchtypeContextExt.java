package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Mos_switchtypeContext;

public class Mos_switchtypeContextExt extends AbstractBaseExt{

	@Getter private Mos_switchtypeContext ctx;

	public Mos_switchtypeContextExt(Mos_switchtypeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).mos_switchtype());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Mos_switchtypeContext){
				this.ctx = (Mos_switchtypeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Mos_switchtypeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
