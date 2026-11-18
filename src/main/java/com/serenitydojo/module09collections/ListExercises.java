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
        List<String> combined = new ArrayList<>(first);
        combined.addAll(second);
        return combined;
    }

    /**
     * Returns a new list with the names sorted alphabetically. The original list is not changed.
     */
    public static List<String> sortedAlphabetically(List<String> names) {
        List<String> sorted = new ArrayList<>(names);
        Collections.sort(sorted);
        return sorted;
    }

    /**
     * Returns the names that start with the prefix, ignoring upper and lower case, in their original order.
     */
    public static List<String> namesStartingWith(List<String> names, String prefix) {
        List<String> matching = new ArrayList<>();
        for (String name : names) {
            if (name.toLowerCase().startsWith(prefix.toLowerCase())) {
                matching.add(name);
            }
        }
        return matching;
    }

    /**
     * Returns the longest name. If several names are equally long, returns the first one.
     *
     * @throws IllegalArgumentException if the list is empty
     */
    public static String longestName(List<String> names) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }
        String longest = names.get(0);
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }

    /**
     * Returns a new list without the names that are shorter than the minimum length.
     */
    public static List<String> removeShortNames(List<String> names, int minimumLength) {
        List<String> result = new ArrayList<>(names);
        result.removeIf(name -> name.length() < minimumLength);
        return result;
    }

    /**
     * Replaces every occurrence of the old name with the new name, returning a new list.
     */
    public static List<String> replaceName(List<String> names, String oldName, String newName) {
        List<String> result = new ArrayList<>(names);
        Collections.replaceAll(result, oldName, newName);
        return result;
    }
}
