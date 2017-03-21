package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hash_zeroContext;

public class Hash_zeroContextExt extends AbstractBaseExt{

	@Getter private Hash_zeroContext ctx;

	public Hash_zeroContextExt(Hash_zeroContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hash_zero());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hash_zeroContext){
				this.ctx = (Hash_zeroContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hash_zeroContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
