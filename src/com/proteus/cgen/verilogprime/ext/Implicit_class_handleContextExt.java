package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Implicit_class_handleContext;

public class Implicit_class_handleContextExt extends AbstractBaseExt{

	@Getter private Implicit_class_handleContext ctx;

	public Implicit_class_handleContextExt(Implicit_class_handleContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).implicit_class_handle());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Implicit_class_handleContext){
				this.ctx = (Implicit_class_handleContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Implicit_class_handleContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
