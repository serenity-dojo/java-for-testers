package com.serenitydojo.module09collections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 9.1: Arrays. Implement the methods of ArrayExercises.
 */
class WhenWorkingWithArraysTest {

    @Test
    void creatingAndReadingAnArray() {
        int[] numbers = {5, 10, 15};

        assertThat(numbers).hasSize(3);
        assertThat(numbers[0]).isEqualTo(5);
        assertThat(numbers[numbers.length - 1]).isEqualTo(15);
    }

    @Test
    void shouldSumTheNumbers() {
        assertThat(ArrayExercises.sum(new int[]{1, 2, 3, 4})).isEqualTo(10);
        assertThat(ArrayExercises.sum(new int[]{})).isZero();
    }

    @Test
    void shouldFindTheLargestNumber() {
        assertThat(ArrayExercises.largest(new int[]{3, 9, 2})).isEqualTo(9);
        assertThat(ArrayExercises.largest(new int[]{-3, -9, -2})).isEqualTo(-2);
    }

    @Test
    void anEmptyArrayHasNoLargestNumber() {
        assertThatThrownBy(() -> ArrayExercises.largest(new int[]{}))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldReverseAnArray() {
        int[] original = {1, 2, 3};

        int[] reversed = ArrayExercises.reverse(original);

        assertThat(reversed).containsExactly(3, 2, 1);
        assertThat(original).containsExactly(1, 2, 3);
    }

    @Test
    void shouldFindOutIfAnArrayContainsAValue() {
        String[] colors = {"red", "green", "blue"};

        assertThat(ArrayExercises.contains(colors, "green")).isTrue();
        assertThat(ArrayExercises.contains(colors, "yellow")).isFalse();
    }

    @Test
    void shouldCountOccurrences() {
        assertThat(ArrayExercises.countOccurrences(new int[]{1, 2, 1, 3, 1}, 1)).isEqualTo(3);
        assertThat(ArrayExercises.countOccurrences(new int[]{1, 2, 3}, 7)).isZero();
    }
}
