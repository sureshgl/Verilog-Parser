package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Statement_or_nullContext;

public class Statement_or_nullContextExt extends AbstractBaseExt{

	@Getter private Statement_or_nullContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Statement_or_nullContextExt(Statement_or_nullContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).statement_or_null());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Statement_or_nullContext){
				this.ctx = (Statement_or_nullContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Statement_or_nullContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(pragma_fn_statement_skip.contains(functionalityName)) {
			if(ctx.statement() != null && ctx.statement().statement_item() != null && ctx.statement().statement_item().seq_block() != null){
				params.getStringBuilder().append("{}\n");
			}
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
		else {
			super.getCString(params,classObj,moduleToParameters, functionalityName);
		}
	}
}
