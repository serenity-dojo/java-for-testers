package com.serenitydojo.exceptions;

public class MissingWelcomeFileException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MissingWelcomeFileException(String strExpMsg, Throwable e) {
		super(strExpMsg, e);
	}

}