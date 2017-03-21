package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Method_call_rootContext;

public class Method_call_rootContextExt extends AbstractBaseExt{

	@Getter private Method_call_rootContext ctx;

	public Method_call_rootContextExt(Method_call_rootContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).method_call_root());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Method_call_rootContext){
				this.ctx = (Method_call_rootContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Method_call_rootContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
