package com.serenitydojo.module16fruitshop;

import java.util.ArrayList;
import java.util.List;

/**
 * A shopping cart, which uses the catalog to calculate how much the customer has to pay.
 * <p>
 * Fruit is added with a fluent API, for example:
 * <pre>
 *   cart.add(2.0).kilosOf(Apple).add(1.5).kilosOf(Pear);
 * </pre>
 */
public class ShoppingCart {
    private final Catalog catalog;
    private final List<ShoppingCartItem> items = new ArrayList<>();

    public ShoppingCart(Catalog catalog) {
        this.catalog = catalog;
    }

    public ShoppingCartAdder add(Double amount) {
        return new ShoppingCartAdder(this, amount);
    }

    /**
     * The items in the cart, in the order they were added. Changing this list does not change the cart.
     */
    public List<ShoppingCartItem> getItems() {
        return new ArrayList<>(items);
    }

    /**
     * The total price of everything in the cart, after any discounts.
     */
    public Double getTotalPrice() {
        return items.stream().mapToDouble(ShoppingCartItem::getTotalCost).sum();
    }

    public static class ShoppingCartAdder {
        private final ShoppingCart shoppingCart;
        private final Double amount;

        public ShoppingCartAdder(ShoppingCart shoppingCart, Double amount) {
            this.shoppingCart = shoppingCart;
            this.amount = amount;
        }

        public ShoppingCart kilosOf(Fruit fruit) {
            double basePrice = shoppingCart.catalog.getPriceOf(fruit);
            double pricePerKilo = (amount >= 5) ? basePrice * 0.9 : basePrice;
            shoppingCart.items.add(new ShoppingCartItem(fruit, amount, pricePerKilo * amount));
            return shoppingCart;
        }
    }
}
