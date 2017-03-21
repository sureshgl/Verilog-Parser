package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.StartcoloncolonstarContext;

public class StartcoloncolonstarContextExt extends AbstractBaseExt{

	@Getter private StartcoloncolonstarContext ctx;

	public StartcoloncolonstarContextExt(StartcoloncolonstarContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).startcoloncolonstar());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof StartcoloncolonstarContext){
				this.ctx = (StartcoloncolonstarContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+StartcoloncolonstarContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
