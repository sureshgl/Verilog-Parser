package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Trans_range_listContext;

public class Trans_range_listContextExt extends AbstractBaseExt{

	@Getter private Trans_range_listContext ctx;

	public Trans_range_listContextExt(Trans_range_listContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).trans_range_list());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Trans_range_listContext){
				this.ctx = (Trans_range_listContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Trans_range_listContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
