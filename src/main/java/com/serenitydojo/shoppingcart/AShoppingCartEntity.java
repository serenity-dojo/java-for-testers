package com.serenitydojo.shoppingcart;

public class AShoppingCartEntity extends ShoppingCartEntity {

	public static AShoppingCartEntityBuilder with(int quantity) {
		return new AShoppingCartEntityBuilder(new AShoppingCartEntity(), quantity);
	}

	public AShoppingCartEntityBuilder andWith(int quantity) {
		return new AShoppingCartEntityBuilder(this, quantity);
	}

	public AShoppingCartEntity andWithADiscountOf(double discount) {
		applyDiscount(discount);
		return this;
	}

}