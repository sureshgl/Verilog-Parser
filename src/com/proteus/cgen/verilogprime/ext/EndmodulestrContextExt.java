package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndmodulestrContext;

public class EndmodulestrContextExt extends AbstractBaseExt{

	@Getter private EndmodulestrContext ctx;

	public EndmodulestrContextExt(EndmodulestrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endmodulestr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndmodulestrContext){
				this.ctx = (EndmodulestrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndmodulestrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
