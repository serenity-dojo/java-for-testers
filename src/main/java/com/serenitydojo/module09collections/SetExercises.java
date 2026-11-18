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
        return new TreeSet<>(words);
    }

    /**
     * Returns true if the list contains the same element more than once.
     */
    public static boolean hasDuplicates(List<String> words) {
        return new HashSet<>(words).size() < words.size();
    }

    /**
     * Returns the elements that appear in both sets.
     */
    public static Set<String> commonElements(Set<String> first, Set<String> second) {
        Set<String> common = new HashSet<>(first);
        common.retainAll(second);
        return common;
    }
}
