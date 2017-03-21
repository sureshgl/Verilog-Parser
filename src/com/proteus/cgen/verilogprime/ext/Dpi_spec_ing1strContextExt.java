package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Dpi_spec_ing1strContext;

public class Dpi_spec_ing1strContextExt extends AbstractBaseExt{

	@Getter private Dpi_spec_ing1strContext ctx;

	public Dpi_spec_ing1strContextExt(Dpi_spec_ing1strContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dpi_spec_ing1str());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Dpi_spec_ing1strContext){
				this.ctx = (Dpi_spec_ing1strContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Dpi_spec_ing1strContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
