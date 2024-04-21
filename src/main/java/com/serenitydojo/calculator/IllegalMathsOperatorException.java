package com.serenitydojo.calculator;

public class IllegalMathsOperatorException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalMathsOperatorException(String strExctMsg) {
		super(strExctMsg);
	}
}