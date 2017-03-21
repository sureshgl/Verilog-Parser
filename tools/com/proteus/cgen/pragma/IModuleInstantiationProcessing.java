package com.proteus.cgen.pragma;

import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Module_instantiationContext;
import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;

public interface IModuleInstantiationProcessing {

	public IModuleInstantiationStructure populateInfo(Pragma_textContext ptc,Module_instantiationContext mic);

}
