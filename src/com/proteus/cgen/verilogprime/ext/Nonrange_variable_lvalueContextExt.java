package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Nonrange_variable_lvalueContext;

public class Nonrange_variable_lvalueContextExt extends AbstractBaseExt{

	@Getter private Nonrange_variable_lvalueContext ctx;

	public Nonrange_variable_lvalueContextExt(Nonrange_variable_lvalueContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).nonrange_variable_lvalue());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Nonrange_variable_lvalueContext){
				this.ctx = (Nonrange_variable_lvalueContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Nonrange_variable_lvalueContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
