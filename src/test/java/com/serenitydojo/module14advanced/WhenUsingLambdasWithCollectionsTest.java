package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 14.3: Introduction to lambda expressions. Implement the methods of LambdaExercises.
 */
class WhenUsingLambdasWithCollectionsTest {

    private final List<String> fruit = List.of("apple", "fig", "banana", "kiwi", "cherry");

    @Test
    void shouldFilterUsingALambda() {
        assertThat(LambdaExercises.filter(fruit, name -> name.length() > 5)).containsExactly("banana", "cherry");
    }

    @Test
    void shouldFilterUsingAMethodReference() {
        assertThat(LambdaExercises.filter(List.of("a", "", "b", ""), text -> !text.isEmpty()))
                .containsExactly("a", "b");
    }

    @Test
    void shouldTransformEachItem() {
        assertThat(LambdaExercises.transform(fruit, String::toUpperCase))
                .containsExactly("APPLE", "FIG", "BANANA", "KIWI", "CHERRY");
    }

    @Test
    void shouldTransformIntoADifferentType() {
        assertThat(LambdaExercises.transform(fruit, String::length)).containsExactly(5, 3, 6, 4, 6);
    }

    @Test
    void shouldPerformAnActionOnEachItem() {
        List<String> shouted = new ArrayList<>();

        LambdaExercises.forEachItem(List.of("a", "b"), item -> shouted.add(item.toUpperCase() + "!"));

        assertThat(shouted).containsExactly("A!", "B!");
    }

    @Test
    void shouldApplyAnOperationTwice() {
        assertThat(LambdaExercises.applyTwice(x -> x * 3, 2)).isEqualTo(18);
        assertThat(LambdaExercises.applyTwice(x -> x - 1, 10)).isEqualTo(8);
    }

    @Test
    void shouldSortByLength() {
        assertThat(LambdaExercises.sortByLength(fruit)).containsExactly("fig", "kiwi", "apple", "banana", "cherry");
        assertThat(fruit).containsExactly("apple", "fig", "banana", "kiwi", "cherry");
    }
}
