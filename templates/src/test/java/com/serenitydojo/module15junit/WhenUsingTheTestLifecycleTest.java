package com.serenitydojo.module15junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 15.4: The JUnit 6 test lifecycle.
 * <p>
 * These tests expect lifecycle methods to prepare the test. Add the missing methods, using
 * @BeforeAll, @BeforeEach, @AfterEach and @AfterAll, so that the tests pass:
 * <ul>
 *   <li>a static @BeforeAll method which adds "beforeAll" to the events list</li>
 *   <li>a @BeforeEach method which creates a new Basket (assign it to the basket field)
 *       and adds "beforeEach" to the events list</li>
 *   <li>an @AfterEach method which adds "afterEach" to the events list</li>
 *   <li>a static @AfterAll method which clears the events list</li>
 * </ul>
 */
class WhenUsingTheTestLifecycleTest {

    private static final List<String> events = new ArrayList<>();

    private Basket basket;

//@@ solution
    @BeforeAll
    static void beforeAll() {
        events.add("beforeAll");
    }

    @BeforeEach
    void createABasket() {
        basket = new Basket();
        events.add("beforeEach");
    }

    @AfterEach
    void afterEach() {
        events.add("afterEach");
    }

    @AfterAll
    static void afterAll() {
        events.clear();
    }

//@@ starter
    // TODO: add the lifecycle methods here

//@@ end
    @Test
    void eachTestShouldStartWithAnEmptyBasket() {
        assertThat(basket).isNotNull();
        assertThat(basket.isEmpty()).isTrue();
    }

    @Test
    void changesMadeInOneTestShouldNotAffectAnotherTest() {
        assertThat(basket).isNotNull();
        basket.add("Apple", 0.50, 1);

        assertThat(basket.itemCount()).isEqualTo(1);
    }

    @Test
    void beforeAllShouldRunOnlyOnce() {
        assertThat(events.get(0)).isEqualTo("beforeAll");
        assertThat(Collections.frequency(events, "beforeAll")).isEqualTo(1);
    }

    @Test
    void beforeEachShouldRunBeforeEveryTest() {
        long beforeEachCalls = Collections.frequency(events, "beforeEach");
        long afterEachCalls = Collections.frequency(events, "afterEach");

        // The current test has started, but not finished: it has had a @BeforeEach, but not yet an @AfterEach
        assertThat(beforeEachCalls).isGreaterThanOrEqualTo(1);
        assertThat(afterEachCalls).isEqualTo(beforeEachCalls - 1);
    }
}
