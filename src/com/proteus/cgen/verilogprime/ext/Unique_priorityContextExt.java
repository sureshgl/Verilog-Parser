package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unique_priorityContext;

public class Unique_priorityContextExt extends AbstractBaseExt{

	@Getter private Unique_priorityContext ctx;

	public Unique_priorityContextExt(Unique_priorityContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).unique_priority());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Unique_priorityContext){
				this.ctx = (Unique_priorityContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Unique_priorityContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
