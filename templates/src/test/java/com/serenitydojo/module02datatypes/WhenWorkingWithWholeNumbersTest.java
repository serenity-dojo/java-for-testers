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
//@@ solution
        int total = 10 + 5 * 2;
//@@ starter
        int total = 0;
//@@ end

        assertThat(total).isEqualTo(20);
    }

    @Test
    void integerDivisionDiscardsTheRemainder() {
        int apples = 17;
        int children = 5;

        // TODO: how many apples does each child get? (divide apples by children)
//@@ solution
        int applesEach = apples / children;
//@@ starter
        int applesEach = 0;
//@@ end

        // TODO: how many apples are left over? (use the modulo operator %)
//@@ solution
        int applesLeftOver = apples % children;
//@@ starter
        int applesLeftOver = 0;
//@@ end

        assertThat(applesEach).isEqualTo(3);
        assertThat(applesLeftOver).isEqualTo(2);
    }

    @Test
    void incrementingAndAdding() {
        int counter = 5;

        // TODO: increase the counter by one using ++, then add 10 using +=
//@@ solution
        counter++;
        counter += 10;
//@@ starter
//@@ end

        assertThat(counter).isEqualTo(16);
    }

    @Test
    void anIntCanOverflow() {
        int max = Integer.MAX_VALUE;
        int overflowed = max + 1;

        // An int wraps around when it gets too big...
        assertThat(overflowed).isEqualTo(Integer.MIN_VALUE);

        // TODO: calculate max + 1 without overflowing, by converting max to a long first: (long) max
//@@ solution
        long safe = (long) max + 1;
//@@ starter
        long safe = max + 1;
//@@ end

        assertThat(safe).isEqualTo(2_147_483_648L);
    }

    @Test
    void convertingTextToANumber() {
        // TODO: convert the text "123" to an int, using Integer.parseInt()
//@@ solution
        int parsed = Integer.parseInt("123");
//@@ starter
        int parsed = 0;
//@@ end

        assertThat(parsed).isEqualTo(123);
    }

    @Test
    void usingTheMathClass() {
        // TODO: find the larger of 7 and 12 using Math.max()
//@@ solution
        int larger = Math.max(7, 12);
//@@ starter
        int larger = 0;
//@@ end

        // TODO: find the absolute value of -25 using Math.abs()
//@@ solution
        int absolute = Math.abs(-25);
//@@ starter
        int absolute = 0;
//@@ end

        assertThat(larger).isEqualTo(12);
        assertThat(absolute).isEqualTo(25);
    }
}
