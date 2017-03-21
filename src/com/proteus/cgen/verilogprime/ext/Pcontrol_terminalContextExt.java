package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pcontrol_terminalContext;

public class Pcontrol_terminalContextExt extends AbstractBaseExt{

	@Getter private Pcontrol_terminalContext ctx;

	public Pcontrol_terminalContextExt(Pcontrol_terminalContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pcontrol_terminal());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pcontrol_terminalContext){
				this.ctx = (Pcontrol_terminalContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pcontrol_terminalContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
