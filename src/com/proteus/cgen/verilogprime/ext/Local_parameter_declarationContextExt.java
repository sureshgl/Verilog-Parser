package com.proteus.cgen.verilogprime.ext;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.Variable;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_param_assignmentsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Local_parameter_declarationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Param_assignmentContext;

public class Local_parameter_declarationContextExt extends AbstractBaseExt{

	@Getter private Local_parameter_declarationContext ctx;

	public Local_parameter_declarationContextExt(Local_parameter_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).local_parameter_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Local_parameter_declarationContext){
				this.ctx = (Local_parameter_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Local_parameter_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void Statements_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			addToContexts(null);
		}
	}

	@Override
	public void getClassInfo(CClass classobj, Map<String, List<Parameter>> moduleToParameters){
		if(ctx.typestr() == null){
			List_of_param_assignmentsContext list_of_param_assignmentsContext = (List_of_param_assignmentsContext) ctx.list_of_param_assignments().extendedContext.getContext();
			for(Param_assignmentContext param_assignmentContext : list_of_param_assignmentsContext.param_assignment()){
				Param_assignmentContext param_assignmentContextTemp = (Param_assignmentContext) param_assignmentContext.extendedContext.getContext();
				String name = param_assignmentContextTemp.parameter_identifier().getText();
				String value = "";
				if(param_assignmentContextTemp.constant_param_expression() != null && param_assignmentContextTemp.constant_param_expression().size()>0){
					value = param_assignmentContextTemp.constant_param_expression(0).extendedContext.getFormattedText();
				}
				Parameter parameter = new Parameter();
				parameter.setDefaultValue(value);
				parameter.setName(name);
				classobj.addToLocalParamVariables(parameter);
			}
		}
	}

	@Override
	public void paint(SymbolTable st, String functionalityName) {
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.getText());
		}
	}
}
