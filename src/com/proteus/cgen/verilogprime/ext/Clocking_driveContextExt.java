package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Clocking_driveContext;

public class Clocking_driveContextExt extends AbstractBaseExt{

	@Getter private Clocking_driveContext ctx;

	public Clocking_driveContextExt(Clocking_driveContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).clocking_drive());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Clocking_driveContext){
				this.ctx = (Clocking_driveContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Clocking_driveContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
