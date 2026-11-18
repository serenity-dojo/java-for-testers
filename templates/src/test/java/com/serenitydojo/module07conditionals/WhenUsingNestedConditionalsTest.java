package com.serenitydojo.module07conditionals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 7.2: Nested conditionals.
 */
class WhenUsingNestedConditionalsTest {

    private final ShippingCalculator shipping = new ShippingCalculator();
    private final TicketPricer tickets = new TicketPricer();

    // ---- Shipping ----

    @Test
    void domesticShippingDependsOnWeight() {
        assertThat(shipping.shippingCost(0.5, false, false)).isEqualTo(5.00);
        assertThat(shipping.shippingCost(3.0, false, false)).isEqualTo(8.00);
        assertThat(shipping.shippingCost(10.0, false, false)).isEqualTo(12.00);
    }

    @Test
    void internationalShippingDependsOnWeight() {
        assertThat(shipping.shippingCost(1.0, true, false)).isEqualTo(15.00);
        assertThat(shipping.shippingCost(5.0, true, false)).isEqualTo(25.00);
        assertThat(shipping.shippingCost(5.1, true, false)).isEqualTo(40.00);
    }

    @Test
    void expressDomesticShippingCostsDouble() {
        assertThat(shipping.shippingCost(0.5, false, true)).isEqualTo(10.00);
        assertThat(shipping.shippingCost(3.0, false, true)).isEqualTo(16.00);
    }

    @Test
    void expressInternationalShippingCostsTenMore() {
        assertThat(shipping.shippingCost(0.5, true, true)).isEqualTo(25.00);
        assertThat(shipping.shippingCost(10.0, true, true)).isEqualTo(50.00);
    }

    @Test
    void parcelsMustHaveAPositiveWeight() {
        assertThatThrownBy(() -> shipping.shippingCost(0, false, false))
                .isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> shipping.shippingCost(-2, true, true))
                .isInstanceOf(IllegalArgumentException.class);
    }

    // ---- Tickets ----

    @Test
    void youngChildrenGetInFree() {
        assertThat(tickets.priceFor(4, false, false)).isEqualTo(0.00);
        assertThat(tickets.priceFor(4, false, true)).isEqualTo(0.00);
    }

    @Test
    void childrenPayAChildPrice() {
        assertThat(tickets.priceFor(5, false, false)).isEqualTo(6.00);
        assertThat(tickets.priceFor(15, true, false)).isEqualTo(6.00);
    }

    @Test
    void seniorsPayASeniorPrice() {
        assertThat(tickets.priceFor(65, false, false)).isEqualTo(7.00);
        assertThat(tickets.priceFor(80, true, false)).isEqualTo(7.00);
    }

    @Test
    void adultsPayMoreThanStudents() {
        assertThat(tickets.priceFor(30, false, false)).isEqualTo(12.00);
        assertThat(tickets.priceFor(20, true, false)).isEqualTo(8.00);
    }

    @Test
    void weekendTicketsCostTwoMore() {
        assertThat(tickets.priceFor(8, false, true)).isEqualTo(8.00);
        assertThat(tickets.priceFor(30, false, true)).isEqualTo(14.00);
        assertThat(tickets.priceFor(20, true, true)).isEqualTo(10.00);
        assertThat(tickets.priceFor(70, false, true)).isEqualTo(9.00);
    }

    @Test
    void ageCannotBeNegative() {
        assertThatThrownBy(() -> tickets.priceFor(-1, false, false))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
