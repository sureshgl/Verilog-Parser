package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.OrimpliesContext;

public class OrimpliesContextExt extends AbstractBaseExt{

	@Getter private OrimpliesContext ctx;

	public OrimpliesContextExt(OrimpliesContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).orimplies());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof OrimpliesContext){
				this.ctx = (OrimpliesContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+OrimpliesContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
