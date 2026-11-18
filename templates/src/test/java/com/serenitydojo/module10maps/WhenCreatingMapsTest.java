package com.serenitydojo.module10maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercises 10.1 and 10.2: Creating maps, and creating them more concisely with Map.of().
 */
class WhenCreatingMapsTest {

    @Test
    void creatingAMapWithPut() {
//@@ solution
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();
        numberOfBallsByColor.put("red", 3);
        numberOfBallsByColor.put("green", 6);
        numberOfBallsByColor.put("blue", 5);
//@@ starter
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();
        // TODO: use put() to add 3 red balls, 6 green balls and 5 blue balls
//@@ end

        assertThat(numberOfBallsByColor).hasSize(3);
        assertThat(numberOfBallsByColor.get("red")).isEqualTo(3);
        assertThat(numberOfBallsByColor.get("green")).isEqualTo(6);
        assertThat(numberOfBallsByColor.get("blue")).isEqualTo(5);
    }

    @Test
    void creatingAMapMoreConciselyWithMapOf() {
        // TODO: create the same map in a single line, using Map.of(key1, value1, key2, value2, ...)
//@@ solution
        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);
//@@ starter
        Map<String, Integer> numberOfBallsByColor = Map.of();
//@@ end

        assertThat(numberOfBallsByColor).containsEntry("red", 3).containsEntry("green", 6).containsEntry("blue", 5);
    }

    @Test
    void aMapCreatedWithMapOfCannotBeChanged() {
        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6);

        assertThatThrownBy(() -> numberOfBallsByColor.put("blue", 5))
                .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void copyingAnImmutableMapIntoAModifiableOne() {
        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6);

        // TODO: create a modifiable copy using new HashMap<>(otherMap)
//@@ solution
        Map<String, Integer> modifiable = new HashMap<>(numberOfBallsByColor);
//@@ starter
        Map<String, Integer> modifiable = numberOfBallsByColor;
//@@ end
        modifiable.put("blue", 5);

        assertThat(modifiable).hasSize(3);
        assertThat(numberOfBallsByColor).hasSize(2);
    }

    @Test
    void anEmptyMapCanBeCreatedAndFilledLater() {
        Map<String, String> capitals = new HashMap<>();

        assertThat(capitals).isEmpty();

        capitals.put("France", "Paris");

        assertThat(capitals).isNotEmpty();
    }
}
