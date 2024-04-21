package com.serenitydojo.cart;

public class ItemNotReadyException extends Throwable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ItemNotReadyException(String msg) {
		super(msg);
	}

}