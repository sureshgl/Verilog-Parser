package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.LocalcoloncolonContext;

public class LocalcoloncolonContextExt extends AbstractBaseExt{

	@Getter private LocalcoloncolonContext ctx;

	public LocalcoloncolonContextExt(LocalcoloncolonContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).localcoloncolon());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof LocalcoloncolonContext){
				this.ctx = (LocalcoloncolonContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+LocalcoloncolonContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
