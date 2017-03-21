package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unsigned_lshift_assignContext;

public class Unsigned_lshift_assignContextExt extends AbstractBaseExt{

	@Getter private Unsigned_lshift_assignContext ctx;

	public Unsigned_lshift_assignContextExt(Unsigned_lshift_assignContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).unsigned_lshift_assign());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Unsigned_lshift_assignContext){
				this.ctx = (Unsigned_lshift_assignContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Unsigned_lshift_assignContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
