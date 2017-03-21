package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.Variable;
import com.proteus.cgen.structures.SortVariable.TYPE;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_type_or_implicitContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Implicit_data_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_net_decl_assignmentsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_decl_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Net_declarationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Packed_dimensionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unpacked_dimensionContext;

public class Net_declarationContextExt extends AbstractBaseExt{

	@Getter private Net_declarationContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Net_declarationContextExt(Net_declarationContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).net_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Net_declarationContext){
				this.ctx = (Net_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Net_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void paint(SymbolTable st,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			if(ctx.list_of_net_decl_assignments() != null){
				//should do for the complete list.
				Net_decl_assignmentContext net_decl_assignmentContext = ((List_of_net_decl_assignmentsContext)ctx.list_of_net_decl_assignments().extendedContext.getContext()).net_decl_assignment(0);
				String before = net_decl_assignmentContext.extendedContext.getFormattedText();
				net_decl_assignmentContext.extendedContext.eval(st);
				String after = net_decl_assignmentContext.extendedContext.getFormattedText();
				Boolean containsAssign = (net_decl_assignmentContext.assign() != null);
				if(containsAssign &&  (!before.equals(after)) || st.containsKey(((Net_decl_assignmentContext)net_decl_assignmentContext.extendedContext.getContext()).net_identifier().getText())){
					if(((Net_decl_assignmentContext)net_decl_assignmentContext.extendedContext.getContext()).expression() != null){
						String expression = ((Net_decl_assignmentContext)net_decl_assignmentContext.extendedContext.getContext()).expression().extendedContext.getFormattedText();
						String net_identifier = ((Net_decl_assignmentContext)net_decl_assignmentContext.extendedContext.getContext()).net_identifier().extendedContext.getFormattedText();
						expression = st.containsKey(expression) ? st.get(expression) : expression;
						net_identifier = st.containsKey(net_identifier) ? st.get(net_identifier) : net_identifier;
						try{
							Float.parseFloat(expression);
							try{
								Float.parseFloat(net_identifier);
							}catch(NumberFormatException exception){
								if(!(net_decl_assignmentContext.unpacked_dimension() != null && net_decl_assignmentContext.unpacked_dimension().size()>0)){
									st.put(net_identifier,"0");
								}
							}
							if(!pragma_fn_statement_skip.contains(functionalityName))
								pragma_fn_statement_skip.add(functionalityName);
						}catch(NumberFormatException exception){
							try{
								Float.parseFloat(net_identifier);
								if(!pragma_fn_statement_skip.contains(functionalityName))
									pragma_fn_statement_skip.add(functionalityName);
							}catch(NumberFormatException exception1){

							}
						}
					}
				}
				undoEvaluatedStrings();
			}
		}
	}

	@Override
	public void Statements_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			super.Statements_to_null();
			//			addToContexts(null);
		}
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(ctx != null){
				if(ctx.drive_strength() != null || ctx.charge_strength() != null || ctx.delay3() != null)
					BailoutRule(ctx.getClass().getName(), ctx.extendedContext.getFormattedText());
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();
				if(ctx.data_type_or_implicit() != null){
					List<String> varList = ctx.data_type_or_implicit().extendedContext.Identifiers();
					for( String var : varList){
						SortVariable sVar = new SortVariable();
						sVar.setType(TYPE.simple);
						sVar.setParentName(var);
						rVariables.add(sVar);
					}
				}
				if(ctx.list_of_net_decl_assignments() != null ){
					List<IStatement> childStatements = ctx.list_of_net_decl_assignments().extendedContext.PopulateStatements(functionalityName);
					for(IStatement childStatement : childStatements) {
						lVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
					}
				}
				Statement statement = new Statement(lVariables, rVariables, ctx);
				iStatements.add(statement);
			}
			if(iStatements.size()>0){
				return iStatements;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	@Override
	public void getClassInfo(CClass classobj, Map<String, List<Parameter>> moduleToParameters){
		if(ctx.net_type().extendedContext.getFormattedText().equals("wire")){
			String size = "";
			if(ctx.data_type_or_implicit().getText().equals("")){
				size = "1";
			}  else {
				Data_type_or_implicitContext data_type_or_implicitContext= (Data_type_or_implicitContext) ctx.data_type_or_implicit().extendedContext.getContext();
				if(data_type_or_implicitContext.data_type() != null){
					Packed_dimensionContext packed_dimensionContext = ((Data_typeContext)data_type_or_implicitContext.data_type().extendedContext.getContext()).packed_dimension(0);
					String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
					String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
					size = left + "-" + right+"+1";
				}else if(data_type_or_implicitContext.implicit_data_type() != null){
					Packed_dimensionContext packed_dimensionContext = ((Implicit_data_typeContext)data_type_or_implicitContext.implicit_data_type().extendedContext.getContext()).packed_dimension(0);
					String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
					String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
					size = left + "-" + right+"+1";
				}
			}
			List<Net_decl_assignmentContext> net_decl_assignmentContexts = ((List_of_net_decl_assignmentsContext)ctx.list_of_net_decl_assignments().extendedContext.getContext()).net_decl_assignment();
			for(Net_decl_assignmentContext net_decl_assignmentContext:net_decl_assignmentContexts){
				String name = net_decl_assignmentContext.net_identifier().extendedContext.getFormattedText();
				if(net_decl_assignmentContext.unpacked_dimension() !=  null && net_decl_assignmentContext.unpacked_dimension().size()>0){
					List<String> dimensions = new ArrayList<String>();
					String starStar = "";
					List<Unpacked_dimensionContext> unpacked_dimensionContexts = net_decl_assignmentContext.unpacked_dimension();
					for(Unpacked_dimensionContext unpacked_dimensionContext : unpacked_dimensionContexts){
						Unpacked_dimensionContext Unpacked_dimensionContextTemp = (Unpacked_dimensionContext)unpacked_dimensionContext.extendedContext.getContext();
						if(Unpacked_dimensionContextTemp.constant_range() != null){
							String left = Unpacked_dimensionContextTemp.constant_range().constant_expression(0).extendedContext.getFormattedText();
							String right = Unpacked_dimensionContextTemp.constant_range().constant_expression(1).extendedContext.getFormattedText();
							String tempSize = right + "-" +left+"+1";
							dimensions.add(tempSize);
							starStar = starStar+"*";
						}
					}
					String declaration = "kiwibitset"+starStar+" " + name+";";
					String initialization = name+"(initialize_array("+dimensions.get(0);
					for(int i=1;i<dimensions.size();i++){
						initialization = initialization + ","+dimensions.get(i);
					}
					initialization = initialization+","+size;
					initialization = initialization + "))";
					Variable variable = new Variable(name,declaration,initialization,false);
					if(!classobj.contains(variable.getName())){
						//classobj.addToInputVariables(variable);
					}
				} else {
					Variable variable = new Variable(name,"kiwibitset "+name+";",name +"(kiwibitset("+size+",0))",false);
					if(!classobj.contains(variable.getName())){
						//classobj.addToInputVariables(variable);
					}
				}
			}
		}
	}

	@Override
	protected Boolean returnModuleItem(){
		return true;
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			if(ctx.net_type().extendedContext.getFormattedText().equals("wire")){
				String size = "";
				if(ctx.data_type_or_implicit().getText().equals("")){
					size = "1";
				}  else {
					Data_type_or_implicitContext data_type_or_implicitContext= (Data_type_or_implicitContext) ctx.data_type_or_implicit().extendedContext.getContext();
					if(data_type_or_implicitContext.data_type() != null){
						Packed_dimensionContext packed_dimensionContext = ((Data_typeContext)data_type_or_implicitContext.data_type().extendedContext.getContext()).packed_dimension(0);
						String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
						String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
						size = left + "-" + right+"+1";
					}else if(data_type_or_implicitContext.implicit_data_type() != null){
						Packed_dimensionContext packed_dimensionContext = ((Implicit_data_typeContext)data_type_or_implicitContext.implicit_data_type().extendedContext.getContext()).packed_dimension(0);
						String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
						String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
						size = left + "-" + right+"+1";
					}
				}
				List<Net_decl_assignmentContext> net_decl_assignmentContexts = ((List_of_net_decl_assignmentsContext)ctx.list_of_net_decl_assignments().extendedContext.getContext()).net_decl_assignment();
				for(Net_decl_assignmentContext net_decl_assignmentContext:net_decl_assignmentContexts){
					String name = net_decl_assignmentContext.net_identifier().extendedContext.getFormattedText();
					if(net_decl_assignmentContext.unpacked_dimension() !=  null && net_decl_assignmentContext.unpacked_dimension().size()>0){
						List<String> dimensions = new ArrayList<String>();
						String starStar = "";
						List<Unpacked_dimensionContext> unpacked_dimensionContexts = net_decl_assignmentContext.unpacked_dimension();
						for(Unpacked_dimensionContext unpacked_dimensionContext : unpacked_dimensionContexts){
							Unpacked_dimensionContext Unpacked_dimensionContextTemp = (Unpacked_dimensionContext)unpacked_dimensionContext.extendedContext.getContext();
							if(Unpacked_dimensionContextTemp.constant_range() != null){
								String left = Unpacked_dimensionContextTemp.constant_range().constant_expression(0).extendedContext.getFormattedText();
								String right = Unpacked_dimensionContextTemp.constant_range().constant_expression(1).extendedContext.getFormattedText();
								String tempSize = right + "-" +left+"+1";
								dimensions.add(tempSize);
								starStar = starStar+"*";
							}
						}
						String declaration = "kiwibitset"+starStar+" " + name+";";
						String initialization = "(initialize_array("+dimensions.get(0);
						for(int i=1;i<dimensions.size();i++){
							initialization = initialization + ","+dimensions.get(i);
						}
						initialization = initialization+","+size;
						initialization = initialization + "))";
						params.getStringBuilder().append(declaration + " = " + initialization+"\n");
					} else {
						params.getStringBuilder().append("kiwibitset " +name + " =  (kiwibitset("+size+",0));\n");
					}
					if(net_decl_assignmentContext.assign() != null){
						super.getCString(params, classObj, moduleToParameters, functionalityName);
					}
				}

			}
			//super.getCString(params, classObj, moduleToParameters, functionalityName);
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters, String fucntionalityName){
		return null;
	}
}
