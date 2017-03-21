package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

import com.proteus.cgen.pragma.PragmaRegister;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Params;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_defContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;

public class Pragma_defContextExt extends AbstractBaseExt{

	@Getter private Pragma_defContext ctx;
	private static final Logger L = LoggerFactory.getLogger(Pragma_defContextExt.class);

	public Pragma_defContextExt(Pragma_defContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).pragma_def());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Pragma_defContext){
				this.ctx = (Pragma_defContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Pragma_defContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void processPragma(String pragmaId){
		String ID = ctx.PRAGMA_ID().getText();
		if(ID.equals(pragmaId)){
			Pragma_textContext ptc = ctx.pragma_text();
			PragmaRegister.get(ID).process(ptc);
			L.debug("Registered "+ptc.getText());
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
	}
}
