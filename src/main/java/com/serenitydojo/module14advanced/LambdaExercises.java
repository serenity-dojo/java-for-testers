package com.serenitydojo.module14advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Exercise 14.3: Introduction to lambda expressions.
 * <p>
 * These methods take a lambda expression (or method reference) as a parameter.
 * Implement them with ordinary loops - the tests will call them with different lambdas.
 */
public class LambdaExercises {

    /**
     * Returns the items that match the condition, in their original order.
     */
    public static List<String> filter(List<String> items, Predicate<String> condition) {
        List<String> matching = new ArrayList<>();
        for (String item : items) {
            if (condition.test(item)) {
                matching.add(item);
            }
        }
        return matching;
    }

    /**
     * Converts each item into something else, using the function.
     */
    public static <T, R> List<R> transform(List<T> items, Function<T, R> converter) {
        List<R> converted = new ArrayList<>();
        for (T item : items) {
            converted.add(converter.apply(item));
        }
        return converted;
    }

    /**
     * Performs an action for each item.
     */
    public static void forEachItem(List<String> items, Consumer<String> action) {
        for (String item : items) {
            action.accept(item);
        }
    }

    /**
     * Applies the operation to the value, and then applies it again to the result.
     */
    public static int applyTwice(UnaryOperator<Integer> operation, int value) {
        return operation.apply(operation.apply(value));
    }

    /**
     * Returns a new list of the names sorted by their length, shortest first.
     * Names with the same length keep their original order. The original list is not changed.
     * <p>
     * Hint: List.sort() takes a Comparator, which you can write as a lambda: (a, b) -> ...
     */
    public static List<String> sortByLength(List<String> names) {
        List<String> sorted = new ArrayList<>(names);
        sorted.sort((first, second) -> Integer.compare(first.length(), second.length()));
        return sorted;
    }
}
