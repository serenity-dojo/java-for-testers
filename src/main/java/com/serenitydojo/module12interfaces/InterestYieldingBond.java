package com.serenitydojo.module12interfaces;

/**
 * Exercise 12.1b: a bond pays a fixed coupon each year, based on its face value.
 */
public class InterestYieldingBond implements InterestBearing {
    private final double faceValue;
    private final double couponRate;

    /**
     * @param couponRate the yearly rate as a fraction, e.g. 0.05 for 5%
     */
    public InterestYieldingBond(double faceValue, double couponRate) {
        this.faceValue = faceValue;
        this.couponRate = couponRate;
    }

    /**
     * The monthly interest is the face value multiplied by the coupon rate, divided by 12.
     */
    @Override
    public double monthlyInterest() {
        return faceValue * couponRate / 12;
    }
}
