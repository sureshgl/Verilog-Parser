package com.proteus.cgen.verilogprime.ext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.pragma.IFunctionalitySplitApp;
import com.proteus.cgen.pragma.IModuleInstantiationProcessing;
import com.proteus.cgen.pragma.IModuleInstantiationSplitApp;
import com.proteus.cgen.pragma.IModuleInstantiationStructure;
import com.proteus.cgen.pragma.PragmaRegister;
import com.proteus.cgen.structures.CClass;
import com.proteus.cgen.structures.IStatement;
import com.proteus.cgen.structures.SortVariable;
import com.proteus.cgen.structures.Statement;
import com.proteus.cgen.structures.Variable;
import com.proteus.cgen.structures.SortVariable.TYPE;
import com.proteus.cgen.utils.CgenUtils;
import com.proteus.cgen.verilogprime.PopulateExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.ExpressionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Hierarchical_instanceContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_parameter_assignmentsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_port_connectionsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_instantiationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Named_parameter_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Named_port_connectionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Parameter_value_assignmentContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_defContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;

public class Module_instantiationContextExt extends AbstractBaseExt{

	@Getter private Module_instantiationContext ctx;
	@Getter List<String> pragma_fn_statement_skip;

	private static final Logger L = LoggerFactory.getLogger(Module_instantiationContextExt.class);

	private String moduleName;
	private String instanceName;
	private String functionName;
	private String genvarAccess;
	private List<Module_instantiationContext> moduleInstantiations;


	public Module_instantiationContextExt(Module_instantiationContext ctx) {
		this.ctx = ctx;
		moduleInstantiations = new ArrayList<Module_instantiationContext>();
		pragma_fn_statement_skip = new ArrayList<String>();
	}

	@Override
	public ParserRuleContext getContext(){
		return ctx;
	}

	@Override
	public ParserRuleContext getContext(String str){
		return new PopulateExtendedContextVisitor().visit(getPrimeParser(str).module_instantiation());
	}

	@Override
	public void setContext(ParserRuleContext ctx){
		if(ctx != null){
			if(ctx instanceof Module_instantiationContext){
				this.ctx = (Module_instantiationContext) ctx;
			} else {
				throw new ClassCastException(ctx.getClass().getSimpleName() + " cannot be cased to "+Module_instantiationContext.class.getName());
			}
		} else {
			this.ctx= null;
		}
	}

	@Override
	public void Blocks_to_null(){
		if(ctx != null) {
			writeToFile(new File("CtxData/"+ctx.getClass().getSimpleName()), true,ctx.extendedContext.getFormattedText()+"\n_____\n");
			super.Blocks_to_null();
			addToContexts(null);
		}
	}

	@Override
	public void paint(SymbolTable st,String functionalityName){
		if(moduleInstantiations != null && moduleInstantiations.size()>0){
			for(Module_instantiationContext module_instantiationContext : moduleInstantiations){
				module_instantiationContext.extendedContext.paint(st, functionalityName);
			}
		} else {
			if(!pragma_fn_statement_skip.contains(functionalityName)){
				Map<String,ExpressionContext> modulePortsMap = new LinkedHashMap<String,ExpressionContext>();
				List<Hierarchical_instanceContext> hierarchical_instanceContexts = ctx.hierarchical_instance();
				for(Hierarchical_instanceContext hierarchical_instanceContext : hierarchical_instanceContexts){
					Hierarchical_instanceContext hierarchical_instanceContextTemp = (Hierarchical_instanceContext) hierarchical_instanceContext.extendedContext.getContext();
					if(hierarchical_instanceContextTemp.list_of_port_connections() != null){
						List_of_port_connectionsContext list_of_port_connections = (List_of_port_connectionsContext) hierarchical_instanceContext.list_of_port_connections().extendedContext.getContext();
						if(list_of_port_connections.ordered_port_connection() != null && list_of_port_connections.ordered_port_connection().size()>0){
							try {
								throw new Exception("Ordered port connections found in instantiation : \n"+getFormattedText()+"\n");
							} catch (Exception e) {
								e.printStackTrace();
							}
						} else {
							List<Named_port_connectionContext> named_port_connectionContexts = list_of_port_connections.named_port_connection();
							List<String> controlPorts = ((IFunctionalitySplitApp)PragmaRegister.get("functionality_splitting")).getControlPorts(ctx);
							List<String> outputPorts = ((IFunctionalitySplitApp)PragmaRegister.get("functionality_splitting")).getOutputPorts(ctx);
							for(Named_port_connectionContext named_port_connectionContext : named_port_connectionContexts){
								Named_port_connectionContext named_port_connectionContextTemp = (Named_port_connectionContext) named_port_connectionContext.extendedContext.getContext();
								if(named_port_connectionContextTemp.expression() != null){
									modulePortsMap.put(named_port_connectionContextTemp.port_identifier().getText(), named_port_connectionContextTemp.expression());  
								}
							}

							/*
							 * if one port is part of fun
							 */
							Boolean isPartOfFunctionality = false;
							if(controlPorts.size() == 0){
								isPartOfFunctionality = true;
							}
							for(int i=0 ; (i< controlPorts.size() && !isPartOfFunctionality) ;i++){
								boolean value = modulePortsMap.containsKey(controlPorts.get(i));
								if(value){
									ExpressionContext expContext = modulePortsMap.get(controlPorts.get(i));
									expContext.extendedContext.eval(st);
									try{
										Float.parseFloat(expContext.extendedContext.getFormattedText());
									} catch (NumberFormatException exception){
										isPartOfFunctionality = true;
										break;
									}
									undoEvaluatedStrings();
								}
							}

							if(!isPartOfFunctionality){
								for(int i=0 ; (i< outputPorts.size() && !isPartOfFunctionality) ;i++){
									List<String> ouputVars = null;
									boolean value = modulePortsMap.containsKey(outputPorts.get(i));
									if(value){
										ExpressionContext expContext = modulePortsMap.get(outputPorts.get(i));
										Boolean isConcat = expContext.extendedContext.isConcatenation();
										if(isConcat != null && isConcat){
											ouputVars =  expContext.extendedContext.getConcatenatedVariables();
										} else {
											ouputVars = new ArrayList<String>();
											ouputVars.add(expContext.extendedContext.getFormattedText());
										}
										for(String outputVar : ouputVars){
											st.put(outputVar, "0");
										}
									}
								}
								pragma_fn_statement_skip.add(functionalityName);
							}
						}
					}
				}
			}
		}
	}

	@Override
	protected void getCString(Params params, CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		if(moduleInstantiations != null && moduleInstantiations.size()>0){
			for(Module_instantiationContext module_instantiationContext : moduleInstantiations){
				params.getStringBuilder().append(module_instantiationContext.extendedContext.getCString(classObj, moduleToParameters, functionalityName)+"\n");
				params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
			}
		} else { 
			if(!pragma_fn_statement_skip.contains(functionalityName)){
				if(instanceName == null){
					processPragma("module_instantiation_pragma");
				}
				String objName = "";
				if(genvarAccess != null){
					objName = objName + genvarAccess;
				}
				objName = objName+instanceName.replace("_"+functionName, "")+"_obj";
				StringBuilder before = new StringBuilder();
				StringBuilder after = new StringBuilder();
				StringBuilder call = new StringBuilder();
				call.append(objName+".fn_"+functionName+"(");
				List<Hierarchical_instanceContext> hierarchical_instanceContexts = ctx.hierarchical_instance();
				for(Hierarchical_instanceContext hierarchical_instanceContext : hierarchical_instanceContexts){
					Hierarchical_instanceContext hierarchical_instanceContextTemp = (Hierarchical_instanceContext) hierarchical_instanceContext.extendedContext.getContext();
					if(hierarchical_instanceContextTemp.list_of_port_connections() != null){
						List_of_port_connectionsContext list_of_port_connections = (List_of_port_connectionsContext) hierarchical_instanceContext.list_of_port_connections().extendedContext.getContext();
						if(list_of_port_connections.ordered_port_connection() != null && list_of_port_connections.ordered_port_connection().size()>0){
							try {
								throw new Exception("Ordered port connections found in instantiation : \n"+getFormattedText()+"\n");
							} catch (Exception e) {
								e.printStackTrace();
							}
						} else {
							List<Named_port_connectionContext> named_port_connectionContexts = list_of_port_connections.named_port_connection();
							IModuleInstantiationSplitApp iModuleInstantiationSplitApp = (IModuleInstantiationSplitApp)PragmaRegister.get("functionality_splitting");
							if(iModuleInstantiationSplitApp.isOutputVariable(moduleName,list_of_port_connections.named_port_connection(0).port_identifier().getText())){
								List<String> ret = getBeforeVarAfter(classObj,named_port_connectionContexts.get(0).expression(),moduleToParameters,functionalityName,true);
								call.append("&"+ret.get(1));
								before.append(ret.get(0));
								after.append(ret.get(2));
							} else {
								List<String> ret = getBeforeVarAfter(classObj,named_port_connectionContexts.get(0).expression(),moduleToParameters,functionalityName,false);
								call.append(ret.get(1));
								before.append(ret.get(0));
								after.append(ret.get(2));
							}
							for(int i=1;i<named_port_connectionContexts.size();i++){
								call.append(",");
								if(iModuleInstantiationSplitApp.isOutputVariable(moduleName,named_port_connectionContexts.get(i).port_identifier().getText())){
									List<String> ret = getBeforeVarAfter(classObj,named_port_connectionContexts.get(i).expression(),moduleToParameters,functionalityName,true);
									call.append("&"+ret.get(1));
									before.append(ret.get(0));
									after.append(ret.get(2));
								} else {
									List<String> ret = getBeforeVarAfter(classObj,named_port_connectionContexts.get(i).expression(),moduleToParameters,functionalityName,false);
									call.append(ret.get(1));
									before.append(ret.get(0));
									after.append(ret.get(2));
								}
							}
						}
					}
				}
				call.append(");");
				String toAdd = before.toString() + call.toString()+"\n" + after.toString()+"\n";
				params.getStringBuilder().append(toAdd);
				params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
			} else {
				params.setBeginingOfAlignemtText(params.getContext().stop.getStopIndex()+1);
			}
		}
	}


	private List<String> getBeforeVarAfter(CClass classObj,ExpressionContext expressionContext,Map<String, List<Parameter>> moduleToParameters,String functionalityName,Boolean isOutput){
		List<String> ret = new ArrayList<String>();
		prepForC(classObj.getreferenceVariables());
		Boolean isConcat = expressionContext.extendedContext.isConcatenation();
		Boolean isBitSelect = expressionContext.extendedContext.isBitSelect();
		if(isConcat != null && isConcat){
			List<String> vars =  expressionContext.extendedContext.getConcatenatedVariables(classObj,moduleToParameters,functionalityName);
			if(vars.size()>1){
				String varDef = "";
				for(String variable : vars){
					varDef = varDef +"_"+variable;
				}
				varDef = varDef + "_"+instanceName;
				String variableName = CgenUtils.getVarName();
				// hashcode unique for strings
				String varDefBeforeCall = "kiwibitset "+variableName+ "(";
				varDefBeforeCall = varDefBeforeCall + vars.get(0);
				for(int i=1;i<vars.size();i++){
					varDefBeforeCall = varDefBeforeCall + ","+ vars.get(i);
				}
				varDefBeforeCall = varDefBeforeCall + ");";
				String varDefAfterCall = variableName+".decatenate(";
				varDefAfterCall = varDefAfterCall +"&"+vars.get(0);
				for(int i=1;i<vars.size();i++){
					varDefAfterCall = varDefAfterCall + ",&"+vars.get(i);
				}
				varDefAfterCall = varDefAfterCall + ");";
				ret.add(varDefBeforeCall+"\n");
				ret.add(variableName);
				ret.add(varDefAfterCall+"\n");
			} else {
				ret.add("");
				ret.add(vars.get(0));
				ret.add("");
			}
		} else if(isBitSelect != null && isBitSelect && isOutput){
			String def = expressionContext.extendedContext.getFormattedText();
			String variableName = "var"+((def.hashCode()<0 ) ?(def.hashCode()*-1): def.hashCode());
			String before = "kiwibitset "+variableName+"("+def+");";
			String after = def+" = "+variableName+";";
			ret.add(before+"\n");
			ret.add(variableName);
			ret.add(after+"\n");
		} else {
			ret.add("");
			ret.add(expressionContext.extendedContext.getCString(classObj, moduleToParameters, functionalityName));
			ret.add("");
		}
		return ret;
	}

	@Override
	public void getClassInfo(CClass classobj, Map<String, List<Parameter>> moduleToParameters){
		if(moduleInstantiations != null && moduleInstantiations.size()>0){
			for(Module_instantiationContext module_instantiationContext : moduleInstantiations){
				module_instantiationContext.extendedContext.getClassInfo(classobj, moduleToParameters);
			}
		} else {
			if(instanceName == null){
				processPragma("module_instantiation_pragma");
			}
			String className = moduleName+"_class";
			String objName = instanceName.replace("_"+functionName, "")+"_obj";
			String declaration = className + " " + objName+";";
			StringBuilder sb = new StringBuilder();
			sb.append(className+"(");
			if(ctx.parameter_value_assignment() != null){
				Parameter_value_assignmentContext parameter_value_assignmentContext = (Parameter_value_assignmentContext) ctx.parameter_value_assignment().extendedContext.getContext();
				if(parameter_value_assignmentContext.list_of_parameter_assignments() != null){
					List_of_parameter_assignmentsContext list_of_parameter_assignmentsContext = (List_of_parameter_assignmentsContext) parameter_value_assignmentContext.list_of_parameter_assignments().extendedContext.getContext();
					if(list_of_parameter_assignmentsContext.ordered_parameter_assignment() != null && list_of_parameter_assignmentsContext.ordered_parameter_assignment().size()>0){
						try {
							throw new Exception("Ordered port connections found in instantiation : \n"+getFormattedText()+"\n");
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else if(list_of_parameter_assignmentsContext.named_parameter_assignment() != null){
						List<Named_parameter_assignmentContext> named_parameter_assignmentContexts = list_of_parameter_assignmentsContext.named_parameter_assignment();
						Map<String,String> namedParameterMap = new HashMap<String,String>();
						for(Named_parameter_assignmentContext named_parameter_assignmentContext : named_parameter_assignmentContexts){
							namedParameterMap.put(named_parameter_assignmentContext.parameter_identifier().extendedContext.getFormattedText() , named_parameter_assignmentContext.param_expression().extendedContext.getFormattedText());
						}
						List<Parameter> parameters = moduleToParameters.get(moduleName);
						if(namedParameterMap.containsKey(parameters.get(0).getName())){
							sb.append("Int("+namedParameterMap.get(parameters.get(0).getName())+")");
						} else {
							sb.append("Int("+parameters.get(0).getDefaultValue()+")");
						}
						for(int i=1;i<parameters.size();i++){
							sb.append(",");
							if(namedParameterMap.containsKey(parameters.get(i).getName())){
								sb.append("Int("+namedParameterMap.get(parameters.get(i).getName())+")");
							}else {
								sb.append("Int("+parameters.get(i).getDefaultValue()+")");
							}
						}
					}
				}
			}
			sb.append(")");
			String initialization = objName +"(" +sb.toString()+")";
			if(!classobj.containsVariable(objName)){
				Variable variable = new Variable(objName,declaration,initialization,false);
				classobj.addToInputVariables(variable);
			}
		}
	}



	private Pragma_textContext getPragmaTextContext(ParseTree ctx){
		if(ctx instanceof Pragma_defContext){
			if(((Pragma_defContext)ctx).PRAGMA_ID().getText().equals("module_instantiation_pragma")){
				return ((Pragma_defContext)ctx).pragma_text();
			}
		}  else {
			if(ctx != null && (ctx.getChildCount()>0)){
				for(int i=0;i<ctx.getChildCount();i++){
					if(!(ctx.getChild(i) instanceof TerminalNode) && ctx.getChild(i).getText().length() >0){
						Pragma_textContext pragma_textContext = getPragmaTextContext(ctx.getChild(i));
						if(pragma_textContext != null){
							return pragma_textContext;
						}
					}
				}
			}
		}
		return null;
	}

	@Override
	public void processPragma(String pragmaId){
		if(moduleInstantiations != null && moduleInstantiations.size()>0){
			for(Module_instantiationContext module_instantiationContext : moduleInstantiations){
				module_instantiationContext.extendedContext.processPragma(pragmaId);
			}
		} else {
			if(pragmaId.equals("module_instantiation_pragma")){
				if(moduleName == null){
					Pragma_textContext pragma_textContext = getPragmaTextContext(ctx);
					IModuleInstantiationProcessing iModuleInstantiationProcessing= (IModuleInstantiationProcessing)PragmaRegister.get("module_instantiation_pragma");
					if(pragma_textContext != null){
						IModuleInstantiationStructure  iModuleInstantiationStructure = iModuleInstantiationProcessing.populateInfo(pragma_textContext,ctx);
						moduleName = iModuleInstantiationStructure.getModuleName();
						instanceName = iModuleInstantiationStructure.getInstanceName();
						functionName = iModuleInstantiationStructure.getFunctionName();
					}
				}
			} else {
				super.processPragma(pragmaId);
			}
			super.processPragma(pragmaId);
		}
	}

	@Override
	public void genvarAccess(List<Variable> variables,String obj,String var){
		super.genvarAccess(variables, obj, var);
		if(moduleInstantiations != null && moduleInstantiations.size()>0){
			for(Module_instantiationContext module_instantiationContext : moduleInstantiations){
				module_instantiationContext.extendedContext.genvarAccess(variables, obj, var);
			}
		} else {
			for(Variable variable : variables){
				if(instanceName == null){
					processPragma("module_instantiation_pragma");
				} 
				if(variable.getName().equals(instanceName.replace("_"+functionName, "")+"_obj")){
					genvarAccess = "(*("+obj+"["+var+"])).";
				}
			}
		}
	}

	@Override
	public void splitModuleInstantiations(){
		IModuleInstantiationSplitApp splitModuleInstantiations = (IModuleInstantiationSplitApp) PragmaRegister.get("functionality_splitting");
		try {
			List<String> moduleInstantiationsStrings = splitModuleInstantiations.getModuleInstantiations((Module_instantiationContext)getContext());
			for(String moduleInstantiationString : moduleInstantiationsStrings){
				moduleInstantiations.add((Module_instantiationContext) getContext(moduleInstantiationString));
			}
			processPragma("module_instantiation_pragma");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Boolean returnModuleItem(){
		return true;
	}

	@Override
	public List<IStatement> PopulateStatements(String functionalityName) {
		List<IStatement> iStatements = new ArrayList<IStatement>();
		if(moduleInstantiations != null && moduleInstantiations.size() >0){
			for(Module_instantiationContext module_instantiationContext : moduleInstantiations){
				List<IStatement> iStatementsTemp = module_instantiationContext.extendedContext.PopulateStatements(functionalityName);
				if(iStatementsTemp != null && iStatementsTemp.size()>0){
					iStatements.addAll(iStatementsTemp);
				}
			}
		} else {
			if(!pragma_fn_statement_skip.contains(functionalityName)){
				if(ctx != null){
					Set<SortVariable> rVariables = new HashSet<SortVariable>();
					Set<SortVariable> lVariables = new HashSet<SortVariable>();

					IFunctionalitySplitApp functionalitySplitApp = (IFunctionalitySplitApp) PragmaRegister.get("functionality_splitting");

					String miName = ctx.module_identifier().getText();
					String funName = ctx.hierarchical_instance(0).name_of_instance().extendedContext.getFormattedText();

					List<String> inputsPorts = functionalitySplitApp.getAllInputPorts(miName);
					List<String> outputsPorts = functionalitySplitApp.getAllOutputPorts(miName);

					if(ctx.parameter_value_assignment() != null) {
						L.debug("Not Considering parameter_value_assignment");
					}

					if(ctx.hierarchical_instance() != null && ctx.hierarchical_instance().size() >0 ) {
						for(Hierarchical_instanceContext hierarchical_instanceContext : ctx.hierarchical_instance()){
							if(hierarchical_instanceContext.list_of_port_connections() != null) {
								List<Named_port_connectionContext> named_port_connectionContexts = hierarchical_instanceContext.list_of_port_connections().named_port_connection();
								if(named_port_connectionContexts != null && named_port_connectionContexts.size() >0){
									for(Named_port_connectionContext named_port_connectionContext : named_port_connectionContexts) {
										List<String> port = named_port_connectionContext.port_identifier().extendedContext.Identifiers();
										if(port.size() ==1 ){
											if(inputsPorts != null && inputsPorts.size() > 0 && inputsPorts.contains(port.get(0))) {

												Boolean isConcat = named_port_connectionContext.expression().extendedContext.isConcatenation() ;
												if(isConcat != null && isConcat){
													List<String> vars =  named_port_connectionContext.expression().extendedContext.getConcatenatedVariables();
													for(String var : vars){
														var.replaceAll("\\s", "");
														SortVariable sVar = new SortVariable();
														List<String> matchList = new ArrayList<String>();

														Pattern regex = Pattern.compile("(\\w+)\\[(.*?)\\]");
														Matcher regexMatcher = regex.matcher(var);
														while (regexMatcher.find()) {
															matchList.add(regexMatcher.group(2));
															sVar.setParentName(regexMatcher.group(1));
														}
														if(matchList.size()>0){
															sVar.setType(TYPE.complex);
															sVar.setCompleteVar(var);
														} else {
															sVar.setType(TYPE.simple);
															sVar.setParentName(var);
														}

														rVariables.add(sVar);
													}
												} else {
													List<IStatement> inputStmtd = named_port_connectionContext.expression().extendedContext.PopulateStatements(functionalityName);
													if(inputStmtd != null && inputStmtd.size()>0) {
														for(IStatement stmt : inputStmtd) {
															rVariables.addAll(stmt.getLeftVariables());
															rVariables.addAll(stmt.getRightVariables());
														}
													}
												}
											}else if(outputsPorts != null && outputsPorts.size() > 0 && outputsPorts.contains(port.get(0))){
												Boolean isConcat = named_port_connectionContext.expression().extendedContext.isConcatenation() ;
												if(isConcat != null && isConcat){
													List<String> vars =  named_port_connectionContext.expression().extendedContext.getConcatenatedVariables();
													for(String var : vars){
														var.replaceAll("\\s", "");
														SortVariable sVar = new SortVariable();
														List<String> matchList = new ArrayList<String>();

														Pattern regex = Pattern.compile("(\\w+)\\[(.*?)\\]");
														Matcher regexMatcher = regex.matcher(var);
														while (regexMatcher.find()) {
															matchList.add(regexMatcher.group(2));
															sVar.setParentName(regexMatcher.group(1));
														}
														if(matchList.size()>0){
															sVar.setType(TYPE.complex);
															sVar.setCompleteVar(var);
														} else {
															sVar.setType(TYPE.simple);
															sVar.setParentName(var);
														}

														lVariables.add(sVar);
													}
												}
												else {
													if(named_port_connectionContext.extendedContext.getHierarchicalIdentifier() != null){
														List<IStatement> inputStmtd = named_port_connectionContext.expression().extendedContext.PopulateStatements(functionalityName);
														if(inputStmtd != null && inputStmtd.size()>0) {
															for(IStatement stmt : inputStmtd) {
																lVariables.addAll(stmt.getLeftVariables());
																lVariables.addAll(stmt.getRightVariables());
															}
														}
													}
												}
												if(named_port_connectionContext.extendedContext.getSelectIdentifier() != null) {
													List<String> varList = named_port_connectionContext.expression().extendedContext.getSelectIdentifier();
													for( String var : varList){
														SortVariable sVar = new SortVariable();
														sVar.setType(TYPE.simple);
														sVar.setParentName(var);
														rVariables.add(sVar);
													}
												}
											}
										}else {
											BailoutRule("ModuleInstantiation", "More than one port");
										}
									}
								}
							}
						}
					}

					Statement statement = new Statement(lVariables, rVariables, ctx);
					iStatements.add(statement);
				}
			} 
		}
		if(iStatements.size()>0){
			return iStatements;
		} else {
			return null;
		}
	}

	public List<ParserRuleContext> getGenerateItems(){
		List<ParserRuleContext> parserRuleContexts =  new ArrayList<ParserRuleContext>();
		for(Module_instantiationContext module_instantiationContext : moduleInstantiations){
			parserRuleContexts.add(module_instantiationContext);
		}
		return parserRuleContexts;
	}

	@Override
	public String getAssignString(CClass classObj, Map<String, List<Parameter>> moduleToParameters,String functionalityName){
		return null;
	}
}
