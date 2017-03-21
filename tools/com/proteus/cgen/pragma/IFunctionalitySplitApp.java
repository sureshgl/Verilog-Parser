package com.proteus.cgen.pragma;

import java.util.List;

import com.proteus.cgen.pragma.FunctionalitySplitting.Parameter;
import com.proteus.cgen.verilogprime.SymbolTable;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_instantiationContext;

public interface IFunctionalitySplitApp {

	public List<String> getFunctionalityNames(String moduleName);

	public void removeSymbols(String moduleName,String functionalityName,SymbolTable st);

	public String getFunctionHeader(String moduleName,String functionalityName);

	public String getFunctionPrototype(String moduleName,String functionalityName);

	public List<String> toAddToSt(Module_instantiationContext mic) throws Exception;

	public List<String> getInputPorts(Module_instantiationContext mic);

	public List<String> getOutputPorts(Module_instantiationContext mic);

	public List<Parameter> getParameters(String moduleName);

	public List<String> getAllInputPorts(String moduleName);

	public List<String> getAllOutputPorts(String moduleName);

	public List<String> getInputPorts(String moduleName, String functionalityName);

	public List<String> getOutputPorts(String moduleName, String functionalityName);

	List<String> getControlPorts(Module_instantiationContext mic);

	List<String> getControlPorts(String moduleName, String functionName,Module_instantiationContext ctx);

}
