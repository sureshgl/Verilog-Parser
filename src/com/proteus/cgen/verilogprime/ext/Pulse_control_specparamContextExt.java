package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pulse_control_specparamContext;

public class Pulse_control_specparamContextExt extends AbstractBaseExt{

	@Getter private Pulse_control_specparamContext ctx;

	public Pulse_control_specparamContextExt(Pulse_control_specparamContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pulse_control_specparam());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pulse_control_specparamContext){
				this.ctx = (Pulse_control_specparamContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pulse_control_specparamContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
