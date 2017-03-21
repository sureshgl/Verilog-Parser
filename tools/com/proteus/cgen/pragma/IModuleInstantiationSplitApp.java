package com.proteus.cgen.pragma;

import java.util.List;

import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_instantiationContext;

public interface IModuleInstantiationSplitApp extends IPragmaImplement{

	public List<String> getModuleInstantiations(Module_instantiationContext mic) throws Exception;
	
	public Boolean isOutputVariable(String moduleName,String portIdentifier);
}
