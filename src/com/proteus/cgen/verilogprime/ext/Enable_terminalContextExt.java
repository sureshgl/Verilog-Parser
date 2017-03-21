package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Enable_terminalContext;

public class Enable_terminalContextExt extends AbstractBaseExt{

	@Getter private Enable_terminalContext ctx;

	public Enable_terminalContextExt(Enable_terminalContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).enable_terminal());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Enable_terminalContext){
				this.ctx = (Enable_terminalContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Enable_terminalContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
