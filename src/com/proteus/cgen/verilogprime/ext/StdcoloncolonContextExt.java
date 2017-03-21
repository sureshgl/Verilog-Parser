package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.StdcoloncolonContext;

public class StdcoloncolonContextExt extends AbstractBaseExt{

	@Getter private StdcoloncolonContext ctx;

	public StdcoloncolonContextExt(StdcoloncolonContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).stdcoloncolon());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof StdcoloncolonContext){
				this.ctx = (StdcoloncolonContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+StdcoloncolonContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
