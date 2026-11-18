package com.serenitydojo.module02datatypes;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

/**
 * Exercise 2.3: Working with floating point decimals.
 */
class WhenWorkingWithDecimalsTest {

    @Test
    void calculatingAPrice() {
        double price = 19.99;
        int quantity = 3;

        // TODO: calculate the total cost
//@@ solution
        double total = price * quantity;
//@@ starter
        double total = 0.0;
//@@ end

        // Floating point numbers are approximate, so compare them within a tolerance
        assertThat(total).isCloseTo(59.97, within(0.0001));
    }

    @Test
    void integerDivisionLosesTheDecimals() {
        // TODO: this should calculate 7 divided by 2 as 3.5, but it gives 3.0. Fix it.
        //       (hint: if either number is a double, Java uses decimal division)
//@@ solution
        double average = 7 / 2.0;
//@@ starter
        double average = 7 / 2;
//@@ end

        assertThat(average).isEqualTo(3.5);
    }

    @Test
    void floatingPointNumbersAreNotExact() {
        double sum = 0.1 + 0.2;

        // 0.1 + 0.2 is not exactly 0.3 in floating point arithmetic!
        assertThat(sum).isNotEqualTo(0.3);

        // TODO: assert that the sum is close to 0.3, within 0.0001
//@@ solution
        assertThat(sum).isCloseTo(0.3, within(0.0001));
//@@ starter
        assertThat(sum).isEqualTo(0.3);
//@@ end
    }

    @Test
    void roundingNumbers() {
        // TODO: round 2.5 to the nearest whole number using Math.round()
//@@ solution
        long rounded = Math.round(2.5);
//@@ starter
        long rounded = 0;
//@@ end

        // TODO: round 4.1 up to the next whole number using Math.ceil()
//@@ solution
        double roundedUp = Math.ceil(4.1);
//@@ starter
        double roundedUp = 0;
//@@ end

        // TODO: round 4.9 down to the previous whole number using Math.floor()
//@@ solution
        double roundedDown = Math.floor(4.9);
//@@ starter
        double roundedDown = 0;
//@@ end

        assertThat(rounded).isEqualTo(3);
        assertThat(roundedUp).isEqualTo(5.0);
        assertThat(roundedDown).isEqualTo(4.0);
    }

    @Test
    void castingADoubleToAnIntTruncatesIt() {
        // TODO: convert 9.99 to an int by casting it with (int)
//@@ solution
        int truncated = (int) 9.99;
//@@ starter
        int truncated = 0;
//@@ end

        assertThat(truncated).isEqualTo(9);
    }

    @Test
    void bigDecimalIsExact() {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");

        // TODO: add a and b using the add() method
//@@ solution
        BigDecimal exact = a.add(b);
//@@ starter
        BigDecimal exact = BigDecimal.ZERO;
//@@ end

        assertThat(exact).isEqualByComparingTo(new BigDecimal("0.3"));
    }

    @Test
    void formattingANumber() {
        // TODO: format 3.14159 with two decimal places using String.format and "%.2f"
//@@ solution
        String formatted = String.format(Locale.ROOT, "%.2f", 3.14159);
//@@ starter
        String formatted = "";
//@@ end

        assertThat(formatted).isEqualTo("3.14");
    }
}
