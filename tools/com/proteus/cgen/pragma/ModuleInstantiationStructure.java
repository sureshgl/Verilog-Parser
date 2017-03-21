package com.proteus.cgen.pragma;

import lombok.Data;

@Data
public class ModuleInstantiationStructure implements IModuleInstantiationStructure{
	
	private String moduleName;
	private String instanceName;
	private String functionName;
	
}
