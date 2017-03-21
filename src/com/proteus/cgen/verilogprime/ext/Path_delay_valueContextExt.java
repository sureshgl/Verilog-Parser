package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Path_delay_valueContext;

public class Path_delay_valueContextExt extends AbstractBaseExt{

	@Getter private Path_delay_valueContext ctx;

	public Path_delay_valueContextExt(Path_delay_valueContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).path_delay_value());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Path_delay_valueContext){
				this.ctx = (Path_delay_valueContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Path_delay_valueContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
