package com.serenitydojo.exceptions;

public class ClientDataCouldNotBeLoadedException extends Error {

	private static final long serialVersionUID = 1L;

	public ClientDataCouldNotBeLoadedException(String message, Throwable cause) {
		super(message, cause);
	}

}