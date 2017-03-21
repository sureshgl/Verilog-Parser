package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Udp_declaration_port_listContext;

public class Udp_declaration_port_listContextExt extends AbstractBaseExt{

	@Getter private Udp_declaration_port_listContext ctx;

	public Udp_declaration_port_listContextExt(Udp_declaration_port_listContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).udp_declaration_port_list());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Udp_declaration_port_listContext){
				this.ctx = (Udp_declaration_port_listContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Udp_declaration_port_listContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
