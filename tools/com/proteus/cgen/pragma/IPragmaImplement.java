package com.proteus.cgen.pragma;

import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;

public interface IPragmaImplement {

	public void process(Pragma_textContext ctx);
	
}
