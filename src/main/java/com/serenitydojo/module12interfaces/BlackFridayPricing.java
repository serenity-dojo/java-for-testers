package com.serenitydojo.module12interfaces;

/**
 * Exercise 12.2b: on Black Friday everything is 30% off.
 */
public class BlackFridayPricing implements PricingStrategy {

    @Override
    public double priceFor(double basePrice) {
        // TODO: take 30% off the base price
        return 0;
    }
}
