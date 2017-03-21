package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Enable_gate_instanceContext;

public class Enable_gate_instanceContextExt extends AbstractBaseExt{

	@Getter private Enable_gate_instanceContext ctx;

	public Enable_gate_instanceContextExt(Enable_gate_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).enable_gate_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Enable_gate_instanceContext){
				this.ctx = (Enable_gate_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Enable_gate_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
