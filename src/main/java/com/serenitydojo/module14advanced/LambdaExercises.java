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
        // TODO: loop through the items and keep those that pass condition.test(item)
        return new ArrayList<>();
    }

    /**
     * Converts each item into something else, using the function.
     */
    public static <T, R> List<R> transform(List<T> items, Function<T, R> converter) {
        // TODO: loop through the items, adding converter.apply(item) to a new list
        return new ArrayList<>();
    }

    /**
     * Performs an action for each item.
     */
    public static void forEachItem(List<String> items, Consumer<String> action) {
        // TODO: call action.accept(item) for each item
    }

    /**
     * Applies the operation to the value, and then applies it again to the result.
     */
    public static int applyTwice(UnaryOperator<Integer> operation, int value) {
        // TODO: apply the operation twice
        return 0;
    }

    /**
     * Returns a new list of the names sorted by their length, shortest first.
     * Names with the same length keep their original order. The original list is not changed.
     * <p>
     * Hint: List.sort() takes a Comparator, which you can write as a lambda: (a, b) -> ...
     */
    public static List<String> sortByLength(List<String> names) {
        // TODO: copy the list, then sort the copy using a lambda comparator
        return new ArrayList<>();
    }
}
