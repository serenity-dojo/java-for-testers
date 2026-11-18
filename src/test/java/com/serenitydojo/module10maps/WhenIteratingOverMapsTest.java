package com.serenitydojo.module10maps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 10.4: Iterating over maps.
 */
class WhenIteratingOverMapsTest {

    private final Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);

    @Test
    void iteratingOverTheKeys() {
        List<String> colors = new ArrayList<>();

        // TODO: loop over numberOfBallsByColor.keySet(), adding each key to the colors list
        for (String color : numberOfBallsByColor.keySet()) {
            colors.add(color);
        }

        assertThat(colors).containsExactlyInAnyOrder("red", "green", "blue");
    }

    @Test
    void iteratingOverTheValues() {
        int total = 0;

        // TODO: loop over numberOfBallsByColor.values(), adding up the number of balls
        for (int count : numberOfBallsByColor.values()) {
            total += count;
        }

        assertThat(total).isEqualTo(14);
    }

    @Test
    void iteratingOverTheEntries() {
        List<String> descriptions = new ArrayList<>();

        // TODO: loop over numberOfBallsByColor.entrySet(), adding a description such as "red=3" for each entry
        //       (use entry.getKey() and entry.getValue())
        for (Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()) {
            descriptions.add(entry.getKey() + "=" + entry.getValue());
        }

        assertThat(descriptions).containsExactlyInAnyOrder("red=3", "green=6", "blue=5");
    }

    @Test
    void iteratingWithForEach() {
        List<String> colorsWithManyBalls = new ArrayList<>();

        // TODO: use numberOfBallsByColor.forEach((color, count) -> ...) to collect the colors that have 5 or more balls
        numberOfBallsByColor.forEach((color, count) -> {
            if (count >= 5) {
                colorsWithManyBalls.add(color);
            }
        });

        assertThat(colorsWithManyBalls).containsExactlyInAnyOrder("green", "blue");
    }

    @Test
    void sortedMapsIterateInKeyOrder() {
        // TODO: copy the map into a TreeMap, which keeps its keys sorted
        Map<String, Integer> sorted = new TreeMap<>(numberOfBallsByColor);

        assertThat(sorted.keySet()).containsExactly("blue", "green", "red");
    }

    @Test
    void findingTheKeyWithTheLargestValue() {
        String colorWithMostBalls = null;
        int most = Integer.MIN_VALUE;

        // TODO: loop over the entries to find the color that has the most balls
        for (Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()) {
            if (entry.getValue() > most) {
                most = entry.getValue();
                colorWithMostBalls = entry.getKey();
            }
        }

        assertThat(colorWithMostBalls).isEqualTo("green");
    }

    @Test
    void shouldCountTheWordsInSomeText() {
        Map<String, Integer> counts = new WordCounter().countWords("the cat and The dog and the bird");

        assertThat(counts)
                .hasSize(5)
                .containsEntry("the", 3)
                .containsEntry("and", 2)
                .containsEntry("cat", 1)
                .containsEntry("dog", 1)
                .containsEntry("bird", 1);
    }

    @Test
    void shouldCountNothingInAnEmptyText() {
        assertThat(new WordCounter().countWords("")).isEmpty();
    }
}
