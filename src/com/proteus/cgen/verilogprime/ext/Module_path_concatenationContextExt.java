package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_path_concatenationContext;

public class Module_path_concatenationContextExt extends AbstractBaseExt{

	@Getter private Module_path_concatenationContext ctx;

	public Module_path_concatenationContextExt(Module_path_concatenationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_path_concatenation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_path_concatenationContext){
				this.ctx = (Module_path_concatenationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_path_concatenationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
