package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_declarationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_itemContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Non_port_module_itemContext;

public class Module_declarationContextExt extends AbstractBaseExt{

	@Getter private Module_declarationContext ctx;

	public Module_declarationContextExt(Module_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_declarationContext){
				this.ctx = (Module_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public List<Non_port_module_itemContext> getNonPortModuleItems(){
		List<Non_port_module_itemContext> moduleItemContexts = new ArrayList<Non_port_module_itemContext>();
		if(ctx.module_ansi_header() != null){
			for(Non_port_module_itemContext non_port_module_itemContext : ctx.non_port_module_item()){
				List<Non_port_module_itemContext> moduleItemContextsTemp = non_port_module_itemContext.extendedContext.getNonPortModuleItems();
				if(moduleItemContextsTemp != null){
					moduleItemContexts.addAll(moduleItemContextsTemp);
				}
			}
		} else if(ctx.module_nonansi_header() != null){
			for(Module_itemContext module_itemContext : ctx.module_item()){
				if(module_itemContext.non_port_module_item() != null){
					Non_port_module_itemContext non_port_module_itemContext = (Non_port_module_itemContext) ((Module_itemContext)module_itemContext.extendedContext.getContext()).non_port_module_item().extendedContext.getContext();
					List<Non_port_module_itemContext> moduleItemContextsTemp = non_port_module_itemContext.extendedContext.getNonPortModuleItems();
					if(moduleItemContextsTemp != null){
						moduleItemContexts.addAll(moduleItemContextsTemp);
					}
				}
			}
		}
		return moduleItemContexts;
	}

}
