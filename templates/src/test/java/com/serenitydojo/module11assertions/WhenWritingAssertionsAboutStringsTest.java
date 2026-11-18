package com.serenitydojo.module11assertions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 11.2: Assertions about Strings.
 */
class WhenWritingAssertionsAboutStringsTest {

    @Test
    void whenAStringIsEqualToAnother() {
        String color = "red";

        // Check that the string has a value of 'red'
//@@ solution
        assertThat(color).isEqualTo("red");
//@@ starter
        fail("TODO: assert that the color is 'red'");
//@@ end
    }

    @Test
    void whenAStringIsEqualIgnoringCase() {
        String color = "RED";

        // Check that the string has a value of 'red' (ignoring case)
//@@ solution
        assertThat(color).isEqualToIgnoringCase("red");
//@@ starter
        fail("TODO: assert that the color is 'red', ignoring case");
//@@ end
    }

    @Test
    void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";

        // Check that the value contains only digits
//@@ solution
        assertThat(licenseNumber).containsOnlyDigits();
//@@ starter
        fail("TODO: assert that the license number contains only digits");
//@@ end
    }

    @Test
    void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value starts with 'red'
//@@ solution
        assertThat(colors).startsWith("red");
//@@ starter
        fail("TODO: assert that the colors start with 'red'");
//@@ end
    }

    @Test
    void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value ends with 'blue'
//@@ solution
        assertThat(colors).endsWith("blue");
//@@ starter
        fail("TODO: assert that the colors end with 'blue'");
//@@ end
    }

    @Test
    void whenAStringContainsAValue() {
        String colors = "red,green,blue";

        // Check that the value contains 'green'
//@@ solution
        assertThat(colors).contains("green");
//@@ starter
        fail("TODO: assert that the colors contain 'green'");
//@@ end
    }

    @Test
    void whenAStringMatchesAPattern() {
        String postcode = "SW1A 1AA";

        // Check that the value matches the regular expression [A-Z0-9 ]+
//@@ solution
        assertThat(postcode).matches("[A-Z0-9 ]+");
//@@ starter
        fail("TODO: assert that the postcode matches the regular expression [A-Z0-9 ]+");
//@@ end
    }

    @Test
    void whenAStringIsEmptyOrBlank() {
        String empty = "";
        String blank = "   ";

        // Check that the first string is empty, and that the second is blank
//@@ solution
        assertThat(empty).isEmpty();
        assertThat(blank).isBlank();
//@@ starter
        fail("TODO: assert that the first string is empty and the second is blank");
//@@ end
    }

    @Test
    void whenAStringHasASpecificLength() {
        String code = "ABC123";

        // Check that the code has exactly 6 characters
//@@ solution
        assertThat(code).hasSize(6);
//@@ starter
        fail("TODO: assert that the code has 6 characters");
//@@ end
    }
}
