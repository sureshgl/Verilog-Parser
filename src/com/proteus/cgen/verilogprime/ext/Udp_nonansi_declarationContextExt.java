package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Udp_nonansi_declarationContext;

public class Udp_nonansi_declarationContextExt extends AbstractBaseExt{

	@Getter private Udp_nonansi_declarationContext ctx;

	public Udp_nonansi_declarationContextExt(Udp_nonansi_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).udp_nonansi_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Udp_nonansi_declarationContext){
				this.ctx = (Udp_nonansi_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Udp_nonansi_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public void paint(SymbolTable st,String functionalityName) {
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.getText());
		}
	}
}
