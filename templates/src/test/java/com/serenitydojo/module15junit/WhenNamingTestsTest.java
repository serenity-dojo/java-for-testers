package com.serenitydojo.module15junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 15.6: Naming your tests.
 * <p>
 * These tests work, but their names do not explain what they check. Rename each method so that it describes
 * the behaviour being tested (for example shouldIncreaseTheItemCountWhenAnItemIsAdded), and add a
 * @DisplayName with a readable sentence. TestNamingStandardsTest checks your work.
 */
class WhenNamingTestsTest {

//@@ solution
    @Test
    @DisplayName("A new basket is empty")
    void shouldStartEmpty() {
        assertThat(new Basket().isEmpty()).isTrue();
    }

    @Test
    @DisplayName("Adding an item increases the item count by its quantity")
    void shouldIncreaseTheItemCountWhenAnItemIsAdded() {
        Basket basket = new Basket();

        basket.add("Apple", 0.50, 3);

        assertThat(basket.itemCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("The total is the sum of the price multiplied by the quantity of each item")
    void shouldCalculateTheTotalFromPricesAndQuantities() {
        Basket basket = new Basket();
        basket.add("Apple", 0.50, 3);
        basket.add("Pear", 1.00, 1);

        assertThat(basket.total()).isEqualTo(2.50);
    }
//@@ starter
    @Test
    void test1() {
        assertThat(new Basket().isEmpty()).isTrue();
    }

    @Test
    void test2() {
        Basket basket = new Basket();

        basket.add("Apple", 0.50, 3);

        assertThat(basket.itemCount()).isEqualTo(3);
    }

    @Test
    void test3() {
        Basket basket = new Basket();
        basket.add("Apple", 0.50, 3);
        basket.add("Pear", 1.00, 1);

        assertThat(basket.total()).isEqualTo(2.50);
    }
//@@ end
}
