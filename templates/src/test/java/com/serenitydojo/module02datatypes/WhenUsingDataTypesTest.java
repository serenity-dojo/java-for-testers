package com.serenitydojo.module02datatypes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 2.1: Understanding Java data types.
 * <p>
 * Each test declares a variable. Give each variable the value described in the TODO comment.
 */
class WhenUsingDataTypesTest {

    @Test
    void declaringAnInt() {
        // TODO: set the age to 42
//@@ solution
        int age = 42;
//@@ starter
        int age = 0;
//@@ end

        assertThat(age).isEqualTo(42);
    }

    @Test
    void declaringALong() {
        // TODO: set the population to eight billion (it is too big for an int, so remember the L suffix)
//@@ solution
        long worldPopulation = 8_000_000_000L;
//@@ starter
        long worldPopulation = 0L;
//@@ end

        assertThat(worldPopulation).isEqualTo(8_000_000_000L);
    }

    @Test
    void declaringADouble() {
        // TODO: set the price to 19.99
//@@ solution
        double price = 19.99;
//@@ starter
        double price = 0.0;
//@@ end

        assertThat(price).isEqualTo(19.99);
    }

    @Test
    void declaringABoolean() {
        // TODO: it is raining!
//@@ solution
        boolean isRaining = true;
//@@ starter
        boolean isRaining = false;
//@@ end

        assertThat(isRaining).isTrue();
    }

    @Test
    void declaringAChar() {
        // TODO: set the grade to the single character A (use single quotes)
//@@ solution
        char grade = 'A';
//@@ starter
        char grade = 'Z';
//@@ end

        assertThat(grade).isEqualTo('A');
    }

    @Test
    void declaringAString() {
        // TODO: set the name to "Felix" (use double quotes)
//@@ solution
        String name = "Felix";
//@@ starter
        String name = "";
//@@ end

        assertThat(name).isEqualTo("Felix");
    }

    // TODO: set the constant to 7. Constants are declared with 'static final' and named in UPPER_SNAKE_CASE
//@@ solution
    private static final int DAYS_IN_A_WEEK = 7;
//@@ starter
    private static final int DAYS_IN_A_WEEK = 0;
//@@ end

    @Test
    void declaringAConstant() {
        assertThat(DAYS_IN_A_WEEK).isEqualTo(7);
    }

    @Test
    void primitivesAndWrapperObjectsConvertAutomatically() {
        Integer boxed = 42;
        // TODO: assign the boxed value to a primitive int (Java does the conversion for you)
//@@ solution
        int unboxed = boxed;
//@@ starter
        int unboxed = 0;
//@@ end

        assertThat(unboxed).isEqualTo(42);
    }
}
