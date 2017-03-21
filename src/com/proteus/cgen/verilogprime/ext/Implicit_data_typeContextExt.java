package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Implicit_data_typeContext;

public class Implicit_data_typeContextExt extends AbstractBaseExt{

	@Getter private Implicit_data_typeContext ctx;

	public Implicit_data_typeContextExt(Implicit_data_typeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).implicit_data_type());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Implicit_data_typeContext){
				this.ctx = (Implicit_data_typeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Implicit_data_typeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
