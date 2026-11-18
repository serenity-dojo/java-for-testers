package com.serenitydojo.module15junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
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

    @Nested
    class WhenTheBasketIsEmpty {

        private Basket basket;

        @BeforeEach
        void createAnEmptyBasket() {
            basket = new Basket();
        }

        @Test
        void thereShouldBeNothingToPayFor() {
            assertThat(basket.total()).isZero();
        }

        @Test
        void thereShouldBeNoItems() {
            assertThat(basket.itemCount()).isZero();
        }
    }

    @Nested
    class WhenTheBasketHasItems {

        private Basket basket;

        @BeforeEach
        void createABasketWithItems() {
            basket = new Basket();
            basket.add("Apple", 0.50, 4);
            basket.add("Melon", 2.00, 1);
        }

        @Test
        void theTotalShouldIncludeEveryItem() {
            assertThat(basket.total()).isEqualTo(4.00);
        }

        @Test
        void theItemCountShouldIncludeEveryQuantity() {
            assertThat(basket.itemCount()).isEqualTo(5);
        }

        @Test
        void removingAnItemShouldReduceTheTotal() {
            basket.remove("Melon");

            assertThat(basket.total()).isEqualTo(2.00);
        }
    }
}
