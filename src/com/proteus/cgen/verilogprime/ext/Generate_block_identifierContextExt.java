package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import lombok.Getter;

import com.proteus.cgen.runner.ProteusRunnerSession;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Generate_block_identifierContext;

public class Generate_block_identifierContextExt extends AbstractBaseExt{

	@Getter private Generate_block_identifierContext ctx;
	private String evaluatedString;

	public Generate_block_identifierContextExt(Generate_block_identifierContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).generate_block_identifier());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Generate_block_identifierContext){
				this.ctx = (Generate_block_identifierContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Generate_block_identifierContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}
	
	@Override
	protected void getFormattedText(Params params){
		if(evaluatedString != null){
			params.getStringBuilder().append(params.getInput().getText(new Interval(params.getBeginingOfAlignemtText(), params.getContext().start.getStartIndex()-1)));
			params.getStringBuilder().append(evaluatedString);
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			super.getFormattedText(params);
		}
	}
	
	@Override
	public void renameGenvarBlocks(){
		String[] text = getFormattedText().split(" ");
		StringBuilder sb = new StringBuilder();
		sb.append(text[0]+ProteusRunnerSession.generateBlockSuffix++);
		for(int i=1;i<text.length;i++){
			sb.append(" "+text[i]);
		}
		evaluatedString = sb.toString();
		if(evaluatedString.contains("pragma")){
			evaluatedString = evaluatedString+"\n";
		}
	}
}
