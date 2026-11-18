package com.serenitydojo.module11assertions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 11.2: Assertions about Strings.
 */
class WhenWritingAssertionsAboutStringsTest {

    @Test
    void whenAStringIsEqualToAnother() {
        String color = "red";

        // Check that the string has a value of 'red'
        assertThat(color).isEqualTo("red");
    }

    @Test
    void whenAStringIsEqualIgnoringCase() {
        String color = "RED";

        // Check that the string has a value of 'red' (ignoring case)
        assertThat(color).isEqualToIgnoringCase("red");
    }

    @Test
    void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";

        // Check that the value contains only digits
        assertThat(licenseNumber).containsOnlyDigits();
    }

    @Test
    void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value starts with 'red'
        assertThat(colors).startsWith("red");
    }

    @Test
    void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";

        // Check that the value ends with 'blue'
        assertThat(colors).endsWith("blue");
    }

    @Test
    void whenAStringContainsAValue() {
        String colors = "red,green,blue";

        // Check that the value contains 'green'
        assertThat(colors).contains("green");
    }

    @Test
    void whenAStringMatchesAPattern() {
        String postcode = "SW1A 1AA";

        // Check that the value matches the regular expression [A-Z0-9 ]+
        assertThat(postcode).matches("[A-Z0-9 ]+");
    }

    @Test
    void whenAStringIsEmptyOrBlank() {
        String empty = "";
        String blank = "   ";

        // Check that the first string is empty, and that the second is blank
        assertThat(empty).isEmpty();
        assertThat(blank).isBlank();
    }

    @Test
    void whenAStringHasASpecificLength() {
        String code = "ABC123";

        // Check that the code has exactly 6 characters
        assertThat(code).hasSize(6);
    }
}
