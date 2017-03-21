package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Anonymous_programContext;
import com.proteus.cgen.structures.IStatement;

import java.util.List;
import java.util.Set;

public class Anonymous_programContextExt extends AbstractBaseExt{

	@Getter private Anonymous_programContext ctx;

	public Anonymous_programContextExt(Anonymous_programContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).anonymous_program());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Anonymous_programContext){
				this.ctx = (Anonymous_programContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Anonymous_programContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.extendedContext.getFormattedText());
		}
		return null;
	}
}
