package com.serenitydojo.module12interfaces;

/**
 * Exercise 12.2a: standard customers pay the full price.
 */
public class StandardPricing implements PricingStrategy {

    @Override
    public double priceFor(double basePrice) {
        return basePrice;
    }
}
