package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Simple_path_declarationContext;

public class Simple_path_declarationContextExt extends AbstractBaseExt{

	@Getter private Simple_path_declarationContext ctx;

	public Simple_path_declarationContextExt(Simple_path_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).simple_path_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Simple_path_declarationContext){
				this.ctx = (Simple_path_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Simple_path_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
