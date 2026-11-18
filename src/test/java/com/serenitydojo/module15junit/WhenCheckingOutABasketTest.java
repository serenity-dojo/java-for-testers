package com.serenitydojo.module15junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 15.7: Grouping tests with @Nested.
 * <p>
 * These tests are all in one flat list. Group them into two nested classes (annotated with @Nested):
 * one for the tests where the basket is empty, and one for the tests where the basket has items.
 * Move the setup into a @BeforeEach in each nested class, so that no tests are left in the outer class.
 * NestedTestStructureTest checks your work.
 */
class WhenCheckingOutABasketTest {

    private Basket emptyBasket;
    private Basket basketWithItems;

    @BeforeEach
    void createBaskets() {
        emptyBasket = new Basket();
        basketWithItems = new Basket();
        basketWithItems.add("Apple", 0.50, 4);
        basketWithItems.add("Melon", 2.00, 1);
    }

    @Test
    void anEmptyBasketShouldHaveNothingToPayFor() {
        assertThat(emptyBasket.total()).isZero();
    }

    @Test
    void anEmptyBasketShouldHaveNoItems() {
        assertThat(emptyBasket.itemCount()).isZero();
    }

    @Test
    void aBasketWithItemsShouldHaveATotalThatIncludesEveryItem() {
        assertThat(basketWithItems.total()).isEqualTo(4.00);
    }

    @Test
    void aBasketWithItemsShouldCountEveryQuantity() {
        assertThat(basketWithItems.itemCount()).isEqualTo(5);
    }

    @Test
    void removingAnItemShouldReduceTheTotal() {
        basketWithItems.remove("Melon");

        assertThat(basketWithItems.total()).isEqualTo(2.00);
    }
}
