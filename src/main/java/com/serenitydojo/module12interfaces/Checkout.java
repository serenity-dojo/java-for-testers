package com.serenitydojo.module12interfaces;

import java.util.List;

/**
 * Exercise 12.2d: the checkout depends only on the PricingStrategy interface,
 * so it can be used with any pricing strategy.
 */
public class Checkout {
    private final PricingStrategy pricingStrategy;

    public Checkout(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    /**
     * The total to pay for items with the given base prices, using the pricing strategy for each item.
     */
    public double total(List<Double> basePrices) {
        // TODO: add up the price of each item, using the pricing strategy
        return 0;
    }
}
