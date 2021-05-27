package com.serenitydojo.fruitmarket;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final Catalog catalog;
    private final List<ShoppingCartItem> items;
    private final int DISCOUNT_RATE = 10;
    private final int DISCOUNT_THRESHOLD = 5;

    public ShoppingCart(Catalog catalog) {
        this.catalog = catalog;
        this.items = new ArrayList<>();
    }

    public void addItemToShoppingCart(Fruit fruit, Double quantity){
        double totalCost = this.catalog.getPriceOf(fruit) * quantity;
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem(fruit, quantity, totalCost);
        this.items.add(shoppingCartItem);
    }


    public double totalPrice() {
        double total = 0.0;
        double totalQuantity = 0.0;
        for(ShoppingCartItem item : this.items){
            totalQuantity+=item.getQuantity();
            total+=item.getTotalCost();
        }
        if(totalQuantity>=DISCOUNT_THRESHOLD){
            int rate=100-DISCOUNT_RATE;
            total = (rate * total)/100;
        }
        return total;

    }
}
