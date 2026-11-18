package com.serenitydojo.module11assertions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 11.3: Assertions about collections.
 */
class WhenWritingAssertionsAboutCollectionsTest {

    @Test
    void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "red"
        assertThat(colors).contains("red");
    }

    @Test
    void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "red" and "blue"
        assertThat(colors).contains("red", "blue");
    }

    @Test
    void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains 3 elements
        assertThat(colors).hasSize(3);
    }

    @Test
    void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains exactly "red", "green" and "blue", in that order
        assertThat(colors).containsExactly("red", "green", "blue");
    }

    @Test
    void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "blue", "red" and "green", in any order
        assertThat(colors).containsExactlyInAnyOrder("blue", "red", "green");
    }

    @Test
    void whenAListDoesNotContainAValue() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list does not contain "yellow"
        assertThat(colors).doesNotContain("yellow");
    }

    @Test
    void whenAListIsEmpty() {
        List<String> noColors = List.of();

        // Check that the list is empty
        assertThat(noColors).isEmpty();
    }

    @Test
    void whenEveryElementMatchesACondition() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that every color has at least 3 characters
        assertThat(colors).allMatch(color -> color.length() >= 3);
    }

    @Test
    void whenFilteringAList() {
        List<String> colors = Arrays.asList("red", "green", "blue", "grey");

        // Check that exactly two colors start with "gr"
        assertThat(colors).filteredOn(color -> color.startsWith("gr")).hasSize(2);
    }

    @Test
    void whenAMapContainsAnEntry() {
        Map<String, Integer> ballsByColor = Map.of("red", 3, "green", 6);

        // Check that the map has 3 red balls and contains the key "green"
        assertThat(ballsByColor).containsEntry("red", 3).containsKey("green");
    }
}
