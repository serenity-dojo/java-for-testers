package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 14.1: Lambda expressions deep dive.
 * <p>
 * Each test declares a functional interface variable. Replace the placeholder lambda
 * so that the assertions pass.
 */
class WhenUsingLambdasTest {

    @Test
    void aFunctionConvertsOneValueIntoAnother() {
        // TODO: write a lambda that doubles the number: x -> ...
//@@ solution
        Function<Integer, Integer> doubler = x -> x * 2;
//@@ starter
        Function<Integer, Integer> doubler = x -> x;
//@@ end

        assertThat(doubler.apply(21)).isEqualTo(42);
    }

    @Test
    void aBiFunctionTakesTwoValues() {
        // TODO: write a lambda that adds the two numbers: (a, b) -> ...
//@@ solution
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
//@@ starter
        BiFunction<Integer, Integer, Integer> adder = (a, b) -> 0;
//@@ end

        assertThat(adder.apply(3, 4)).isEqualTo(7);
    }

    @Test
    void aPredicateAnswersYesOrNo() {
        // TODO: write a lambda that is true for strings with more than 5 characters
//@@ solution
        Predicate<String> isLong = text -> text.length() > 5;
//@@ starter
        Predicate<String> isLong = text -> false;
//@@ end

        assertThat(isLong.test("elephant")).isTrue();
        assertThat(isLong.test("cat")).isFalse();
    }

    @Test
    void aSupplierProvidesAValue() {
        // TODO: write a lambda with no parameters that returns "Hello"
//@@ solution
        Supplier<String> greeting = () -> "Hello";
//@@ starter
        Supplier<String> greeting = () -> "";
//@@ end

        assertThat(greeting.get()).isEqualTo("Hello");
    }

    @Test
    void aConsumerDoesSomethingWithAValue() {
        List<String> collected = new ArrayList<>();

        // TODO: write a lambda that adds the text to the collected list
//@@ solution
        Consumer<String> collector = text -> collected.add(text);
//@@ starter
        Consumer<String> collector = text -> { };
//@@ end

        collector.accept("red");
        collector.accept("green");

        assertThat(collected).containsExactly("red", "green");
    }

    @Test
    void methodReferencesAreAShortcutForSimpleLambdas() {
        // TODO: replace the lambda with a method reference to String::length
//@@ solution
        Function<String, Integer> length = String::length;
//@@ starter
        Function<String, Integer> length = text -> 0;
//@@ end

        assertThat(length.apply("lambda")).isEqualTo(6);
    }

    @Test
    void functionsCanBeCombined() {
        Function<Integer, Integer> doubler = x -> x * 2;
        Function<Integer, Integer> addOne = x -> x + 1;

        // TODO: combine the two functions so that the number is doubled first, and then has one added.
        //       Use doubler.andThen(...)
//@@ solution
        Function<Integer, Integer> doubleThenAddOne = doubler.andThen(addOne);
//@@ starter
        Function<Integer, Integer> doubleThenAddOne = x -> x;
//@@ end

        assertThat(doubleThenAddOne.apply(5)).isEqualTo(11);
    }

    @Test
    void predicatesCanBeNegatedAndCombined() {
        Predicate<String> isLong = text -> text.length() > 5;
        Predicate<String> startsWithE = text -> text.startsWith("e");

        // TODO: create a predicate that is true for short strings, using isLong.negate()
//@@ solution
        Predicate<String> isShort = isLong.negate();
//@@ starter
        Predicate<String> isShort = text -> true;
//@@ end

        // TODO: create a predicate that is true for long strings that start with "e", using isLong.and(...)
//@@ solution
        Predicate<String> isLongAndStartsWithE = isLong.and(startsWithE);
//@@ starter
        Predicate<String> isLongAndStartsWithE = text -> true;
//@@ end

        assertThat(isShort.test("cat")).isTrue();
        assertThat(isShort.test("elephant")).isFalse();
        assertThat(isLongAndStartsWithE.test("elephant")).isTrue();
        assertThat(isLongAndStartsWithE.test("giraffe")).isFalse();
        assertThat(isLongAndStartsWithE.test("eel")).isFalse();
    }

    @Test
    void lambdasCanUseVariablesFromTheirSurroundings() {
        int minimumLength = 4;

        // TODO: write a predicate that is true for text at least minimumLength characters long
//@@ solution
        Predicate<String> longEnough = text -> text.length() >= minimumLength;
//@@ starter
        Predicate<String> longEnough = text -> false;
//@@ end

        assertThat(longEnough.test("tree")).isTrue();
        assertThat(longEnough.test("fox")).isFalse();
    }
}
