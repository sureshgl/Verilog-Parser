package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_path_inputsContext;

public class List_of_path_inputsContextExt extends AbstractBaseExt{

	@Getter private List_of_path_inputsContext ctx;

	public List_of_path_inputsContextExt(List_of_path_inputsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).list_of_path_inputs());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof List_of_path_inputsContext){
				this.ctx = (List_of_path_inputsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+List_of_path_inputsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
