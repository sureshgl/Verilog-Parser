package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_path_primaryContext;

public class Module_path_primaryContextExt extends AbstractBaseExt{

	@Getter private Module_path_primaryContext ctx;

	public Module_path_primaryContextExt(Module_path_primaryContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_path_primary());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_path_primaryContext){
				this.ctx = (Module_path_primaryContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_path_primaryContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
