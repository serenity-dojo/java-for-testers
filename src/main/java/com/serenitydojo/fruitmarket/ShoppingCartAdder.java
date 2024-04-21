package com.serenitydojo.fruitmarket;

public class ShoppingCartAdder {

	private final ShoppingCartEntity shoppingCart;
	private final Double amount;

	public ShoppingCartAdder(ShoppingCartEntity shoppingCart, Double amount) {
		this.shoppingCart = shoppingCart;
		this.amount = amount;
	}

	public ShoppingCartEntity kilosOf(FruitEnum fruit) {
		double basePrice = shoppingCart.getCatalog().getPriceOf(fruit);
		double discountedPrice = (amount >= 5) ? basePrice * 0.9 : basePrice;
		ShoppingCartItemEntity item = new ShoppingCartItemEntity(fruit, amount, discountedPrice * amount);
		shoppingCart.getItems().add(item);
		return shoppingCart;
	}

}