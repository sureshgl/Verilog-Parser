package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.DollartimeskewstrContext;

public class DollartimeskewstrContextExt extends AbstractBaseExt{

	@Getter private DollartimeskewstrContext ctx;

	public DollartimeskewstrContextExt(DollartimeskewstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dollartimeskewstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof DollartimeskewstrContext){
				this.ctx = (DollartimeskewstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+DollartimeskewstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
