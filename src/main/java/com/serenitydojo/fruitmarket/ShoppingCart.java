package com.serenitydojo.fruitmarket;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final Catalog catalog;
    private final List<ShoppingCartItem> items;

    public ShoppingCart(Catalog catalog) {
        this.catalog = catalog;
        this.items = new ArrayList<>();
    }

    public void setItems(ShoppingCartItem item)
    {
        this.items.add(item);
    }

    public List<ShoppingCartItem> getItems()
    {
        return this.items;
    }


    public double calculateTotalCost()
    {
        double totalCost=0.0;
        for (ShoppingCartItem item : this.items) {
            totalCost = totalCost + item.getTotalCost();
        }

        return totalCost;
    }
}
