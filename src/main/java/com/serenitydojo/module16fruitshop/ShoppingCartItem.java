package com.serenitydojo.module16fruitshop;

/**
 * One line in a shopping cart: some quantity of a fruit, and what it costs in total.
 * This class is complete - you do not need to change it.
 */
public class ShoppingCartItem {
    private final Fruit fruit;
    private final Double quantity;
    private final Double totalCost;

    public ShoppingCartItem(Fruit fruit, Double quantity, Double totalCost) {
        this.fruit = fruit;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Double getTotalCost() {
        return totalCost;
    }
}
