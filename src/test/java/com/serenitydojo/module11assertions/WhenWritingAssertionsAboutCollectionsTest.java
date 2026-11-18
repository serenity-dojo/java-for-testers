package com.serenitydojo.module11assertions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 11.3: Assertions about collections.
 */
class WhenWritingAssertionsAboutCollectionsTest {

    @Test
    void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "red"
        fail("TODO: assert that the list contains 'red'");
    }

    @Test
    void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "red" and "blue"
        fail("TODO: assert that the list contains 'red' and 'blue'");
    }

    @Test
    void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains 3 elements
        fail("TODO: assert that the list has 3 elements");
    }

    @Test
    void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains exactly "red", "green" and "blue", in that order
        fail("TODO: assert that the list contains exactly 'red', 'green' and 'blue' in that order");
    }

    @Test
    void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "blue", "red" and "green", in any order
        fail("TODO: assert that the list contains 'blue', 'red' and 'green' in any order");
    }

    @Test
    void whenAListDoesNotContainAValue() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list does not contain "yellow"
        fail("TODO: assert that the list does not contain 'yellow'");
    }

    @Test
    void whenAListIsEmpty() {
        List<String> noColors = List.of();

        // Check that the list is empty
        fail("TODO: assert that the list is empty");
    }

    @Test
    void whenEveryElementMatchesACondition() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that every color has at least 3 characters
        fail("TODO: assert that every color has at least 3 characters (use allMatch)");
    }

    @Test
    void whenFilteringAList() {
        List<String> colors = Arrays.asList("red", "green", "blue", "grey");

        // Check that exactly two colors start with "gr"
        fail("TODO: assert that two colors start with 'gr' (use filteredOn)");
    }

    @Test
    void whenAMapContainsAnEntry() {
        Map<String, Integer> ballsByColor = Map.of("red", 3, "green", 6);

        // Check that the map has 3 red balls and contains the key "green"
        fail("TODO: assert that the map contains the entry red=3 and the key 'green'");
    }
}
