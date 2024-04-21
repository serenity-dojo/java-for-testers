package com.serenitydojo.exceptions;

public class FileHasNoWordException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FileHasNoWordException(String message) {
		super(message);
	}

	public FileHasNoWordException(String message, Throwable cause) {
		super(message, cause);
	}

}