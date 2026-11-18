package com.serenitydojo.module09collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercises 9.2 and 9.3: Lists.
 */
public class ListExercises {

    /**
     * Combines two lists into a new list: all the elements of the first list followed by the second.
     * Neither of the original lists is changed.
     */
    public static List<String> combine(List<String> first, List<String> second) {
        // TODO: create a new ArrayList and add all the elements of both lists
        return new ArrayList<>();
    }

    /**
     * Returns a new list with the names sorted alphabetically. The original list is not changed.
     */
    public static List<String> sortedAlphabetically(List<String> names) {
        // TODO: copy the list, then sort the copy (see Collections.sort())
        return new ArrayList<>();
    }

    /**
     * Returns the names that start with the prefix, ignoring upper and lower case, in their original order.
     */
    public static List<String> namesStartingWith(List<String> names, String prefix) {
        // TODO: loop through the names and keep the ones that match
        return new ArrayList<>();
    }

    /**
     * Returns the longest name. If several names are equally long, returns the first one.
     *
     * @throws IllegalArgumentException if the list is empty
     */
    public static String longestName(List<String> names) {
        // TODO: find the longest name, and throw an IllegalArgumentException for an empty list
        return "";
    }

    /**
     * Returns a new list without the names that are shorter than the minimum length.
     */
    public static List<String> removeShortNames(List<String> names, int minimumLength) {
        // TODO: copy the list, then remove the short names
        return new ArrayList<>();
    }

    /**
     * Replaces every occurrence of the old name with the new name, returning a new list.
     */
    public static List<String> replaceName(List<String> names, String oldName, String newName) {
        // TODO: copy the list, then replace the name (see Collections.replaceAll() or List.set())
        return new ArrayList<>();
    }
}
