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
        double total = 0;
        for (InterestBearing holding : holdings) {
            total += holding.monthlyInterest();
        }
        return total;
    }

    /**
     * The holding that earns the most interest each month, if there are any holdings.
     */
    public Optional<InterestBearing> highestYieldingHolding() {
        InterestBearing best = null;
        for (InterestBearing holding : holdings) {
            if (best == null || holding.monthlyInterest() > best.monthlyInterest()) {
                best = holding;
            }
        }
        return Optional.ofNullable(best);
    }
}
