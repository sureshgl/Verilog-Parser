package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_task_identifierContext;

public class Hierarchical_task_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_task_identifierContext ctx;

	public Hierarchical_task_identifierContextExt(Hierarchical_task_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_task_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_task_identifierContext){
				this.ctx = (Hierarchical_task_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_task_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
