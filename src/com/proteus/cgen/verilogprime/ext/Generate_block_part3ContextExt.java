package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_block_part3Context;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_itemContext;

public class Generate_block_part3ContextExt extends AbstractBaseExt{

	@Getter private Generate_block_part3Context ctx;

	public Generate_block_part3ContextExt(Generate_block_part3Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).generate_block_part3());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Generate_block_part3Context){
				this.ctx = (Generate_block_part3Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Generate_block_part3Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	public List<ParserRuleContext> getGenerateItems(){
		if(((Generate_block_part3Context)getContext()).generate_item() != null){
			List<ParserRuleContext> generate_itemContextsToReturn = new ArrayList<ParserRuleContext>();
			generate_itemContextsToReturn.addAll(((Generate_block_part3Context)getContext()).generate_item().extendedContext.getGenerateItems());
			return generate_itemContextsToReturn;
		} else {
			return ((Generate_block_part3Context)getContext()).generate_block().extendedContext.getGenerateItems();
		}
	}
}
