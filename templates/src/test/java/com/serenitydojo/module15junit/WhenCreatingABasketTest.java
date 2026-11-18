package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 15.3: Your first JUnit 6 test.
 * <p>
 * Write each test using the Basket class. Each test needs the @Test annotation.
 */
class WhenCreatingABasketTest {

    @Test
    void aNewBasketShouldBeEmpty() {
        // TODO: create a new Basket, and check that it is empty and has no items
//@@ solution
        Basket basket = new Basket();

        assertThat(basket.isEmpty()).isTrue();
        assertThat(basket.itemCount()).isZero();
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void addingAnItemShouldIncreaseTheItemCount() {
        // TODO: add 3 apples at 0.50 each to a basket, and check that the item count is 3
//@@ solution
        Basket basket = new Basket();

        basket.add("Apple", 0.50, 3);

        assertThat(basket.itemCount()).isEqualTo(3);
        assertThat(basket.isEmpty()).isFalse();
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void theTotalShouldBeThePriceMultipliedByTheQuantity() {
        // TODO: add 3 apples at 0.50 and 2 pears at 0.75, and check that the total is 3.00
//@@ solution
        Basket basket = new Basket();

        basket.add("Apple", 0.50, 3);
        basket.add("Pear", 0.75, 2);

        assertThat(basket.total()).isEqualTo(3.00);
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void removingAnItemShouldTakeItOutOfTheBasket() {
        // TODO: add an apple and a pear, remove the apple, and check that only the pear is left
//@@ solution
        Basket basket = new Basket();
        basket.add("Apple", 0.50, 3);
        basket.add("Pear", 0.75, 2);

        basket.remove("Apple");

        assertThat(basket.items()).extracting(Basket.Item::name).containsExactly("Pear");
//@@ starter
        fail("TODO: write this test");
//@@ end
    }
}
