package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Drive_strengthContext;

public class Drive_strengthContextExt extends AbstractBaseExt{

	@Getter private Drive_strengthContext ctx;

	public Drive_strengthContextExt(Drive_strengthContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).drive_strength());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Drive_strengthContext){
				this.ctx = (Drive_strengthContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Drive_strengthContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
