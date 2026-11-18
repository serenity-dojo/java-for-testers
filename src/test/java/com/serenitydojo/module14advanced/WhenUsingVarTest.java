package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 14.5b: Working with var.
 * <p>
 * The var keyword lets the compiler work out the type of a local variable from the value you give it.
 * Use var for every variable you declare in these tests.
 */
class WhenUsingVarTest {

    @Test
    void varInfersTheTypeFromTheValue() {
        // TODO: declare a variable called count using var, with the value 42
        var count = 42;

        // TODO: declare a variable called message using var, with the value "Hello"
        var message = "Hello";

        assertThat(count).isEqualTo(42);
        assertThat(message).isEqualTo("Hello");
    }

    @Test
    void varMakesLongTypeNamesShorter() {
        // TODO: declare a variable called names using var, as a new ArrayList<String>()
        var names = new ArrayList<String>();
        names.add("Sarah");
        names.add("Joe");

        assertThat(names).containsExactly("Sarah", "Joe");
    }

    @Test
    void varWorksWithMapsAndLoops() {
        // TODO: declare a variable called ages using var, as a new HashMap<String, Integer>()
        var ages = new HashMap<String, Integer>();
        ages.put("Sarah", 30);
        ages.put("Joe", 25);

        var total = 0;
        for (var entry : ages.entrySet()) {
            total += entry.getValue();
        }

        assertThat(total).isEqualTo(55);
    }

    @Test
    void varStillHasAFixedType() {
        var number = 10;

        // number = "ten";  // this would not compile: number is an int

        // TODO: use var to declare a variable called doubled, with the value of number multiplied by 2
        var doubled = number * 2;

        assertThat(doubled).isEqualTo(20);
    }
}
