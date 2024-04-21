package com.serenitydojo.shoppingcart;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCartEntity {

	private List<ItemInCartEntity> shoppingCartContents = new ArrayList<>();
	public void add(int quantity, ShoppingItemRecordEntity item) {
		shoppingCartContents.add(new ItemInCartEntity(item, quantity));
	}

	public void addBags(int numberOfBags) {
		ShoppingItemRecordEntity bag = new ShoppingItemRecordEntity("Shopping Bag", "bag", 0.50, "324534563546356", 0.0, "Shop");
		shoppingCartContents.add(new ItemInCartEntity(bag, numberOfBags));
	}

	public void applyDiscount(double discount) {
		ShoppingItemRecordEntity discountLineItem = new ShoppingItemRecordEntity("Discount", "1", -1 * discount, "", 0.0, "");
		shoppingCartContents.add(new ItemInCartEntity(discountLineItem, 1));
	}

	public double getTotal() {
		return shoppingCartContents.stream()
			   .mapToDouble(item -> item.getQuantity() * item.getItem().price())
			   .sum();
	}

}