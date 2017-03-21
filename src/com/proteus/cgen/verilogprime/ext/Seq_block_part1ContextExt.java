
package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Seq_block_part1Context;

public class Seq_block_part1ContextExt extends AbstractBaseExt{

	@Getter private Seq_block_part1Context ctx;

	public Seq_block_part1ContextExt(Seq_block_part1Context ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).seq_block_part1());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Seq_block_part1Context){
				this.ctx = (Seq_block_part1Context) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Seq_block_part1Context.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		params.getStringBuilder().append("{\n");
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
