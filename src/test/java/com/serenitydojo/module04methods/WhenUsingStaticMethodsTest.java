package com.serenitydojo.module04methods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * Exercise 4.3: Static methods. Complete Cat.usualFood() and the TemperatureConverter class.
 */
class WhenUsingStaticMethodsTest {

    @Test
    void staticMethodsAreCalledOnTheClass() {
        assertThat(Cat.usualFood()).isEqualTo("Tuna");
    }

    @Test
    void convertingCelsiusToFahrenheit() {
        assertThat(TemperatureConverter.toFahrenheit(0)).isCloseTo(32.0, within(0.001));
        assertThat(TemperatureConverter.toFahrenheit(100)).isCloseTo(212.0, within(0.001));
        assertThat(TemperatureConverter.toFahrenheit(-40)).isCloseTo(-40.0, within(0.001));
    }

    @Test
    void convertingFahrenheitToCelsius() {
        assertThat(TemperatureConverter.toCelsius(32)).isCloseTo(0.0, within(0.001));
        assertThat(TemperatureConverter.toCelsius(212)).isCloseTo(100.0, within(0.001));
    }

    @Test
    void checkingForFreezingTemperatures() {
        assertThat(TemperatureConverter.isFreezing(-5)).isTrue();
        assertThat(TemperatureConverter.isFreezing(0)).isTrue();
        assertThat(TemperatureConverter.isFreezing(15)).isFalse();
    }
}
