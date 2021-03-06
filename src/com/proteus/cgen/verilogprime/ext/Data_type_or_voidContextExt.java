package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_type_or_voidContext;

public class Data_type_or_voidContextExt extends AbstractBaseExt{

	@Getter private Data_type_or_voidContext ctx;

	public Data_type_or_voidContextExt(Data_type_or_voidContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).data_type_or_void());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Data_type_or_voidContext){
				this.ctx = (Data_type_or_voidContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Data_type_or_voidContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
