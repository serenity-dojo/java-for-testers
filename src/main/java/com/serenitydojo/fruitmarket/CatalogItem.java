package com.serenitydojo.fruitmarket;

public class CatalogItem {

	private final FruitEnum fruit;
	private final int amountInKg;

	public CatalogItem(FruitEnum fruit, int amountInKg) {
		this.fruit = fruit;
		this.amountInKg = amountInKg;
	}

	/**
	 * @return the fruit
	 */
	public FruitEnum getFruit() {
		return fruit;
	}

	/**
	 * @return the amountInKg
	 */
	public int getAmountInKg() {
		return amountInKg;
	}

}