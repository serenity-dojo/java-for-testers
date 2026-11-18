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
//@@ solution
        List<String> combined = new ArrayList<>(first);
        combined.addAll(second);
        return combined;
//@@ starter
        // TODO: create a new ArrayList and add all the elements of both lists
        return new ArrayList<>();
//@@ end
    }

    /**
     * Returns a new list with the names sorted alphabetically. The original list is not changed.
     */
    public static List<String> sortedAlphabetically(List<String> names) {
//@@ solution
        List<String> sorted = new ArrayList<>(names);
        Collections.sort(sorted);
        return sorted;
//@@ starter
        // TODO: copy the list, then sort the copy (see Collections.sort())
        return new ArrayList<>();
//@@ end
    }

    /**
     * Returns the names that start with the prefix, ignoring upper and lower case, in their original order.
     */
    public static List<String> namesStartingWith(List<String> names, String prefix) {
//@@ solution
        List<String> matching = new ArrayList<>();
        for (String name : names) {
            if (name.toLowerCase().startsWith(prefix.toLowerCase())) {
                matching.add(name);
            }
        }
        return matching;
//@@ starter
        // TODO: loop through the names and keep the ones that match
        return new ArrayList<>();
//@@ end
    }

    /**
     * Returns the longest name. If several names are equally long, returns the first one.
     *
     * @throws IllegalArgumentException if the list is empty
     */
    public static String longestName(List<String> names) {
//@@ solution
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
//@@ starter
        // TODO: find the longest name, and throw an IllegalArgumentException for an empty list
        return "";
//@@ end
    }

    /**
     * Returns a new list without the names that are shorter than the minimum length.
     */
    public static List<String> removeShortNames(List<String> names, int minimumLength) {
//@@ solution
        List<String> result = new ArrayList<>(names);
        result.removeIf(name -> name.length() < minimumLength);
        return result;
//@@ starter
        // TODO: copy the list, then remove the short names
        return new ArrayList<>();
//@@ end
    }

    /**
     * Replaces every occurrence of the old name with the new name, returning a new list.
     */
    public static List<String> replaceName(List<String> names, String oldName, String newName) {
//@@ solution
        List<String> result = new ArrayList<>(names);
        Collections.replaceAll(result, oldName, newName);
        return result;
//@@ starter
        // TODO: copy the list, then replace the name (see Collections.replaceAll() or List.set())
        return new ArrayList<>();
//@@ end
    }
}
