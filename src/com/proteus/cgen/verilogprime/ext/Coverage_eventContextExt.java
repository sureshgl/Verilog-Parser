package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Coverage_eventContext;

public class Coverage_eventContextExt extends AbstractBaseExt{

	@Getter private Coverage_eventContext ctx;

	public Coverage_eventContextExt(Coverage_eventContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).coverage_event());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Coverage_eventContext){
				this.ctx = (Coverage_eventContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Coverage_eventContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
