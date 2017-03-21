package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Combinational_bodyContext;

public class Combinational_bodyContextExt extends AbstractBaseExt{

	@Getter private Combinational_bodyContext ctx;

	public Combinational_bodyContextExt(Combinational_bodyContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).combinational_body());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Combinational_bodyContext){
				this.ctx = (Combinational_bodyContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Combinational_bodyContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
