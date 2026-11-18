package com.serenitydojo.module04methods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 4.1: Defining methods. Implement the methods in the Cat class.
 */
class WhenDefiningMethodsTest {

    @Test
    void aCatMakesANoise() {
        Cat felix = new Cat("Felix", 4);

        assertThat(felix.makeNoise()).isEqualTo("Meow");
    }

    @Test
    void aCatCanHaveABirthday() {
        Cat felix = new Cat("Felix", 4);

        felix.haveBirthday();

        assertThat(felix.getAge()).isEqualTo(5);
    }

    @Test
    void aCatIsAnAdultWhenItIsAtLeastOneYearOld() {
        Cat kitten = new Cat("Kit", 0);
        Cat felix = new Cat("Felix", 4);

        assertThat(kitten.isAdult()).isFalse();
        assertThat(felix.isAdult()).isTrue();
    }

    @Test
    void aCatCanDescribeItself() {
        Cat felix = new Cat("Felix", 4);

        assertThat(felix.describe()).isEqualTo("Felix is 4 years old");
    }

    @Test
    void aCatCanBeFed() {
        Cat felix = new Cat("Felix", 4);

        assertThat(felix.feed("tuna")).isEqualTo("Felix eats some tuna");
    }
}
