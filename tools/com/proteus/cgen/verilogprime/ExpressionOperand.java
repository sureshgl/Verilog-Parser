package com.proteus.cgen.verilogprime;

import com.proteus.cgen.verilogprime.ext.AbstractBaseExt.Evaluatable;


public interface ExpressionOperand {

	public ExpressionOperand STARSTAR(ExpressionOperand that);
	public ExpressionOperand STAR(ExpressionOperand that);
	public ExpressionOperand DIV(ExpressionOperand that);
	public ExpressionOperand MODULO(ExpressionOperand that);
	public ExpressionOperand PLUS(ExpressionOperand that);
	public ExpressionOperand MINUS(ExpressionOperand that);
	public ExpressionOperand LSHIFT(ExpressionOperand that);
	public ExpressionOperand RSHIFT(ExpressionOperand that);
	public ExpressionOperand ALSHIFT(ExpressionOperand that);
	public ExpressionOperand ARSHIFT(ExpressionOperand that);
	public ExpressionOperand LT(ExpressionOperand that);
	public ExpressionOperand GT(ExpressionOperand that);
	public ExpressionOperand LE(ExpressionOperand that);
	public ExpressionOperand GE(ExpressionOperand that);
	public ExpressionOperand EQUALS(ExpressionOperand that);
	public ExpressionOperand NOT_EQUALS(ExpressionOperand that);
	public ExpressionOperand CASE_EQUALITY(ExpressionOperand that);
	public ExpressionOperand CASE_INEQUALITY(ExpressionOperand that);
	public ExpressionOperand CASE_Q(ExpressionOperand that);
	public ExpressionOperand NOT_CASE_Q(ExpressionOperand that);
	public ExpressionOperand AND(ExpressionOperand that);
	public ExpressionOperand XOR(ExpressionOperand that);
	public ExpressionOperand XNOR(ExpressionOperand that);
	public ExpressionOperand XORN(ExpressionOperand that);
	public ExpressionOperand OR(ExpressionOperand that);
	public ExpressionOperand LOG_AND(ExpressionOperand that);
	public ExpressionOperand LOG_OR(ExpressionOperand that);
	public ExpressionOperand PLUS();
	public ExpressionOperand MINUS();
	public ExpressionOperand NOT();
	public ExpressionOperand COMPLIMENT();
	public ExpressionOperand OR();
	public ExpressionOperand NOR();
	public ExpressionOperand NAND();
	public ExpressionOperand XOR();
	public ExpressionOperand XORN();
	public ExpressionOperand XNOR();
	public ExpressionOperand getOperand();
	public String getFormattedText();
	public Evaluatable getEvaluatedStatus();
}
