package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Parallel_path_descriptionContext;

public class Parallel_path_descriptionContextExt extends AbstractBaseExt{

	@Getter private Parallel_path_descriptionContext ctx;

	public Parallel_path_descriptionContextExt(Parallel_path_descriptionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).parallel_path_description());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Parallel_path_descriptionContext){
				this.ctx = (Parallel_path_descriptionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Parallel_path_descriptionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
