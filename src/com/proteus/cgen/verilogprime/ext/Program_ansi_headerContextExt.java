package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Program_ansi_headerContext;

public class Program_ansi_headerContextExt extends AbstractBaseExt{

	@Getter private Program_ansi_headerContext ctx;

	public Program_ansi_headerContextExt(Program_ansi_headerContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).program_ansi_header());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Program_ansi_headerContext){
				this.ctx = (Program_ansi_headerContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Program_ansi_headerContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
