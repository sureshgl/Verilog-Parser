package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Cover_point_identifierContext;

public class Cover_point_identifierContextExt extends AbstractBaseExt{

	@Getter private Cover_point_identifierContext ctx;

	public Cover_point_identifierContextExt(Cover_point_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).cover_point_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Cover_point_identifierContext){
				this.ctx = (Cover_point_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Cover_point_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
