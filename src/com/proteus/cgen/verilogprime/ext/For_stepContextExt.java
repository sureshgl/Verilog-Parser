package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.For_stepContext;

public class For_stepContextExt extends AbstractBaseExt{

	@Getter private For_stepContext ctx;

	public For_stepContextExt(For_stepContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).for_step());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof For_stepContext){
				this.ctx = (For_stepContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+For_stepContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
//	@Override
//	public List<IStatement> PopulateStatements(){
//		List<IStatement> iStatements = new ArrayList<IStatement>();
//		if(ctx != null){
//			
//			Statement statement = new Statement(new HashSet<String>(), new HashSet<String>(), ctx);
//			iStatements.add(statement);
//		}
//		if(iStatements.size()>0){
//			return iStatements;
//		} else {
//			return null;
//		}
//	}
}
