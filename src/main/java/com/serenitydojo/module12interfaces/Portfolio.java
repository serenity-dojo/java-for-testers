package com.serenitydojo.module12interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Exercise 12.1c: a portfolio works with anything that is InterestBearing,
 * without needing to know whether it is a savings account or a bond.
 */
public class Portfolio {
    private final List<InterestBearing> holdings = new ArrayList<>();

    public void add(InterestBearing holding) {
        holdings.add(holding);
    }

    public int size() {
        return holdings.size();
    }

    /**
     * The total monthly interest of everything in the portfolio.
     */
    public double totalMonthlyInterest() {
        // TODO: add up the monthly interest of every holding
        return 0;
    }

    /**
     * The holding that earns the most interest each month, if there are any holdings.
     */
    public Optional<InterestBearing> highestYieldingHolding() {
        // TODO: find the holding with the highest monthly interest
        return Optional.empty();
    }
}
