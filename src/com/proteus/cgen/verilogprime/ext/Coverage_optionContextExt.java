package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Coverage_optionContext;

public class Coverage_optionContextExt extends AbstractBaseExt{

	@Getter private Coverage_optionContext ctx;

	public Coverage_optionContextExt(Coverage_optionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).coverage_option());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Coverage_optionContext){
				this.ctx = (Coverage_optionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Coverage_optionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
