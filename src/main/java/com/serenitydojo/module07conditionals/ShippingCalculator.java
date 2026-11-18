package com.serenitydojo.module07conditionals;

/**
 * Exercise 7.2a: Nested conditionals.
 */
public class ShippingCalculator {

    /**
     * Calculates the cost of shipping a parcel.
     * <p>
     * Base cost:
     * <pre>
     *                 up to 1kg   up to 5kg   over 5kg
     *   domestic         5.00        8.00       12.00
     *   international   15.00       25.00       40.00
     * </pre>
     * Express delivery doubles the cost of domestic shipping, and adds 10.00 to the cost of
     * international shipping.
     *
     * @throws IllegalArgumentException if the weight is zero or negative
     */
    public double shippingCost(double weightKg, boolean international, boolean express) {
        // TODO: use nested if statements to apply the rules above
        return 0;
    }
}
