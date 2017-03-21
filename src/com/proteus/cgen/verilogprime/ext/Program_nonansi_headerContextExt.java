package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Program_nonansi_headerContext;

public class Program_nonansi_headerContextExt extends AbstractBaseExt{

	@Getter private Program_nonansi_headerContext ctx;

	public Program_nonansi_headerContextExt(Program_nonansi_headerContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).program_nonansi_header());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Program_nonansi_headerContext){
				this.ctx = (Program_nonansi_headerContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Program_nonansi_headerContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
