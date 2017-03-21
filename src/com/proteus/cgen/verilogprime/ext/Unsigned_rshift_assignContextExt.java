package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unsigned_rshift_assignContext;

public class Unsigned_rshift_assignContextExt extends AbstractBaseExt{

	@Getter private Unsigned_rshift_assignContext ctx;

	public Unsigned_rshift_assignContextExt(Unsigned_rshift_assignContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).unsigned_rshift_assign());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Unsigned_rshift_assignContext){
				this.ctx = (Unsigned_rshift_assignContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Unsigned_rshift_assignContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
