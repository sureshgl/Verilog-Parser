package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Procedural_continuous_assignmentContext;

public class Procedural_continuous_assignmentContextExt extends AbstractBaseExt{

	@Getter private Procedural_continuous_assignmentContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Procedural_continuous_assignmentContextExt(Procedural_continuous_assignmentContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).procedural_continuous_assignment());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Procedural_continuous_assignmentContext){
				this.ctx = (Procedural_continuous_assignmentContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Procedural_continuous_assignmentContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			ExtendedContextVisitor visitor = new ExtendedContextVisitor();
			params.getStringBuilder().append(visitor.visit(ctx.getChild(1)).getCString(classObj, moduleToParameters,functionalityName));
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}
	
	@Override
    public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters, String fucntionalityName){
        return null;
    }
}
