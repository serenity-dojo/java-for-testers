package com.serenitydojo.module12interfaces;

/**
 * Different customers can be charged in different ways. This interface is complete - you do not need to change it.
 */
@FunctionalInterface
public interface PricingStrategy {

    /**
     * Works out the price a customer pays for something that normally costs the base price.
     */
    double priceFor(double basePrice);
}
