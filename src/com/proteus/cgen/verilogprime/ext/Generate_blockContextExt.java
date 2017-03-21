package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_blockContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_block_part3Context;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_itemContext;

public class Generate_blockContextExt extends AbstractBaseExt{

	@Getter private Generate_blockContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Generate_blockContextExt(Generate_blockContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).generate_block());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Generate_blockContext){
				this.ctx = (Generate_blockContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Generate_blockContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			params.getStringBuilder().append(" { \n");
			super.getCString(params, classObj, moduleToParameters, functionalityName);
			params.getStringBuilder().append("\n } \n");
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters, String fName){
		if(!pragma_fn_statement_skip.contains(fName)){
			if(ctx.generate_block_part1() != null){
				StringBuilder sb = new StringBuilder();
				for(Generate_block_part3Context generate_block_part3Context: ctx.generate_block_part3()){
					String temp = generate_block_part3Context.extendedContext.getAssignString(classObj, moduleToParameters, fName);
					if(temp != null){
						sb.append(generate_block_part3Context.extendedContext.getAssignString(classObj, moduleToParameters,fName)+"\n");
					} 
				}
				if(sb.toString().equals("")){
					return null; 
				} else {
					return sb.toString();
				}
			} else {
				String temp = ctx.generate_item().extendedContext.getAssignString(classObj, moduleToParameters, fName);
				if(temp != null){
					return temp;
				} else {
					return null;
				}
			}
		} else {
			return "";
		}
	}
	
	public List<ParserRuleContext> getGenerateItems(){
		List<ParserRuleContext> generate_itemContextsToReturn = new ArrayList<ParserRuleContext>();
		if(((Generate_blockContext)getContext()).generate_item() != null){
			generate_itemContextsToReturn.add((Generate_itemContext)((Generate_blockContext)getContext()).generate_item().extendedContext.getGenerateItems());
		} else {
			List<Generate_block_part3Context> generate_block_part3Contexts = ((Generate_blockContext)getContext()).generate_block_part3();
			for(Generate_block_part3Context generate_block_part3Context : generate_block_part3Contexts){
				generate_itemContextsToReturn.addAll(generate_block_part3Context.extendedContext.getGenerateItems());
			}
		}
		return generate_itemContextsToReturn;
	}
}
