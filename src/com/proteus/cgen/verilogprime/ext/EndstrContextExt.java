package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.EndstrContext;

public class EndstrContextExt extends AbstractBaseExt{

	@Getter private EndstrContext ctx;

	public EndstrContextExt(EndstrContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).endstr());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof EndstrContext){
				this.ctx = (EndstrContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+EndstrContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	protected void getCString(Params params, CClass classObj,Map<String, List<Parameter>> moduleToParameters, String functionalityName){
		params.getStringBuilder().append("\n}\n");
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
