package com.serenitydojo.module09collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 9.2: Lists and sets. Implement the methods of SetExercises (and combine() in ListExercises).
 */
class WhenWorkingWithListsAndSetsTest {

    @Test
    void aListKeepsItsElementsInOrder() {
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        assertThat(names).containsExactly("joe", "sally", "pete");
        assertThat(names.get(1)).isEqualTo("sally");
        assertThat(names.indexOf("pete")).isEqualTo(2);
    }

    @Test
    void shouldCombineTwoLists() {
        List<String> first = List.of("joe", "sally");
        List<String> second = List.of("pete", "paul");

        List<String> combined = ListExercises.combine(first, second);

        assertThat(combined).containsExactly("joe", "sally", "pete", "paul");
        assertThat(first).containsExactly("joe", "sally");
    }

    @Test
    void aSetDoesNotContainDuplicates() {
        Set<String> colors = Set.of("red", "green", "blue");

        assertThat(colors).hasSize(3).contains("red");
    }

    @Test
    void shouldRemoveDuplicateWords() {
        List<String> words = List.of("pear", "apple", "pear", "banana", "apple");

        assertThat(SetExercises.uniqueWords(words)).containsExactly("apple", "banana", "pear");
    }

    @Test
    void shouldDetectDuplicates() {
        assertThat(SetExercises.hasDuplicates(List.of("a", "b", "a"))).isTrue();
        assertThat(SetExercises.hasDuplicates(List.of("a", "b", "c"))).isFalse();
        assertThat(SetExercises.hasDuplicates(List.of())).isFalse();
    }

    @Test
    void shouldFindTheElementsTwoSetsHaveInCommon() {
        Set<String> first = Set.of("red", "green", "blue");
        Set<String> second = Set.of("blue", "yellow", "red");

        assertThat(SetExercises.commonElements(first, second)).containsExactlyInAnyOrder("red", "blue");
        assertThat(first).hasSize(3);
    }
}
