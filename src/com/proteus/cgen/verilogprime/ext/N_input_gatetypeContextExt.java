package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.N_input_gatetypeContext;

public class N_input_gatetypeContextExt extends AbstractBaseExt{

	@Getter private N_input_gatetypeContext ctx;

	public N_input_gatetypeContextExt(N_input_gatetypeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).n_input_gatetype());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof N_input_gatetypeContext){
				this.ctx = (N_input_gatetypeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+N_input_gatetypeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
