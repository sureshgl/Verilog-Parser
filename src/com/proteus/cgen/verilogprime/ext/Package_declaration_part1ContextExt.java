package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Package_declaration_part1Context;

public class Package_declaration_part1ContextExt extends AbstractBaseExt{

	@Getter private Package_declaration_part1Context ctx;

	public Package_declaration_part1ContextExt(Package_declaration_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).package_declaration_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Package_declaration_part1Context){
				this.ctx = (Package_declaration_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Package_declaration_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
