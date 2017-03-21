package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Full_path_descriptionContext;

public class Full_path_descriptionContextExt extends AbstractBaseExt{

	@Getter private Full_path_descriptionContext ctx;

	public Full_path_descriptionContextExt(Full_path_descriptionContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).full_path_description());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Full_path_descriptionContext){
				this.ctx = (Full_path_descriptionContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Full_path_descriptionContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
