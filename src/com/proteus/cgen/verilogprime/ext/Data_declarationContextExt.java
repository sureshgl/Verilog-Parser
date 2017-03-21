package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.v4.runtime.ParserRuleContext;

import lombok.Getter;

import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.structures.Variable;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Constant_rangeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_declarationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_typeContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Data_type_or_implicitContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_variable_decl_assignmentsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Packed_dimensionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Unpacked_dimensionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_decl_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Variable_dimensionContext;

public class Data_declarationContextExt extends AbstractBaseExt{

	@Getter private Data_declarationContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	public Data_declarationContextExt(Data_declarationContext ctx) {
		this.ctx = ctx;
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).data_declaration());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Data_declarationContext){
				this.ctx = (Data_declarationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Data_declarationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	//TODO yet to implement
	@Override
	public void paint(SymbolTable symbolTable, String functionalityName){
		if(ctx != null){
			if(!pragma_fn_statement_skip.contains(functionalityName)){
				if(ctx.list_of_variable_decl_assignments() != null){
					List_of_variable_decl_assignmentsContext list_of_variable_decl_assignmentsContext = (List_of_variable_decl_assignmentsContext)ctx.list_of_variable_decl_assignments().extendedContext.getContext();
					if(list_of_variable_decl_assignmentsContext.variable_decl_assignment() != null){
						Variable_decl_assignmentContext variable_decl_assignmentContext = (Variable_decl_assignmentContext) list_of_variable_decl_assignmentsContext.variable_decl_assignment(0).extendedContext.getContext();
						String before = variable_decl_assignmentContext.extendedContext.getFormattedText();
						variable_decl_assignmentContext.extendedContext.eval(symbolTable);
						String after = variable_decl_assignmentContext.extendedContext.getFormattedText();
						Boolean containsAssign = (variable_decl_assignmentContext.assign() != null);
						if(containsAssign &&   (!before.equals(after) || symbolTable.containsKey(variable_decl_assignmentContext.variable_identifier().getText()))){
							String expression = variable_decl_assignmentContext.expression().extendedContext.getFormattedText();
							String id = variable_decl_assignmentContext.variable_identifier().extendedContext.getFormattedText();
							expression = symbolTable.containsKey(expression) ? symbolTable.get(expression) : expression;
							id = symbolTable.containsKey(id) ? symbolTable.get(id) : id;
							try{
								Float.parseFloat(expression);
								try{
									Float.parseFloat(id);
								}catch(NumberFormatException exception){
									if(!(variable_decl_assignmentContext.variable_dimension() != null && variable_decl_assignmentContext.variable_dimension().size()>0))
										symbolTable.put(id,"0");
								}
								if(!pragma_fn_statement_skip.contains(functionalityName)){
									pragma_fn_statement_skip.add(functionalityName);
								}
							} catch(NumberFormatException exception){
								try{
									Float.parseFloat(id);
									if(!pragma_fn_statement_skip.contains(functionalityName)){
										pragma_fn_statement_skip.add(functionalityName);
									}
								}catch(NumberFormatException exception1){

								}
							}
						}
						undoEvaluatedStrings();
					}
				}
			}
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
	public List<IStatement> PopulateStatements(String functionalityName){
		if(!pragma_fn_statement_skip.contains(functionalityName)){
			List<IStatement> iStatements = new ArrayList<IStatement>();
			if(ctx != null){
				Set<SortVariable> rVariables = new HashSet<SortVariable>();
				Set<SortVariable> lVariables = new HashSet<SortVariable>();

				if(ctx.type_declaration() != null){
					BailoutRule(ctx.getClass().getName(), ctx.getText());
				}
				if(ctx.package_import_declaration() != null){
					BailoutRule(ctx.getClass().getName(), ctx.getText());
				}
				if(ctx.virtual_interface_declaration() != null){
					BailoutRule(ctx.getClass().getName(), ctx.getText());
				}
				List<IStatement> childStatements = super.PopulateStatements(functionalityName);
				if(childStatements != null){
					for(IStatement childStatement : childStatements) {
						lVariables.addAll(childStatement.getLeftVariables());
						rVariables.addAll(childStatement.getRightVariables());
					}

					Statement statement = new Statement(lVariables, rVariables, ctx);
					iStatements.add(statement);
				}
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
		if(ctx.data_type_or_implicit().getText().startsWith("reg")){
			String size ="1";
			Data_type_or_implicitContext data_type_or_implicitContext = (Data_type_or_implicitContext) ctx.data_type_or_implicit().extendedContext.getContext();
			if(data_type_or_implicitContext.data_type() != null){
				Data_typeContext data_typeContext = (Data_typeContext) data_type_or_implicitContext.data_type().extendedContext.getContext();
				if(data_typeContext.packed_dimension() != null && data_typeContext.packed_dimension().size()>0){
					if(data_typeContext.packed_dimension().size()>1){
						BailoutRule("Data_declaration", getFormattedText());
					} else {
						Packed_dimensionContext packed_dimensionContext = (Packed_dimensionContext) data_typeContext.packed_dimension(0).extendedContext.getContext();
						if(packed_dimensionContext != null){
							String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
							String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
							size = left + "-" + right+"+1";
						}
					}
				}
			} else {
				BailoutRule("Data_declaration", getFormattedText());
			}
			if(ctx.list_of_variable_decl_assignments() != null){
				List_of_variable_decl_assignmentsContext list_of_variable_decl_assignmentsContext = (List_of_variable_decl_assignmentsContext) ctx.list_of_variable_decl_assignments().extendedContext.getContext();
				for(Variable_decl_assignmentContext variable_decl_assignmentContextTemp : list_of_variable_decl_assignmentsContext.variable_decl_assignment()){
					Variable_decl_assignmentContext variable_decl_assignmentContext = (Variable_decl_assignmentContext) variable_decl_assignmentContextTemp.extendedContext.getContext();
					String variableName = variable_decl_assignmentContext.variable_identifier().extendedContext.getFormattedText();
					if(variable_decl_assignmentContext.variable_dimension() != null && variable_decl_assignmentContext.variable_dimension().size()>0){
						List<String> variableDimensions = new ArrayList<String>();
						for(Variable_dimensionContext variable_dimensionContext : variable_decl_assignmentContext.variable_dimension()){
							if(((Variable_dimensionContext)variable_dimensionContext.extendedContext.getContext()).unpacked_dimension() != null){
								Unpacked_dimensionContext unpacked_dimensionContext = (Unpacked_dimensionContext)((Variable_dimensionContext)variable_dimensionContext.extendedContext.getContext()).unpacked_dimension().extendedContext.getContext();
								if(unpacked_dimensionContext != null){
									if(unpacked_dimensionContext.constant_range()!=null){
										Unpacked_dimensionContext packed_dimensionContext = ((Variable_dimensionContext)variable_dimensionContext.extendedContext.getContext()).unpacked_dimension();
										if(packed_dimensionContext != null){
											String left = ((Constant_rangeContext)((Unpacked_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
											String right = ((Constant_rangeContext)((Unpacked_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
											variableDimensions.add(right + "-" + left+"+1");
										}
									}else{
										String left = variable_dimensionContext.unpacked_dimension().constant_expression().extendedContext.getFormattedText();
										variableDimensions.add(left);
									}
								}
							}
						}
						String starString = "";
						for(int i=0;i<variableDimensions.size();i++){
							starString = starString+"*";
						}
						if(variableDimensions.size()>0){
							String initialization = variableName+"(initialize_array("+variableDimensions.get(0);
							for(int i=1;i<variableDimensions.size();i++){
								initialization = initialization + ","+variableDimensions.get(i);
							}
							initialization = initialization+","+size;
							initialization = initialization + "))";
							//add destruction
							Variable variable = new Variable(variableName,"kiwibitset"+starString+" "+variableName+";",initialization,false);

							if(!classobj.contains(variable.getName())){
								//	classobj.addToInputVariables(variable);
							}
						} 
					} else {
						Variable variable = new Variable(variableName,"kiwibitset "+variableName+";",variableName +"(kiwibitset("+size+",0))",false);
						if(!classobj.contains(variable.getName())){
							//classobj.addToInputVariables(variable);
						}
					}
				}
			}
		} else if(ctx.data_type_or_implicit().extendedContext.getFormattedText().startsWith("integer")){
			List<Variable_decl_assignmentContext> variable_decl_assignmentContexts = ((List_of_variable_decl_assignmentsContext)ctx.list_of_variable_decl_assignments().extendedContext.getContext()).variable_decl_assignment();
			for(Variable_decl_assignmentContext variable_decl_assignmentContext : variable_decl_assignmentContexts){
				String variableName = variable_decl_assignmentContext.variable_identifier().extendedContext.getFormattedText();
				String value = "0";
				if(variable_decl_assignmentContext.assign() != null){
					value = variable_decl_assignmentContext.expression().extendedContext.getFormattedText();
				}
				Variable variable = new Variable(variableName,"Int "+variableName+";",variableName+"(Int("+value+"))",false);
				//classobj.addToInputVariables(variable);
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
			List_of_variable_decl_assignmentsContext list_of_variable_decl_assignmentsContext = (List_of_variable_decl_assignmentsContext) ctx.list_of_variable_decl_assignments().extendedContext.getContext();
			List<Variable_decl_assignmentContext> variable_decl_assignmentContexts = list_of_variable_decl_assignmentsContext.variable_decl_assignment();
			for(Variable_decl_assignmentContext variable_decl_assignmentContext : variable_decl_assignmentContexts){
				Variable_decl_assignmentContext variable_decl_assignmentContextTop = (Variable_decl_assignmentContext) variable_decl_assignmentContext.extendedContext.getContext();
				if(variable_decl_assignmentContextTop.assign() != null){
					if(ctx.data_type_or_implicit().extendedContext.getFormattedText().startsWith("integer")){
						List<Variable_decl_assignmentContext> variable_decl_assignmentContexts2 = ((List_of_variable_decl_assignmentsContext)ctx.list_of_variable_decl_assignments().extendedContext.getContext()).variable_decl_assignment();
						for(Variable_decl_assignmentContext variable_decl_assignmentContext2 : variable_decl_assignmentContexts2){
							String variableName = variable_decl_assignmentContext2.variable_identifier().extendedContext.getFormattedText();
							String value = "0";
							if(variable_decl_assignmentContext2.assign() != null){
								value = variable_decl_assignmentContext2.expression().extendedContext.getFormattedText();
							}
							params.getStringBuilder().append("Int "+variableName+" = (Int("+value+"));\n");
							//Variable variable = new Variable(variableName,"Int "+variableName+";",variableName+"(Int("+value+"))",false);
							//classobj.addToInputVariables(variable);
						}
					} else {
						super.getCString(params, classObj, moduleToParameters, functionalityName);
					}
				} else {
					String size ="1";
					Data_type_or_implicitContext data_type_or_implicitContext = (Data_type_or_implicitContext) ctx.data_type_or_implicit().extendedContext.getContext();
					if(data_type_or_implicitContext.data_type() != null){
						Data_typeContext data_typeContext = (Data_typeContext) data_type_or_implicitContext.data_type().extendedContext.getContext();
						if(data_typeContext.packed_dimension() != null && data_typeContext.packed_dimension().size()>0){
							if(data_typeContext.packed_dimension().size()>1){
								BailoutRule("Data_declaration", getFormattedText());
							} else {
								Packed_dimensionContext packed_dimensionContext = (Packed_dimensionContext) data_typeContext.packed_dimension(0).extendedContext.getContext();
								if(packed_dimensionContext != null){
									String left = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
									String right = ((Constant_rangeContext)((Packed_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
									size = left + "-" + right+"+1";
								}
							}
						}
					} else {
						BailoutRule("Data_declaration", getFormattedText());
					}
					if(ctx.data_type_or_implicit().extendedContext.getFormattedText().startsWith("reg")){
						for(Variable_decl_assignmentContext variable_decl_assignmentContextTemp : list_of_variable_decl_assignmentsContext.variable_decl_assignment()){
							Variable_decl_assignmentContext variable_decl_assignmentContext1 = (Variable_decl_assignmentContext) variable_decl_assignmentContextTemp.extendedContext.getContext();
							String variableName = variable_decl_assignmentContext1.variable_identifier().extendedContext.getFormattedText();
							if(variable_decl_assignmentContext1.variable_dimension() != null && variable_decl_assignmentContext1.variable_dimension().size()>0){
								List<String> variableDimensions = new ArrayList<String>();
								for(Variable_dimensionContext variable_dimensionContext : variable_decl_assignmentContext1.variable_dimension()){
									if(((Variable_dimensionContext)variable_dimensionContext.extendedContext.getContext()).unpacked_dimension() != null){
										Unpacked_dimensionContext unpacked_dimensionContext = (Unpacked_dimensionContext)((Variable_dimensionContext)variable_dimensionContext.extendedContext.getContext()).unpacked_dimension().extendedContext.getContext();
										if(unpacked_dimensionContext != null){
											if(unpacked_dimensionContext.constant_range()!=null){
												Unpacked_dimensionContext packed_dimensionContext = ((Variable_dimensionContext)variable_dimensionContext.extendedContext.getContext()).unpacked_dimension();
												if(packed_dimensionContext != null){
													String left = ((Constant_rangeContext)((Unpacked_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(0).extendedContext.getFormattedText();
													String right = ((Constant_rangeContext)((Unpacked_dimensionContext)packed_dimensionContext.extendedContext.getContext()).constant_range().extendedContext.getContext()).constant_expression(1).extendedContext.getFormattedText();
													variableDimensions.add(right + "-" + left+"+1");
												}
											}else{
												String left = variable_dimensionContext.unpacked_dimension().constant_expression().extendedContext.getFormattedText();
												variableDimensions.add(left);
											}
										}
									}
								}
								String starString = "";
								for(int i=0;i<variableDimensions.size();i++){
									starString = starString+"*";
								}
								if(variableDimensions.size()>0){
									String initialization = "(initialize_array("+variableDimensions.get(0);
									for(int i=1;i<variableDimensions.size();i++){
										initialization = initialization + ","+variableDimensions.get(i);
									}
									initialization = initialization+","+size;
									initialization = initialization + "))";
									params.getStringBuilder().append("kiwibitset"+starString+" "+variableName+" = "+initialization+";\n");

									//add destruction
									//Variable variable = new Variable(variableName,"kiwibitset"+starString+" "+variableName+";",initialization,false);
									//	classobj.addToInputVariables(variable);
								} 
							} else {
								params.getStringBuilder().append("kiwibitset "+variableName+" = " +"(kiwibitset("+size+",0));\n");
								//Variable variable = new Variable(variableName,"kiwibitset "+variableName+";",variableName +"(kiwibitset("+size+",0))",false);
								//classobj.addToInputVariables(variable);
							}
						}
					} else if(ctx.data_type_or_implicit().extendedContext.getFormattedText().startsWith("integer")){
						List<Variable_decl_assignmentContext> variable_decl_assignmentContexts2 = ((List_of_variable_decl_assignmentsContext)ctx.list_of_variable_decl_assignments().extendedContext.getContext()).variable_decl_assignment();
						for(Variable_decl_assignmentContext variable_decl_assignmentContext2 : variable_decl_assignmentContexts2){
							String variableName = variable_decl_assignmentContext2.variable_identifier().extendedContext.getFormattedText();
							params.getStringBuilder().append("Int "+variableName+";\n");
							//Variable variable = new Variable(variableName,"Int "+variableName+";",variableName+"(Int("+value+"))",false);
							//classobj.addToInputVariables(variable);
						}
					}
				}
			}
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		} else {
			params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
		}
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters, String fucntionalityName){
		return null;
	}
}

