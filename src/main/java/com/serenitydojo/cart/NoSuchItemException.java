package com.serenitydojo.cart;

public class NoSuchItemException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchItemException(String msg) {
		super(msg);
	}

}