package com.proteus.cgen.verilogprime.ext;

import org.antlr.v4.runtime.ParserRuleContext;

import java.io.File;
import java.util.List;
import java.util.Map;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;

import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.structures.Variable;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Ansi_port_declarationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_type_or_implicitContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Implicit_data_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_port_headerContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_port_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Packed_dimensionContext;

public class Ansi_port_declarationContextExt extends AbstractBaseExt{

	@Getter private Ansi_port_declarationContext ctx;

	public Ansi_port_declarationContextExt(Ansi_port_declarationContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).ansi_port_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Ansi_port_declarationContext){
				this.ctx = (Ansi_port_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Ansi_port_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void Statements_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			super.Statements_to_null();
			addToContexts(null);
		}
	}

	@Override
	public void getClassInfo(CClass classobj, Map<String, List<Parameter>> moduleToParameters){
		if(ctx.net_port_header() != null){
			Net_port_headerContext net_port_headerContext = (Net_port_headerContext) ctx.net_port_header().extendedContext.getContext();
			String type = net_port_headerContext.port_direction().extendedContext.getFormattedText();
			String name = ctx.port_identifier().extendedContext.getFormattedText();
			Net_port_typeContext net_port_typeContext = (Net_port_typeContext) net_port_headerContext.net_port_type().extendedContext.getContext();
			Data_type_or_implicitContext data_type_or_implicitContext= (Data_type_or_implicitContext) (net_port_typeContext.data_type_or_implicit().extendedContext.getContext());
			if(data_type_or_implicitContext.data_type() != null){
				Data_typeContext data_typeContext = (Data_typeContext) data_type_or_implicitContext.data_type().extendedContext.getContext();
				if(data_typeContext.packed_dimension() !=null && data_typeContext.packed_dimension().size()>0){
					Packed_dimensionContext packed_dimensionContext = data_typeContext.packed_dimension(0);
					String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
					String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
					String size = left + "-" + right+"+1";
					if(type.equals("input")){
						Variable variable = new Variable(name,"kiwibitset "+name+";",name+"(kiwibitset("+size+",0))",false);
						classobj.addToInputPorts(variable);
					} else if(type.equals("output")){
						Variable variable = new Variable(name,"kiwibitset* "+name+";",name+"(new kiwibitset("+size+",0))","delete "+name+";",false);
						classobj.addToOutputPorts(variable);
					}
				}else {
					if(type.equals("input")){
						Variable variable = new Variable(name,"kiwibitset "+name+";",name+"(kiwibitset(1,0))",false);
						classobj.addToInputPorts(variable);
					} else if(type.equals("output")){
						Variable variable = new Variable(name,"kiwibitset* "+name+";",name+"(new kiwibitset(1,0))","delete "+name+";",false);
						classobj.addToOutputPorts(variable);
					}
				}
			} else if(data_type_or_implicitContext.implicit_data_type() != null){
				//check for multiple packed dimensions
				Packed_dimensionContext packed_dimensionContext = ((Implicit_data_typeContext)data_type_or_implicitContext.implicit_data_type().extendedContext.getContext()).packed_dimension(0);
				String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
				String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
				String size = left + "-" + right+"+1";
				if(type.equals("input")){
					Variable variable = new Variable(name,"kiwibitset "+name+";",name+"(kiwibitset("+size+",0))",false);
					classobj.addToInputPorts(variable);
				} else if(type.equals("output")){
					Variable variable = new Variable(name,"kiwibitset* "+name+";",name+"(new kiwibitset("+size+",0))","delete "+name+";",false);
					classobj.addToOutputPorts(variable);
				}
			}
		}
	}
}
