package com.serenitydojo.module04methods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 4.2: Static fields. Complete the static fields in the Cat class.
 */
class WhenUsingStaticFieldsTest {

    @Test
    void theCatNoiseIsSharedByAllCats() {
        assertThat(Cat.CAT_NOISE).isEqualTo("Meow");
    }

    @Test
    void eachNewCatIsAddedToTheTotalNumberOfCats() {
        int catsBefore = Cat.getNumberOfCats();

        new Cat("Felix", 4);
        new Cat("Tom", 6);

        assertThat(Cat.getNumberOfCats()).isEqualTo(catsBefore + 2);
    }
}
