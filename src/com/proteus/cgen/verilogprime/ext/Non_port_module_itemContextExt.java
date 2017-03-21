package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_port_module_itemContext;

public class Non_port_module_itemContextExt extends AbstractBaseExt{

	@Getter private Non_port_module_itemContext ctx;

	public Non_port_module_itemContextExt(Non_port_module_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).non_port_module_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Non_port_module_itemContext){
				this.ctx = (Non_port_module_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Non_port_module_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<Non_port_module_itemContext> getNonPortModuleItems(){
		Boolean shouldAdd = ctx.extendedContext.returnModuleItem();
		if(shouldAdd != null && shouldAdd){
			List<Non_port_module_itemContext> non_port_module_itemContexts = new ArrayList<Non_port_module_itemContext>();
			non_port_module_itemContexts.add(ctx);
			return non_port_module_itemContexts;
		}
		return null;
	}
}
