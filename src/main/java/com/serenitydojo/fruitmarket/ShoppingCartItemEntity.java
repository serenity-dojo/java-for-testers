package com.serenitydojo.fruitmarket;

public class ShoppingCartItemEntity {
	
	private FruitEnum fruit;
    private Double quantity;
    private Double totalCost;
    
	public ShoppingCartItemEntity(FruitEnum fruit, Double quantity, Double totalCost) {
		this.fruit = fruit;
		this.quantity = quantity;
		this.totalCost = totalCost;
	}

	/**
	 * @return the fruit
	 */
	public FruitEnum getFruit() {
		return fruit;
	}

	/**
	 * @return the quantity
	 */
	public Double getQuantity() {
		return quantity;
	}

	/**
	 * @return the totalCost
	 */
	public Double getTotalCost() {
		return totalCost;
	}
	
}