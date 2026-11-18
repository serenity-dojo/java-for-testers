package com.serenitydojo.module02datatypes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 2.2: Working with whole numbers.
 */
class WhenWorkingWithWholeNumbersTest {

    @Test
    void doingArithmetic() {
        // TODO: add 10 to 5 multiplied by 2 (remember that multiplication happens first)
        int total = 10 + 5 * 2;

        assertThat(total).isEqualTo(20);
    }

    @Test
    void integerDivisionDiscardsTheRemainder() {
        int apples = 17;
        int children = 5;

        // TODO: how many apples does each child get? (divide apples by children)
        int applesEach = apples / children;

        // TODO: how many apples are left over? (use the modulo operator %)
        int applesLeftOver = apples % children;

        assertThat(applesEach).isEqualTo(3);
        assertThat(applesLeftOver).isEqualTo(2);
    }

    @Test
    void incrementingAndAdding() {
        int counter = 5;

        // TODO: increase the counter by one using ++, then add 10 using +=
        counter++;
        counter += 10;

        assertThat(counter).isEqualTo(16);
    }

    @Test
    void anIntCanOverflow() {
        int max = Integer.MAX_VALUE;
        int overflowed = max + 1;

        // An int wraps around when it gets too big...
        assertThat(overflowed).isEqualTo(Integer.MIN_VALUE);

        // TODO: calculate max + 1 without overflowing, by converting max to a long first: (long) max
        long safe = (long) max + 1;

        assertThat(safe).isEqualTo(2_147_483_648L);
    }

    @Test
    void convertingTextToANumber() {
        // TODO: convert the text "123" to an int, using Integer.parseInt()
        int parsed = Integer.parseInt("123");

        assertThat(parsed).isEqualTo(123);
    }

    @Test
    void usingTheMathClass() {
        // TODO: find the larger of 7 and 12 using Math.max()
        int larger = Math.max(7, 12);

        // TODO: find the absolute value of -25 using Math.abs()
        int absolute = Math.abs(-25);

        assertThat(larger).isEqualTo(12);
        assertThat(absolute).isEqualTo(25);
    }
}
