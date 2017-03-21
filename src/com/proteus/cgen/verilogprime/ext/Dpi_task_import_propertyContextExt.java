package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Dpi_task_import_propertyContext;

public class Dpi_task_import_propertyContextExt extends AbstractBaseExt{

	@Getter private Dpi_task_import_propertyContext ctx;

	public Dpi_task_import_propertyContextExt(Dpi_task_import_propertyContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).dpi_task_import_property());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Dpi_task_import_propertyContext){
				this.ctx = (Dpi_task_import_propertyContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Dpi_task_import_propertyContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
