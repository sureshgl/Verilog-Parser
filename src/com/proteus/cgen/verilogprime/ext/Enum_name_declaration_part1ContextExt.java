package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Enum_name_declaration_part1Context;

public class Enum_name_declaration_part1ContextExt extends AbstractBaseExt{

	@Getter private Enum_name_declaration_part1Context ctx;

	public Enum_name_declaration_part1ContextExt(Enum_name_declaration_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).enum_name_declaration_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Enum_name_declaration_part1Context){
				this.ctx = (Enum_name_declaration_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Enum_name_declaration_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
