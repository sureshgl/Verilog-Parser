package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Edge_sensitive_path_declarationContext;

public class Edge_sensitive_path_declarationContextExt extends AbstractBaseExt{

	@Getter private Edge_sensitive_path_declarationContext ctx;

	public Edge_sensitive_path_declarationContextExt(Edge_sensitive_path_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).edge_sensitive_path_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Edge_sensitive_path_declarationContext){
				this.ctx = (Edge_sensitive_path_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Edge_sensitive_path_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
