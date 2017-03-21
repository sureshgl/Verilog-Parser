package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import lombok.Getter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.QuestinmarkContext;

public class QuestinmarkContextExt extends AbstractBaseExt{

	@Getter private QuestinmarkContext ctx;

	public QuestinmarkContextExt(QuestinmarkContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).questinmark());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof QuestinmarkContext){
				this.ctx = (QuestinmarkContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+QuestinmarkContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
}
