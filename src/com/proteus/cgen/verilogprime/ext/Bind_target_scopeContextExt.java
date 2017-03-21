package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Bind_target_scopeContext;

public class Bind_target_scopeContextExt extends AbstractBaseExt{

	@Getter private Bind_target_scopeContext ctx;

	public Bind_target_scopeContextExt(Bind_target_scopeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).bind_target_scope());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Bind_target_scopeContext){
				this.ctx = (Bind_target_scopeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Bind_target_scopeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
