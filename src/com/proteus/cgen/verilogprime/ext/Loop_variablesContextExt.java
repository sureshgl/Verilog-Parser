package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Loop_variablesContext;

public class Loop_variablesContextExt extends AbstractBaseExt{

	@Getter private Loop_variablesContext ctx;

	public Loop_variablesContextExt(Loop_variablesContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).loop_variables());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Loop_variablesContext){
				this.ctx = (Loop_variablesContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Loop_variablesContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
