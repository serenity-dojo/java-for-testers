package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 15.3: Your first JUnit 6 test.
 * <p>
 * Write each test using the Basket class. Each test needs the @Test annotation.
 */
class WhenCreatingABasketTest {

    @Test
    void aNewBasketShouldBeEmpty() {
        // TODO: create a new Basket, and check that it is empty and has no items
        fail("TODO: write this test");
    }

    @Test
    void addingAnItemShouldIncreaseTheItemCount() {
        // TODO: add 3 apples at 0.50 each to a basket, and check that the item count is 3
        fail("TODO: write this test");
    }

    @Test
    void theTotalShouldBeThePriceMultipliedByTheQuantity() {
        // TODO: add 3 apples at 0.50 and 2 pears at 0.75, and check that the total is 3.00
        fail("TODO: write this test");
    }

    @Test
    void removingAnItemShouldTakeItOutOfTheBasket() {
        // TODO: add an apple and a pear, remove the apple, and check that only the pear is left
        fail("TODO: write this test");
    }
}
