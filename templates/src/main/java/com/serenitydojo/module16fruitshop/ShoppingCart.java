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

//@@ solution
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
//@@ starter
    // TODO: return a ShoppingCartAdder for this amount, so that the fruit can be chosen with .kilosOf(fruit)
    public ShoppingCartAdder add(Double amount) {
        throw new UnsupportedOperationException("TODO: add");
    }

    /**
     * The items in the cart, in the order they were added. Changing this list does not change the cart.
     */
    public List<ShoppingCartItem> getItems() {
        // TODO: return a copy of the items in the cart
        throw new UnsupportedOperationException("TODO: getItems");
    }

    /**
     * The total price of everything in the cart, after any discounts.
     */
    public Double getTotalPrice() {
        // TODO: add up the total cost of each item in the cart
        throw new UnsupportedOperationException("TODO: getTotalPrice");
    }

    public static class ShoppingCartAdder {
        private final ShoppingCart shoppingCart;
        private final Double amount;

        public ShoppingCartAdder(ShoppingCart shoppingCart, Double amount) {
            this.shoppingCart = shoppingCart;
            this.amount = amount;
        }

        public ShoppingCart kilosOf(Fruit fruit) {
            // TODO: look up the price of the fruit in the catalog (shoppingCart.catalog), work out the cost of
            //       this amount (with the bulk discount from the brief), add a ShoppingCartItem to the cart,
            //       and return the cart
            throw new UnsupportedOperationException("TODO: kilosOf");
        }
    }
//@@ end
}
