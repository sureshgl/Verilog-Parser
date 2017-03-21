package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_event_identifierContext;

public class Hierarchical_event_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_event_identifierContext ctx;

	public Hierarchical_event_identifierContextExt(Hierarchical_event_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_event_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_event_identifierContext){
				this.ctx = (Hierarchical_event_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_event_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
