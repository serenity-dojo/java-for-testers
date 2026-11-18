package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 15.10: Using tags in JUnit 6.
 * <p>
 * Tag the tests: mark the quick sanity checks as "smoke" tests, and the tests that take a long time as "slow"
 * tests, using @Tag("..."). Then run just some of the tests from the command line:
 * <pre>
 *   mvn test -Dtest=WhenUsingTagsTest -Dgroups=smoke
 *   mvn test -Dtest=WhenUsingTagsTest -DexcludedGroups=slow
 * </pre>
 * TagsAreAppliedTest checks your work.
 */
class WhenUsingTagsTest {

    @Test
    @Tag("smoke")
    void aNewBasketShouldBeEmpty() {
        assertThat(new Basket().isEmpty()).isTrue();
    }

    @Test
    @Tag("smoke")
    void anItemCanBeAddedToTheBasket() {
        Basket basket = new Basket();

        basket.add("Apple", 0.50, 1);

        assertThat(basket.itemCount()).isEqualTo(1);
    }

    @Test
    @Tag("slow")
    void aVeryLargeBasketShouldBeCalculatedCorrectly() {
        Basket basket = new Basket();

        for (int i = 0; i < 100_000; i++) {
            basket.add("Item " + i, 1.00, 1);
        }

        assertThat(basket.itemCount()).isEqualTo(100_000);
        assertThat(basket.total()).isEqualTo(100_000.00);
    }

    @Test
    @Tag("slow")
    void aBasketShouldSurviveBeingFilledAndEmptiedRepeatedly() {
        Basket basket = new Basket();

        for (int round = 0; round < 200; round++) {
            for (int i = 0; i < 100; i++) {
                basket.add("Item " + i, 1.00, 1);
            }
            for (int i = 0; i < 100; i++) {
                basket.remove("Item " + i);
            }
        }

        assertThat(basket.isEmpty()).isTrue();
    }
}
