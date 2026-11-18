package com.serenitydojo.module12interfaces;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * Exercise 12.2: Implementing an interface in different ways.
 * Implement StandardPricing, BlackFridayPricing, MemberPricing and Checkout.
 */
class WhenChoosingAPricingStrategyTest {

    private final List<Double> basket = List.of(10.0, 20.0, 70.0);

    @Test
    void standardCustomersPayTheFullPrice() {
        Checkout checkout = new Checkout(new StandardPricing());

        assertThat(checkout.total(basket)).isCloseTo(100.0, within(0.001));
    }

    @Test
    void blackFridayShoppersGetThirtyPercentOff() {
        Checkout checkout = new Checkout(new BlackFridayPricing());

        assertThat(checkout.total(basket)).isCloseTo(70.0, within(0.001));
    }

    @Test
    void membersGetTheirOwnDiscount() {
        Checkout checkout = new Checkout(new MemberPricing(15));

        assertThat(checkout.total(basket)).isCloseTo(85.0, within(0.001));
    }

    @Test
    void theStrategyCanBeChosenAtRuntime() {
        PricingStrategy strategy = new MemberPricing(50);

        assertThat(strategy.priceFor(80.0)).isCloseTo(40.0, within(0.001));
    }

    @Test
    void aLambdaCanImplementASingleMethodInterface() {
        PricingStrategy fiveOff = basePrice -> basePrice - 5;
        Checkout checkout = new Checkout(fiveOff);

        assertThat(checkout.total(basket)).isCloseTo(85.0, within(0.001));
    }

    @Test
    void anEmptyBasketCostsNothing() {
        assertThat(new Checkout(new StandardPricing()).total(List.of())).isZero();
    }
}
