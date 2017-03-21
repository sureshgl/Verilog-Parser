package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_identifierContext;

public class Hierarchical_identifierContextExt extends AbstractBaseExt{

	@Getter private Hierarchical_identifierContext ctx;

	public Hierarchical_identifierContextExt(Hierarchical_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).hierarchical_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Hierarchical_identifierContext){
				this.ctx = (Hierarchical_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Hierarchical_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<String> getHierarchicalIdentifier(){
		List<String> hierarchical_identifier = new ArrayList<String>();
		hierarchical_identifier = ctx.extendedContext.Identifiers();
		if(hierarchical_identifier.size()>0)
			return hierarchical_identifier;
		else 
			return null;
	}
}
