package com.serenitydojo.shoppingcart;

public class ItemInCart {

    private final ShoppingItem item;
    private final int quantity;

    public ItemInCart(ShoppingItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public ShoppingItem getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
