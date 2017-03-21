package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_virtual_interface_declContext;

public class List_of_virtual_interface_declContextExt extends AbstractBaseExt{

	@Getter private List_of_virtual_interface_declContext ctx;

	public List_of_virtual_interface_declContextExt(List_of_virtual_interface_declContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).list_of_virtual_interface_decl());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof List_of_virtual_interface_declContext){
				this.ctx = (List_of_virtual_interface_declContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+List_of_virtual_interface_declContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
