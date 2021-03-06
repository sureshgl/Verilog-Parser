package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Package_import_itemContext;

public class Package_import_itemContextExt extends AbstractBaseExt{

	@Getter private Package_import_itemContext ctx;

	public Package_import_itemContextExt(Package_import_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).package_import_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Package_import_itemContext){
				this.ctx = (Package_import_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Package_import_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
