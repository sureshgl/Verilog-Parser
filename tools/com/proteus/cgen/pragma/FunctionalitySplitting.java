package com.proteus.cgen.pragma;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.List_of_port_connectionsContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_instantiationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Named_port_connectionContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;

public class FunctionalitySplitting implements IPragmaImplement,IModuleInstantiationSplitApp,IFunctionalitySplitApp {
	private static final Logger L = LoggerFactory.getLogger(FunctionalitySplitting.class);

	private Map<String, PragmaStructure> moduleToFunctionalitiesMap;

	public FunctionalitySplitting(){
		moduleToFunctionalitiesMap = new HashMap<String,PragmaStructure>();
	}

	@Data
	public static class PragmaStructure {
		private List<Functions> functions;
		private String moduleName;
		private List<Parameter> parameters;
	}

	@Data
	public static class Parameter{
		private String name;
		private String defaultValue;
	}

	@Data
	public static class Functions{
		private String name;
		private List<String> outputPorts;
		private List<String> inputPorts;
		private List<String> controlPorts;
	}

	@Override
	public void process(Pragma_textContext ctx) {
		String text = ctx.getText();
		ObjectMapper mapper  = new ObjectMapper();
		PragmaStructure pragmaStructure = null;
		try {
			L.debug("Pragma:" +text);
			pragmaStructure = mapper.readValue(text, PragmaStructure.class) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		moduleToFunctionalitiesMap.put(pragmaStructure.moduleName, pragmaStructure);
	}

	@Override
	public List<String> getInputPorts(Module_instantiationContext mic){
		List<String> ret = new ArrayList<String>();
		String moduleName = mic.module_identifier().getText();
		String instanceName = mic.hierarchical_instance(0).name_of_instance().extendedContext.getFormattedText();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
				if(instanceName.contains(function.getName())){
					for(String port : function.getInputPorts()){
						if(!ret.contains(port)){
							ret.add(port);
						}
					}
				}
			}
		}
		return ret;
	}

	@Override
	public List<String> getControlPorts(Module_instantiationContext mic){
		List<String> ret = new ArrayList<String>();
		String moduleName = mic.module_identifier().getText();
		String instanceName = mic.hierarchical_instance(0).name_of_instance().extendedContext.getFormattedText();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
				if(instanceName.contains(function.getName())){
					for(String port : function.getControlPorts()){
						if(!ret.contains(port)){
							ret.add(port);
						}
					}
				}
			}
		}
		return ret;
	}



	@Override
	public List<String> getOutputPorts(Module_instantiationContext mic){
		List<String> ret = new ArrayList<String>();
		String moduleName = mic.module_identifier().getText();
		String instanceName = mic.hierarchical_instance(0).name_of_instance().extendedContext.getFormattedText();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
				if(instanceName.contains(function.getName())){
					for(String port : function.getOutputPorts()){
						if(!ret.contains(port)){
							ret.add(port);
						}
					}
				}
			}
		}
		return ret;
	}


	private Map<String,List<String>> getNamedParameterMap(Module_instantiationContext mic) throws Exception{
		Map<String,List<String>> call = new HashMap<String,List<String>>();
		List_of_port_connectionsContext list_of_port_connectionsContext = mic.hierarchical_instance(0).list_of_port_connections();
		if(list_of_port_connectionsContext.ordered_port_connection() != null && list_of_port_connectionsContext.ordered_port_connection().size()>0){
			throw new Exception("Encountered an Ordered parameter passing");
		}else{
			List<Named_port_connectionContext> named_port_connectionContextList = list_of_port_connectionsContext.named_port_connection();
			for(Named_port_connectionContext named_port_connectionContext : named_port_connectionContextList){
				if(named_port_connectionContext.expression() != null && !named_port_connectionContext.expression().getText().equals("")){
					Boolean isConcat = named_port_connectionContext.expression().extendedContext.isConcatenation();
					if(isConcat != null && isConcat){
						call.put(named_port_connectionContext.port_identifier().extendedContext.getFormattedText(), named_port_connectionContext.expression().extendedContext.getConcatenatedVariables());
					} else {
						List<String> vars = new ArrayList<String>();
						vars.add(named_port_connectionContext.expression().extendedContext.getFormattedText());
						call.put(named_port_connectionContext.port_identifier().extendedContext.getFormattedText(),vars);
					}
				} else {
					List<String> vars = new ArrayList<String>();
					call.put(named_port_connectionContext.port_identifier().extendedContext.getFormattedText(),vars);
				}
			}
		}
		return call;
	}

	@Override
	public List<String> toAddToSt(Module_instantiationContext mic) throws Exception{
		List<String> ret = new ArrayList<String>();
		Map<String,List<String>> namedParameterMap = getNamedParameterMap(mic);
		String moduleName = mic.module_identifier().getText();
		String instanceName = mic.hierarchical_instance(0).name_of_instance().extendedContext.getFormattedText();
		List<String> retTemp = new ArrayList<String>();
		for(Functions function : moduleToFunctionalitiesMap.get(moduleName).getFunctions()){
			if(instanceName.contains(function.getName())){
				retTemp.addAll(function.getOutputPorts());
			}
		}
		for(String port : retTemp){
			ret.addAll(namedParameterMap.get(port));
		}
		return ret;
	}

	@Override
	public List<String> getModuleInstantiations(Module_instantiationContext mic) throws Exception{
		List<String> moduleInstantiations = new ArrayList<String>();
		Map<String,List<String>> namedParameterMap = getNamedParameterMap(mic);
		String moduleName = mic.module_identifier().getText();
		String instanceName = mic.hierarchical_instance(0).name_of_instance().extendedContext.getFormattedText();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			for(Functions function : moduleToFunctionalitiesMap.get(moduleName).getFunctions()){
				StringBuilder sb = new StringBuilder();
				sb.append(mic.module_identifier().extendedContext.getFormattedText() + " ");
				sb.append(mic.parameter_value_assignment().extendedContext.getFormattedText() + " ");
				sb.append(instanceName+"_"+function.getName()+ " ");
				sb.append("(");
				List<String> ports = new ArrayList<String>();
				ports.addAll(function.getInputPorts());
				ports.addAll(function.getOutputPorts());

				if( (ports != null && ports.size()>0)){
					String var = null;
					if(namedParameterMap.get(ports.get(0)).size()>1){
						var = "{"+namedParameterMap.get(ports.get(0)).get(0);
						for(int i=1;i<namedParameterMap.get(ports.get(0)).size();i++){
							var = var + ","+namedParameterMap.get(ports.get(0)).get(i);
						}
						var = var+"}";
					} else {
						var = namedParameterMap.get(ports.get(0)).get(0);
					}
					sb.append("."+ports.get(0)+"("+var+")");
					for(int i=1;i<ports.size();i++){
						sb.append(",");
						if(namedParameterMap.get(ports.get(i)).size()>1){
							var = "{"+namedParameterMap.get(ports.get(i)).get(0);
							for(int j=1;j<namedParameterMap.get(ports.get(i)).size();j++){
								var = var + ","+namedParameterMap.get(ports.get(i)).get(j);
							}
							var = var+"}";
						} else {
							var = namedParameterMap.get(ports.get(i)).get(0);
						}
						sb.append("."+ports.get(i)+"("+var+")");
					}
				}
				sb.append(");");
				sb.append("//pragma module_instantiation_pragma ");
				sb.append("{\"moduleName\":\""+moduleName+"\",\"instanceName\":\""+instanceName+"\",\"functionName\":\""+function.getName()+"\"} \n");
				moduleInstantiations.add(sb.toString());
			}
			return moduleInstantiations;
		} else {
			throw new Exception("Pragma for " +moduleName+" not found");
		}
	}

	@Override
	public List<String> getFunctionalityNames(String moduleName) {
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<String> moduleToHeaderMap = new ArrayList<String>();
			for(Functions functionality : moduleToFunctionalitiesMap.get(moduleName).getFunctions()){
				moduleToHeaderMap.add(functionality.getName());
			}
			return moduleToHeaderMap;
		} else {
			try {
				throw new Exception("Pragma for " +moduleName+" not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private List<String> getAllPortsOfFunctionalities(String moduleName,String functionName){
		List<String> ret = new ArrayList<String>();
		for(Functions functionality : moduleToFunctionalitiesMap.get(moduleName).getFunctions()){
			if(functionality.getName() == functionName){
				ret.addAll(functionality.getInputPorts());
				ret.addAll(functionality.getOutputPorts());
			}
		}
		return ret;
	}

	@Override
	public void removeSymbols(String moduleName,String functionalityName, SymbolTable st) {
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<String> thisPorts = getAllPortsOfFunctionalities(moduleName,functionalityName);
			for(String port : thisPorts){
				st.remove(port);
			}
		} else {
			try {
				throw new Exception("Pragma for " +moduleName+" not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getFunctionHeader(String moduleName, String functionalityName) {
		StringBuilder sb = new StringBuilder();
		sb.append("void "+moduleName+"_class::fn_"+functionalityName+"(");
		getFunctionDef(moduleName,functionalityName,sb);
		return sb.toString();
	}

	@Override
	public String getFunctionPrototype(String moduleName, String functionalityName) {
		StringBuilder sb = new StringBuilder();
		sb.append("void fn_"+functionalityName+"(");
		getFunctionDef(moduleName,functionalityName,sb);
		return sb.toString();
	}

	private void getFunctionDef(String moduleName,String functionalityName,StringBuilder sb){
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			for(Functions functionality : moduleToFunctionalitiesMap.get(moduleName).getFunctions()){
				if(functionality.getName().equals(functionalityName)){
					if(functionality.getInputPorts().size()>0){
						sb.append("kiwibitset "+functionality.getInputPorts().get(0));
						for(int i=1;i<functionality.getInputPorts().size();i++){
							sb.append(",kiwibitset "+functionality.getInputPorts().get(i));
						}
					}
					for(String outputPort : functionality.getOutputPorts()){
						if(functionality.getInputPorts().size()>0)
							sb.append(",");
						sb.append("kiwibitset* "+outputPort);
					}
					sb.append(")");
				}
			}
		} else {
			try {
				throw new Exception("Pragma for " +moduleName+" not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Boolean isOutputVariable(String moduleName, String portIdentifier) {
		List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
		for(Functions function : functions){
			if(function.outputPorts.contains(portIdentifier)){
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Parameter> getParameters(String moduleName){
		L.debug("Module Name = " + moduleName);
		return moduleToFunctionalitiesMap.get(moduleName).getParameters();
	}

	@Override
	public List<String> getAllInputPorts(String moduleName) {
		List<String> ret = new ArrayList<String>();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
				for(String port : function.getInputPorts()){
					if(!ret.contains(port)){
						ret.add(port);
					}
				}
			}
		}
		return ret;
	}

	@Override
	public List<String> getAllOutputPorts(String moduleName) {
		List<String> ret = new ArrayList<String>();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
					for(String port : function.getOutputPorts()){
						if(!ret.contains(port)){
							ret.add(port);
						}
					}
			}
		}
		return ret;
	}

	@Override
	public List<String> getInputPorts(String moduleName,String functionalityName) {
		List<String> ret = new ArrayList<String>();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
				if(function.getName().equals(functionalityName))
				for(String port : function.getInputPorts()){
					if(!ret.contains(port)){
						ret.add(port);
					}
				}
			}
		}
		return ret;
	}

	@Override
	public List<String> getOutputPorts(String moduleName,String functionalityName) {
		List<String> ret = new ArrayList<String>();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
				if(function.getName().equals(functionalityName))
					for(String port : function.getOutputPorts()){
						if(!ret.contains(port)){
							ret.add(port);
						}
					}
			}
		}
		return ret;
	}
	@Override
	public List<String> getControlPorts(String moduleName, String functionName,
			Module_instantiationContext ctx) {
		List<String> ret = new ArrayList<String>();
		if(moduleToFunctionalitiesMap.containsKey(moduleName)){
			List<Functions> functions = moduleToFunctionalitiesMap.get(moduleName).getFunctions();
			for(Functions function : functions){
				for(String port : function.getControlPorts()){
					if(!ret.contains(port)){
						ret.add(port);
					}
				}
			}
		}
		return ret;
	}


}
