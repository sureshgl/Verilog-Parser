package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ncontrol_terminalContext;

public class Ncontrol_terminalContextExt extends AbstractBaseExt{

	@Getter private Ncontrol_terminalContext ctx;

	public Ncontrol_terminalContextExt(Ncontrol_terminalContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ncontrol_terminal());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ncontrol_terminalContext){
				this.ctx = (Ncontrol_terminalContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ncontrol_terminalContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
