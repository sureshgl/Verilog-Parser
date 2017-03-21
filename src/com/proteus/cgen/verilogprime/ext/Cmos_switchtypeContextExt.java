package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Cmos_switchtypeContext;

public class Cmos_switchtypeContextExt extends AbstractBaseExt{

	@Getter private Cmos_switchtypeContext ctx;

	public Cmos_switchtypeContextExt(Cmos_switchtypeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).cmos_switchtype());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Cmos_switchtypeContext){
				this.ctx = (Cmos_switchtypeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Cmos_switchtypeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
