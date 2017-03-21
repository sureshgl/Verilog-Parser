package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pass_switchtypeContext;

public class Pass_switchtypeContextExt extends AbstractBaseExt{

	@Getter private Pass_switchtypeContext ctx;

	public Pass_switchtypeContextExt(Pass_switchtypeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pass_switchtype());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pass_switchtypeContext){
				this.ctx = (Pass_switchtypeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pass_switchtypeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
