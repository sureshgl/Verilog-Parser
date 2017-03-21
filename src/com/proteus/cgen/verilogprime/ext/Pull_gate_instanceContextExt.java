package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pull_gate_instanceContext;

public class Pull_gate_instanceContextExt extends AbstractBaseExt{

	@Getter private Pull_gate_instanceContext ctx;

	public Pull_gate_instanceContextExt(Pull_gate_instanceContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pull_gate_instance());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pull_gate_instanceContext){
				this.ctx = (Pull_gate_instanceContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pull_gate_instanceContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
