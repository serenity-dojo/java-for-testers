package com.serenitydojo.cart;

public class ItemEntity {

	private String name;

	/**
	 * @param name the name to set
	 */
	public ItemEntity(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public boolean isCalled(String expectedItemName) {
		return name.equalsIgnoreCase(expectedItemName.trim());
	}

}