package com.serenitydojo.shoppingcart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private List<ItemInCart> shoppingCartContents = new ArrayList<>();
    private double appliedDiscount = 0.0;

    public void add(int quantity, ShoppingItem item) {
        shoppingCartContents.add(new ItemInCart(item,quantity));
    }

    public void addBags(int numberOfBags) {
        ShoppingItem bag = new ShoppingItem("Shopping Bag", "bag", 0.50,"324534563546356",0.0, "Shop");
        shoppingCartContents.add(new ItemInCart(bag, numberOfBags));
    }

    public void applyDiscount(double discount) {
        ShoppingItem discountLineItem = new ShoppingItem("Discount", "1", -1 * discount,"",0.0, "");
        shoppingCartContents.add(new ItemInCart(discountLineItem, 1));
    }

    public double getTotal() {
        return shoppingCartContents.stream().mapToDouble(item -> item.getQuantity() * item.getItem().getPrice()).sum();
    }
}
