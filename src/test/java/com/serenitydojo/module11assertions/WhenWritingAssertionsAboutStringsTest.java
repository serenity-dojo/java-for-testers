package com.serenitydojo.module11assertions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 11.2: Assertions about Strings.
 */
class WhenWritingAssertionsAboutStringsTest {

    @Test
    void whenAStringIsEqualToAnother() {
        String color = "red";

        // Check that the string has a value of 'red'
        fail("TODO: assert that the color is 'red'");
    }

    @Test
    void whenAStringIsEqualIgnoringCase() {
        String color = "RED";

        // Check that the string has a value of 'red' (ignoring case)
        fail("TODO: assert that the color is 'red', ignoring case");
    }

    @Test
    void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";

        // Check that the value contains only digits
        fail("TODO: assert that the license number contains only digits");
    }

    @Test
    void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value starts with 'red'
        fail("TODO: assert that the colors start with 'red'");
    }

    @Test
    void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value ends with 'blue'
        fail("TODO: assert that the colors end with 'blue'");
    }

    @Test
    void whenAStringContainsAValue() {
        String colors = "red,green,blue";

        // Check that the value contains 'green'
        fail("TODO: assert that the colors contain 'green'");
    }

    @Test
    void whenAStringMatchesAPattern() {
        String postcode = "SW1A 1AA";

        // Check that the value matches the regular expression [A-Z0-9 ]+
        fail("TODO: assert that the postcode matches the regular expression [A-Z0-9 ]+");
    }

    @Test
    void whenAStringIsEmptyOrBlank() {
        String empty = "";
        String blank = "   ";

        // Check that the first string is empty, and that the second is blank
        fail("TODO: assert that the first string is empty and the second is blank");
    }

    @Test
    void whenAStringHasASpecificLength() {
        String code = "ABC123";

        // Check that the code has exactly 6 characters
        fail("TODO: assert that the code has 6 characters");
    }
}
