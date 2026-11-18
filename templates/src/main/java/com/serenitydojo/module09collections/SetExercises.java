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
//@@ solution
        return new TreeSet<>(words);
//@@ starter
        // TODO: a TreeSet removes duplicates and keeps its elements sorted
        return new HashSet<>();
//@@ end
    }

    /**
     * Returns true if the list contains the same element more than once.
     */
    public static boolean hasDuplicates(List<String> words) {
//@@ solution
        return new HashSet<>(words).size() < words.size();
//@@ starter
        // TODO: compare the size of the list with the size of a set made from the same elements
        return false;
//@@ end
    }

    /**
     * Returns the elements that appear in both sets.
     */
    public static Set<String> commonElements(Set<String> first, Set<String> second) {
//@@ solution
        Set<String> common = new HashSet<>(first);
        common.retainAll(second);
        return common;
//@@ starter
        // TODO: copy the first set, then keep only the elements that are also in the second (see retainAll())
        return new HashSet<>();
//@@ end
    }
}
