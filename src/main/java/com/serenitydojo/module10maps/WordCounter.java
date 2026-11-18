package com.serenitydojo.module10maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 10.4b: Counting words with a map.
 */
public class WordCounter {

    /**
     * Counts how many times each word appears in the text. Words are separated by spaces,
     * and are counted in lower case, so "The" and "the" are the same word.
     * <p>
     * For example, "the cat and The dog" gives {the=2, cat=1, and=1, dog=1}.
     */
    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> counts = new HashMap<>();
        for (String word : text.toLowerCase().split(" ")) {
            if (!word.isBlank()) {
                counts.merge(word, 1, Integer::sum);
            }
        }
        return counts;
    }
}
