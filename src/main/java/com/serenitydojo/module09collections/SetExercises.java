package com.serenitydojo.module09collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Exercise 9.2: Sets.
 */
public class SetExercises {

    /**
     * Returns the distinct words, with duplicates removed, sorted alphabetically.
     */
    public static Set<String> uniqueWords(List<String> words) {
        // TODO: a TreeSet removes duplicates and keeps its elements sorted
        return new HashSet<>();
    }

    /**
     * Returns true if the list contains the same element more than once.
     */
    public static boolean hasDuplicates(List<String> words) {
        // TODO: compare the size of the list with the size of a set made from the same elements
        return false;
    }

    /**
     * Returns the elements that appear in both sets.
     */
    public static Set<String> commonElements(Set<String> first, Set<String> second) {
        // TODO: copy the first set, then keep only the elements that are also in the second (see retainAll())
        return new HashSet<>();
    }
}
