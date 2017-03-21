package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.PathpulsedollarContext;

public class PathpulsedollarContextExt extends AbstractBaseExt{

	@Getter private PathpulsedollarContext ctx;

	public PathpulsedollarContextExt(PathpulsedollarContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pathpulsedollar());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof PathpulsedollarContext){
				this.ctx = (PathpulsedollarContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+PathpulsedollarContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
