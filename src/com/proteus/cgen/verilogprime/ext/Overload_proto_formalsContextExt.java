package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Overload_proto_formalsContext;

public class Overload_proto_formalsContextExt extends AbstractBaseExt{

	@Getter private Overload_proto_formalsContext ctx;

	public Overload_proto_formalsContextExt(Overload_proto_formalsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).overload_proto_formals());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Overload_proto_formalsContext){
				this.ctx = (Overload_proto_formalsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Overload_proto_formalsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
