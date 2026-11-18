package com.serenitydojo.module09collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 9.3: Advanced lists. Implement the methods of ListExercises.
 */
class WhenWorkingWithAdvancedListsTest {

    private final List<String> names = List.of("joe", "Sally", "pete", "sally", "Paul");

    @Test
    void shouldSortNamesAlphabetically() {
        assertThat(ListExercises.sortedAlphabetically(names))
                .containsExactly("Paul", "Sally", "joe", "pete", "sally");
    }

    @Test
    void sortingShouldNotChangeTheOriginalList() {
        ListExercises.sortedAlphabetically(names);

        assertThat(names).containsExactly("joe", "Sally", "pete", "sally", "Paul");
    }

    @Test
    void shouldFindNamesStartingWithAPrefixIgnoringCase() {
        assertThat(ListExercises.namesStartingWith(names, "s")).containsExactly("Sally", "sally");
        assertThat(ListExercises.namesStartingWith(names, "PA")).containsExactly("Paul");
        assertThat(ListExercises.namesStartingWith(names, "x")).isEmpty();
    }

    @Test
    void shouldFindTheLongestName() {
        assertThat(ListExercises.longestName(names)).isEqualTo("Sally");
    }

    @Test
    void anEmptyListHasNoLongestName() {
        assertThatThrownBy(() -> ListExercises.longestName(List.of()))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldRemoveShortNames() {
        assertThat(ListExercises.removeShortNames(names, 5)).containsExactly("Sally", "sally");
        assertThat(names).hasSize(5);
    }

    @Test
    void shouldReplaceNames() {
        assertThat(ListExercises.replaceName(names, "sally", "sue"))
                .containsExactly("joe", "Sally", "pete", "sue", "Paul");
    }
}
