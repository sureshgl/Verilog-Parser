package com.proteus.cgen.structures;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.pragma.IFunctionalitySplitApp;
import com.proteus.cgen.pragma.PragmaRegister;
import com.proteus.cgen.verilogprime.ExtendedContextVisitor;
import com.proteus.cgen.verilogprime.SymbolTable;

public class CClass {

	private String name;
	@Getter private List<Variable> inputVariables;
	private List<Variable> outputPorts;
	private List<Variable> inputPorts;
	@Getter private List<Parameter> parameters;
	@Getter private List<Parameter> localParameters;
	@Getter @Setter private List<String> regHeaders;
	private List<String> genvarHeaders;
	private List<String> functions;
	@Getter private File outDir;

	private static final Logger L = LoggerFactory.getLogger(CClass.class);

	public CClass(String name,ParserRuleContext prc,Map<String,List<Parameter>> moduleToParameters,File outDir,List<String> regHeaders){
		this.name = name;
		this.outDir = outDir; 
		inputVariables = new ArrayList<Variable>();
		outputPorts = new ArrayList<Variable>();
		inputPorts = new ArrayList<Variable>();
		localParameters = new ArrayList<Parameter>();
		this.regHeaders = regHeaders;
		genvarHeaders = new ArrayList<String>();
		if(moduleToParameters.get(name) != null){
			parameters = moduleToParameters.get(name);
		} else {
			parameters = new ArrayList<Parameter>();
		}
		functions = new ArrayList<String>();
		ExtendedContextVisitor extendedContextVisitor = new ExtendedContextVisitor();
		extendedContextVisitor.visit(prc).getClassInfo(this, moduleToParameters);
	}

	public CClass(String name,File outDir,List<String> regHeaders){
		this.name = name;
		this.outDir = outDir;
		inputVariables = new ArrayList<Variable>();
		this.regHeaders = regHeaders;
		genvarHeaders = new ArrayList<String>();
		outputPorts = new ArrayList<Variable>();
		inputPorts = new ArrayList<Variable>();
		localParameters = new ArrayList<Parameter>();
		parameters = new ArrayList<Parameter>();
		functions = new ArrayList<String>();
	}

	public void writeClassToFile(){
		String content = toString();
		try {
			content = content.replace(";", ";\n");
			content = content.replaceAll("(?m)^\r?\n", "");
			com.proteus.common.util.FileUtils.WriteFile(new File (getOutDir().getCanonicalPath()+"/converted/"+name+"_class.h"), content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getClassInfo(ParserRuleContext prc,Map<String,List<Parameter>> moduleToParameters){
		ExtendedContextVisitor extendedContextVisitor = new ExtendedContextVisitor();
		extendedContextVisitor.visit(prc).getClassInfo(this, moduleToParameters);
	}



	public Boolean contains(String name){
		List<Variable> variables  = new ArrayList<Variable>();
		variables.addAll(inputVariables);
		variables.addAll(outputPorts);
		variables.addAll(inputPorts);
		for(Variable variable : variables){
			if(variable.getName().equals(name)){
				return true;
			}
		}
		return false;
	}

	public Boolean containsVariable(String name){
		for(Variable variable : inputVariables){
			if(variable.getName().equals(name)){
				return true;
			}
		}
		for(Variable variable : inputPorts){
			if(variable.getName().equals(name)){
				return true;
			}
		}
		for(Variable variable : outputPorts){
			if(variable.getName().equals(name)){
				return true;
			}
		}
		return false;
	}

	public List<String> getreferenceVariables(){
		List<String> ret = new ArrayList<String>();
		for(Variable variable : outputPorts){
			if(!variable.getInitialization().contains("initialize_array"))
				ret.add(variable.getName());
		}
		return ret;
	}

	public void populateFunction(String functionalityName){
		IFunctionalitySplitApp app = (IFunctionalitySplitApp) PragmaRegister.get("functionality_splitting");
		functions.add(app.getFunctionPrototype(name, functionalityName));
	}

	public void addToInputVariables(Variable variable){
		inputVariables.add(variable);
	}

	public void addToRegHeader(String header){
		regHeaders.add(header);
	}

	public void addToGenvarHeader(String header){
		genvarHeaders.add(header);
	}

	public void addToInputPorts(Variable variable){
		inputPorts.add(variable);
	}

	public void addToLocalParamVariables(Parameter parameter){
		localParameters.add(parameter);
	}


	public void addToOutputPorts(Variable variable){
		outputPorts.add(variable);
	}

	public void addToParameters(Parameter parameter){
		parameters.add(parameter);
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(headers());
		sb.append(define());
		sb.append("class "+getClassName()+"{\n");
		sb.append("public : \n");
		sb.append(getClassMembers());
		sb.append(getConstructor());
		sb.append(getFunctions());
		sb.append(getDestructor());
		sb.append("};\n");
		sb.append(endif());
		return sb.toString();
	}

	private String define(){
		StringBuilder sb = new StringBuilder();
		sb.append("#ifndef "+name.toUpperCase()+"_CLASS_H_\n");
		sb.append("#define "+name.toUpperCase()+"_CLASS_H_\n");
		return sb.toString();
	}

	private String endif(){
		return "#endif\n";
	}

	private String getDestructor() {
		StringBuilder sb = new StringBuilder();
		sb.append("~"+name+"_class(){\n");
		for(Variable variable : inputVariables){
			if(variable.getDestruction() != null){
				sb.append(variable.getDestruction()+"\n");
			}
		}
		for(Variable variable : inputPorts){
			if(variable.getDestruction() != null){
				sb.append(variable.getDestruction()+"\n");
			}
		}
		for(Variable variable : outputPorts){
			if(variable.getDestruction() != null){
				sb.append(variable.getDestruction()+"\n");
			}
		}
		sb.append("}\n");
		return sb.toString();
	}

	private String getFunctions() {
		StringBuilder sb = new StringBuilder();
		for(String function:functions){
			sb.append(function + ";\n");
		}
		return sb.toString();
	}

	private String getClassMembers(){
		StringBuilder sb = new StringBuilder();
		for(Parameter parameter : parameters){
			sb.append("Int "+parameter.getName()+";\n");
		}
		for(Parameter parameter : localParameters){
			sb.append("Int "+parameter.getName()+";\n");
		}
		for(Variable variable : inputVariables){
			sb.append(variable.getDeclaration()+"\n");
		}
		for(Variable variable : inputPorts){
			sb.append(variable.getDeclaration()+"\n");
		}
		for(Variable variable : outputPorts){
			sb.append(variable.getDeclaration()+"\n");
		}
		return sb.toString();
	}

	public String getClassName(){
		StringBuilder sb = new StringBuilder();
		sb.append(name+"_class");
		return sb.toString();
	}

	private String getConstructor(){
		StringBuilder sbInParams = new StringBuilder();
		StringBuilder sbBefore = new StringBuilder();
		StringBuilder sbIn = new StringBuilder();
		if(parameters != null && parameters.size()>0){
			sbBefore.append(parameters.get(0).getName()+"("+parameters.get(0).getName()+")\n");
			sbInParams.append("Int "+parameters.get(0).getName());
			for(int i=1;i<parameters.size();i++){
				sbBefore.append(",");
				sbInParams.append(",");
				sbInParams.append("Int "+parameters.get(i).getName());
				sbBefore.append(parameters.get(i).getName()+"("+parameters.get(i).getName()+")\n");
			}
		}
		if(localParameters != null && localParameters.size()>0){
			if(sbBefore.toString().equals("")){
				sbBefore.append(localParameters.get(0).getName()+"("+localParameters.get(0).getDefaultValue().replace("$clog2", "kiwi_log2")+")\n");
				for(int i=1;i<localParameters.size();i++){
					sbBefore.append(",");
					sbBefore.append(localParameters.get(i).getName()+"("+localParameters.get(i).getDefaultValue().replace("$clog2", "kiwi_log2")+")\n");
				}
			} else {
				for(Parameter parameter : localParameters){
					sbBefore.append(",");
					sbBefore.append(parameter.getName()+"("+parameter.getDefaultValue().replace("$clog2", "kiwi_log2")+")\n");
				}
			}
		}
		if(inputVariables != null && inputVariables.size()>0){
			for(int i=0;i<inputVariables.size();i++){
				if(sbBefore.toString().equals("")){
					if(!inputVariables.get(i).getInitializationInConstructor()){
						sbBefore.append(inputVariables.get(i).getInitialization()+"\n");
					} else {
						sbIn.append(inputVariables.get(i).getInitialization()+"\n");
					}
				} else {
					if(!inputVariables.get(i).getInitializationInConstructor()){
						sbBefore.append(",");
						sbBefore.append(inputVariables.get(i).getInitialization()+"\n");
					} else {
						sbIn.append(inputVariables.get(i).getInitialization()+"\n");
					}
				}
			}
		}
		if(inputPorts != null && inputPorts.size()>0){
			for(int i=0;i<inputPorts.size();i++){
				if(sbBefore.toString().equals("")){
					if(!inputPorts.get(i).getInitializationInConstructor()){
						sbBefore.append(inputPorts.get(i).getInitialization()+"\n");
					} else {
						sbIn.append(inputPorts.get(i).getInitialization()+"\n");
					}
				} else {
					if(!inputPorts.get(i).getInitializationInConstructor()){
						sbBefore.append(",");
						sbBefore.append(inputPorts.get(i).getInitialization()+"\n");
					} else {
						sbIn.append(inputPorts.get(i).getInitialization()+"\n");
					}
				}
			}
		}
		if(outputPorts != null && outputPorts.size()>0){
			for(int i=0;i<outputPorts.size();i++){
				if(sbBefore.toString().equals("")){
					if(!outputPorts.get(i).getInitializationInConstructor()){
						sbBefore.append(outputPorts.get(i).getInitialization()+"\n");
					} else {
						sbIn.append(outputPorts.get(i).getInitialization()+"\n");
					}
				} else {
					if(!outputPorts.get(i).getInitializationInConstructor()){
						sbBefore.append(",");
						sbBefore.append(outputPorts.get(i).getInitialization()+"\n");
					} else {
						sbIn.append(outputPorts.get(i).getInitialization()+"\n");
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(name+"_class(){}\n");
		sb.append(name+"_class("+sbInParams.toString()+"):\n");
		sb.append(sbBefore.toString());
		sb.append("{\n");
		sb.append(sbIn.toString());
		sb.append("}\n");
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	private String getHeaders(){
		List<String> headers = null;
		try {
			String path = "./cfg/headers";
			headers = FileUtils.readLines(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		for(String line : headers){
			sb.append(line.trim()+"\n");
		}
		return sb.toString();
	}

	public SymbolTable getStOfPorts(){
		SymbolTable st = new SymbolTable();
		for(Variable variable : inputPorts){
			st.put(variable.getName(),"0");
		}
		for(Variable variable : outputPorts){
			st.put(variable.getName(),"0");
		}
		return st;
	}

	private String headers(){
		StringBuilder ret = new StringBuilder();
		ret.append(getHeaders());
		ret.append("#include \"../common/Int.h\"\n");
		ret.append("#include \"../common/kiwibitset.h\"\n");
		for(String header : regHeaders){
			if(!header.contains(name))
				ret.append(header+"\n");
		}
		for(String header : genvarHeaders){
			ret.append(header+"\n\n");
		}
		ret.append("using namespace std;\n\n");
		return ret.toString();
	}
}
