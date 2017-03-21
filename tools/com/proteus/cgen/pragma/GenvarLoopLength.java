package com.proteus.cgen.pragma;

import com.proteus.cgen.verilogprime.gen.VerilogPrimeParser.Pragma_textContext;

public class GenvarLoopLength implements IPragmaImplement,IGenvarLoopLength{

	@Override
	public void process(Pragma_textContext ctx) {
		
	}
	
	@Override
	public String getLoopLength(Pragma_textContext ptc){
		return ptc.extendedContext.getFormattedText();
	}

}
