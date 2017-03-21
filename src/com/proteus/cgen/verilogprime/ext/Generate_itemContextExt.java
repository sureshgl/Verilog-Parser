package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.Statement;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_itemContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_or_generate_itemContext;

public class Generate_itemContextExt extends AbstractBaseExt{

	@Getter private Generate_itemContext ctx;

	public Generate_itemContextExt(Generate_itemContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).generate_item());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Generate_itemContext){
				this.ctx = (Generate_itemContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Generate_itemContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			if(ctx.interface_or_generate_item() != null || ctx.checker_or_generate_item() != null)
				BailoutRule(ctx.getClass().getName(), ctx.extendedContext.getFormattedText());

			List<IStatement> childStatements = super.PopulateStatements(functionalityName);
			for(IStatement childStatement : childStatements) {
				Statement statement = new Statement(childStatement.getLeftVariables(), childStatement.getRightVariables(), childStatement.getContext());
				iStatements.add(statement);
			}
		}
		if(iStatements.size()>0){
			return iStatements;
		} else {
			return null;
		}
	}
	
	public List<ParserRuleContext> getGenerateItems(){
		if(ctx.module_or_generate_item() != null){
			Module_or_generate_itemContext module_or_generate_itemContext = (Module_or_generate_itemContext) ctx.module_or_generate_item().extendedContext.getContext();
			if(module_or_generate_itemContext.module_instantiation() != null){
				return module_or_generate_itemContext.module_instantiation().extendedContext.getGenerateItems();
			}
		}
		List<ParserRuleContext> parserRuleContexts = new ArrayList<ParserRuleContext>();
		parserRuleContexts.add(getContext());
		return parserRuleContexts;
	}
}
