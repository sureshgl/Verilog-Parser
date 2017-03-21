package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_path_outputsContext;

public class List_of_path_outputsContextExt extends AbstractBaseExt{

	@Getter private List_of_path_outputsContext ctx;

	public List_of_path_outputsContextExt(List_of_path_outputsContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).list_of_path_outputs());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof List_of_path_outputsContext){
				this.ctx = (List_of_path_outputsContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+List_of_path_outputsContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
