package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.System_tf_identifierContext;

public class System_tf_identifierContextExt extends AbstractBaseExt{

	@Getter private System_tf_identifierContext ctx;

	public System_tf_identifierContextExt(System_tf_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).system_tf_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof System_tf_identifierContext){
				this.ctx = (System_tf_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+System_tf_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
