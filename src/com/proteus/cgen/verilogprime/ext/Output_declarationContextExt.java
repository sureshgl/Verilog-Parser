package com.proteus.cgen.verilogprime.ext;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.structures.Variable;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_type_or_implicitContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_port_identifiersContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_port_identifiers_part1Context;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_port_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Output_declarationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Packed_dimensionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unpacked_dimensionContext;

public class Output_declarationContextExt extends AbstractBaseExt{

	@Getter private Output_declarationContext ctx;

	public Output_declarationContextExt(Output_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).output_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Output_declarationContext){
				this.ctx = (Output_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Output_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	public void getPorts(List<String> portsOfAFunctionality,List<String> ports){
		String text = getFormattedText();
		for(String portName:portsOfAFunctionality){
			if(text.contains(portName)){
				ports.add(text);
				break;
			}
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
	public List<IStatement> PopulateStatements(String functionalityName){
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(ctx != null){
			Set<SortVariable> rVariables = new HashSet<SortVariable>();
			Set<SortVariable> lVariables = new HashSet<SortVariable>();
			List<IStatement> childStatements = super.PopulateStatements(functionalityName);
			for(IStatement childStatement : childStatements) {
				lVariables.addAll(childStatement.getLeftVariables());
				rVariables.addAll(childStatement.getRightVariables());
			}
			Statement statement = new Statement(lVariables, rVariables, ctx);
			iStatements.add(statement);
		}
		if(iStatements.size()>0){
			return iStatements;
		} else {
			return null;
		}
	}

	@Override
	public void getClassInfo(CClass classobj, Map<String, List<Parameter>> moduleToParameters){
		String size = "1";
		if(ctx.net_port_type() != null && ctx.net_port_type().getText().length()>0){
			Data_type_or_implicitContext data_type_or_implicitContext = ((Net_port_typeContext)ctx.net_port_type().extendedContext.getContext()).data_type_or_implicit();
			if(data_type_or_implicitContext != null){
				Data_type_or_implicitContext data_type_or_implicitContextTemp = (Data_type_or_implicitContext) data_type_or_implicitContext.extendedContext.getContext();
				if(data_type_or_implicitContextTemp.data_type() != null){
					Data_typeContext data_typeContext = (Data_typeContext) data_type_or_implicitContextTemp.data_type().extendedContext.getContext();
					if(data_typeContext.integer_vector_type() != null && data_typeContext.integer_vector_type().extendedContext.getFormattedText().equals("reg")){
						if(((Data_typeContext)data_type_or_implicitContextTemp.data_type().extendedContext.getContext()).packed_dimension() != null && ((Data_typeContext)data_type_or_implicitContextTemp.data_type().extendedContext.getContext()).packed_dimension().size()>1){
							BailoutRule("Input_declaration", getFormattedText());
						}
						Packed_dimensionContext packed_dimensionContext = ((Data_typeContext)data_type_or_implicitContextTemp.data_type().extendedContext.getContext()).packed_dimension(0);
						if(packed_dimensionContext != null){
							String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
							String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
							size = left + "-" + right+"+1";
						}
					}
				}
			}
		}
		if(ctx.list_of_port_identifiers() != null){
			List_of_port_identifiersContext list_of_port_identifiersContext = (List_of_port_identifiersContext) ctx.list_of_port_identifiers().extendedContext.getContext();
			for(List_of_port_identifiers_part1Context list_of_port_identifiers_part1Context :list_of_port_identifiersContext.list_of_port_identifiers_part1()){
				String name = list_of_port_identifiers_part1Context.port_identifier().getText();
				if(list_of_port_identifiers_part1Context.unpacked_dimension() != null && list_of_port_identifiers_part1Context.unpacked_dimension().size()>0){
					List<String> variableDimensions = new ArrayList<String>();
					String starString = "";
					for(Unpacked_dimensionContext unpacked_dimensionContext : list_of_port_identifiers_part1Context.unpacked_dimension()){
						Unpacked_dimensionContext unpacked_dimensionContextTemp = (Unpacked_dimensionContext)unpacked_dimensionContext.extendedContext.getContext();
						if(unpacked_dimensionContextTemp != null){
							if(unpacked_dimensionContextTemp.constant_range()!=null){
								String left = ((Constant_rangeContext)unpacked_dimensionContextTemp.constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
								String right = ((Constant_rangeContext)unpacked_dimensionContextTemp.constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
								variableDimensions.add(right + "-" + left+"+1");
								starString = starString+"*";
							}else{
								String left = unpacked_dimensionContextTemp.constant_expression().extendedContext.getFormattedText();
								variableDimensions.add(left);
								starString = starString+"*";
							}
						}
					}
					String initialization = name+"(initialize_array("+variableDimensions.get(0);
					for(int i=1;i<variableDimensions.size();i++){
						initialization = initialization + ","+variableDimensions.get(i);
					}
					initialization = initialization+","+size;
					initialization = initialization + "))";
					//add destruction
					Variable variable = new Variable(name,"kiwibitset"+starString+" "+name+";",initialization,false);
					if(!classobj.contains(variable.getName())){
						classobj.addToOutputPorts(variable);
					}
				} else {
					Variable variable = new Variable(name,"kiwibitset* "+name+";",name +"(new kiwibitset("+size+",0))",false);
					if(!classobj.contains(variable.getName())){
						classobj.addToOutputPorts(variable);
					}
				}
			}
		}
	}
	
	@Override
	public void paint(SymbolTable symbolTable, String functionalityName) {
		if(ctx != null){
			BailoutRule(ctx.getClass().getName(), ctx.getText());
		}
	}
	
	@Override
	protected Boolean returnModuleItem(){
		return false;
	}
}
