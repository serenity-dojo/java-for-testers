package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercises 15.1 and 15.2: Introduction to JUnit 6, and installing the sample project.
 * <p>
 * This test needs no changes. If it runs and passes, JUnit is working in your project.
 */
class WhenSettingUpJUnitTest {

    @Test
    void junitShouldBeRunningThisTest() {
        assertThat(true).isTrue();
    }

    @Test
    void theSampleProjectShouldBeAbleToCreateABasket() {
        Basket basket = new Basket();

        assertThat(basket).isNotNull();
    }
}
