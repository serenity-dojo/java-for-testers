package com.serenitydojo.module11assertions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 11.3: Assertions about collections.
 */
class WhenWritingAssertionsAboutCollectionsTest {

    @Test
    void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "red"
//@@ solution
        assertThat(colors).contains("red");
//@@ starter
        fail("TODO: assert that the list contains 'red'");
//@@ end
    }

    @Test
    void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "red" and "blue"
//@@ solution
        assertThat(colors).contains("red", "blue");
//@@ starter
        fail("TODO: assert that the list contains 'red' and 'blue'");
//@@ end
    }

    @Test
    void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains 3 elements
//@@ solution
        assertThat(colors).hasSize(3);
//@@ starter
        fail("TODO: assert that the list has 3 elements");
//@@ end
    }

    @Test
    void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains exactly "red", "green" and "blue", in that order
//@@ solution
        assertThat(colors).containsExactly("red", "green", "blue");
//@@ starter
        fail("TODO: assert that the list contains exactly 'red', 'green' and 'blue' in that order");
//@@ end
    }

    @Test
    void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list contains "blue", "red" and "green", in any order
//@@ solution
        assertThat(colors).containsExactlyInAnyOrder("blue", "red", "green");
//@@ starter
        fail("TODO: assert that the list contains 'blue', 'red' and 'green' in any order");
//@@ end
    }

    @Test
    void whenAListDoesNotContainAValue() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that the list does not contain "yellow"
//@@ solution
        assertThat(colors).doesNotContain("yellow");
//@@ starter
        fail("TODO: assert that the list does not contain 'yellow'");
//@@ end
    }

    @Test
    void whenAListIsEmpty() {
        List<String> noColors = List.of();

        // Check that the list is empty
//@@ solution
        assertThat(noColors).isEmpty();
//@@ starter
        fail("TODO: assert that the list is empty");
//@@ end
    }

    @Test
    void whenEveryElementMatchesACondition() {
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Check that every color has at least 3 characters
//@@ solution
        assertThat(colors).allMatch(color -> color.length() >= 3);
//@@ starter
        fail("TODO: assert that every color has at least 3 characters (use allMatch)");
//@@ end
    }

    @Test
    void whenFilteringAList() {
        List<String> colors = Arrays.asList("red", "green", "blue", "grey");

        // Check that exactly two colors start with "gr"
//@@ solution
        assertThat(colors).filteredOn(color -> color.startsWith("gr")).hasSize(2);
//@@ starter
        fail("TODO: assert that two colors start with 'gr' (use filteredOn)");
//@@ end
    }

    @Test
    void whenAMapContainsAnEntry() {
        Map<String, Integer> ballsByColor = Map.of("red", 3, "green", 6);

        // Check that the map has 3 red balls and contains the key "green"
//@@ solution
        assertThat(ballsByColor).containsEntry("red", 3).containsKey("green");
//@@ starter
        fail("TODO: assert that the map contains the entry red=3 and the key 'green'");
//@@ end
    }
}
