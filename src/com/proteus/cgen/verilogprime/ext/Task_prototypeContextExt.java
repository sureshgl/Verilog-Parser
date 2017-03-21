package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Task_prototypeContext;

public class Task_prototypeContextExt extends AbstractBaseExt{

	@Getter private Task_prototypeContext ctx;

	public Task_prototypeContextExt(Task_prototypeContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).task_prototype());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Task_prototypeContext){
				this.ctx = (Task_prototypeContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Task_prototypeContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
