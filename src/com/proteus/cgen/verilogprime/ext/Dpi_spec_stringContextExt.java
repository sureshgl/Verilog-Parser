package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Dpi_spec_stringContext;

public class Dpi_spec_stringContextExt extends AbstractBaseExt{

	@Getter private Dpi_spec_stringContext ctx;

	public Dpi_spec_stringContextExt(Dpi_spec_stringContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dpi_spec_string());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Dpi_spec_stringContext){
				this.ctx = (Dpi_spec_stringContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Dpi_spec_stringContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
