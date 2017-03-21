package com.proteus.cgen.pragma;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_instantiationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;


public class ModuleInstantiationProcessing implements IModuleInstantiationProcessing,IPragmaImplement{

	@Override
	public IModuleInstantiationStructure populateInfo(Pragma_textContext ptc,Module_instantiationContext mic){
		String text = ptc.getText();
		ObjectMapper mapper  = new ObjectMapper();
		ModuleInstantiationStructure moduleInstantiationStructure  = null;
		try {
			moduleInstantiationStructure = mapper.readValue(text, ModuleInstantiationStructure.class) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return moduleInstantiationStructure;
	}

	@Override
	public void process(Pragma_textContext ctx) {
		
	}
}
