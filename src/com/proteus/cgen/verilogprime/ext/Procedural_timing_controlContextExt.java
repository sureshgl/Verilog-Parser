package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Procedural_timing_controlContext;

public class Procedural_timing_controlContextExt extends AbstractBaseExt{

	@Getter private Procedural_timing_controlContext ctx;

	public Procedural_timing_controlContextExt(Procedural_timing_controlContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).procedural_timing_control());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Procedural_timing_controlContext){
				this.ctx = (Procedural_timing_controlContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Procedural_timing_controlContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
