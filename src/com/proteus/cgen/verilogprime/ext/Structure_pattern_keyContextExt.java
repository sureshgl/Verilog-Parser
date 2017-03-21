package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Structure_pattern_keyContext;

public class Structure_pattern_keyContextExt extends AbstractBaseExt{

	@Getter private Structure_pattern_keyContext ctx;

	public Structure_pattern_keyContextExt(Structure_pattern_keyContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).structure_pattern_key());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Structure_pattern_keyContext){
				this.ctx = (Structure_pattern_keyContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Structure_pattern_keyContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
