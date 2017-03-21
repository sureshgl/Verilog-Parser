package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pass_enable_switch_instanceContext;

public class Pass_enable_switch_instanceContextExt extends AbstractBaseExt{

	@Getter private Pass_enable_switch_instanceContext ctx;

	public Pass_enable_switch_instanceContextExt(Pass_enable_switch_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pass_enable_switch_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pass_enable_switch_instanceContext){
				this.ctx = (Pass_enable_switch_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pass_enable_switch_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
