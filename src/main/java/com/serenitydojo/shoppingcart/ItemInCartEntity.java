package com.serenitydojo.shoppingcart;

public class ItemInCartEntity {
	
	private final ShoppingItemRecordEntity item;
    private final int quantity;
    
	public ItemInCartEntity(ShoppingItemRecordEntity item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}

	/**
	 * @return the item
	 */
	public ShoppingItemRecordEntity getItem() {
		return item;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

}
