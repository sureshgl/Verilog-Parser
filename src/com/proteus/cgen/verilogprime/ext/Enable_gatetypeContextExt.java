package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Enable_gatetypeContext;

public class Enable_gatetypeContextExt extends AbstractBaseExt{

	@Getter private Enable_gatetypeContext ctx;

	public Enable_gatetypeContextExt(Enable_gatetypeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).enable_gatetype());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Enable_gatetypeContext){
				this.ctx = (Enable_gatetypeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Enable_gatetypeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
