package com.serenitydojo.module12interfaces;

/**
 * Exercise 12.2c: members get a percentage discount, which is set when the strategy is created.
 */
public class MemberPricing implements PricingStrategy {
    private final double discountPercent;

    public MemberPricing(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double priceFor(double basePrice) {
        return basePrice * (100 - discountPercent) / 100;
    }
}
