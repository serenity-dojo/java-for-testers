package com.serenitydojo.exceptions;

public class TestEnvironmentUnavailableException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestEnvironmentUnavailableException(String strExpMsg) {
		super(strExpMsg);
	}

}