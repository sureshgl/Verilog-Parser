package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_or_generate_itemContext;

public class Module_or_generate_itemContextExt extends AbstractBaseExt{

	@Getter private Module_or_generate_itemContext ctx;

	public Module_or_generate_itemContextExt(Module_or_generate_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_or_generate_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_or_generate_itemContext){
				this.ctx = (Module_or_generate_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_or_generate_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
