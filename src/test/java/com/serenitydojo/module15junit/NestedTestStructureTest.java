package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 15.7: checks the structure of WhenCheckingOutABasketTest.
 * You should not need to change this test.
 */
class NestedTestStructureTest {

    private final Class<?> testClass = WhenCheckingOutABasketTest.class;

    @Test
    void theTestsShouldBeGroupedIntoAtLeastTwoNestedClasses() {
        assertThat(testClass.getDeclaredClasses())
                .filteredOn(nested -> nested.isAnnotationPresent(Nested.class))
                .hasSizeGreaterThanOrEqualTo(2);
    }

    @Test
    void noTestsShouldBeLeftInTheOuterClass() {
        assertThat(testClass.getDeclaredMethods())
                .noneMatch(method -> method.isAnnotationPresent(Test.class));
    }

    @Test
    void eachNestedClassShouldContainSeveralTests() {
        Arrays.stream(testClass.getDeclaredClasses())
                .filter(nested -> nested.isAnnotationPresent(Nested.class))
                .forEach(nested -> assertThat(testMethodsOf(nested))
                        .as("tests in " + nested.getSimpleName())
                        .hasSizeGreaterThanOrEqualTo(2));
    }

    @Test
    void thereShouldStillBeFiveTests() {
        long total = Arrays.stream(testClass.getDeclaredClasses())
                .filter(nested -> nested.isAnnotationPresent(Nested.class))
                .mapToLong(nested -> testMethodsOf(nested).length)
                .sum()
                + testMethodsOf(testClass).length;

        assertThat(total).isEqualTo(5);
    }

    private static Method[] testMethodsOf(Class<?> type) {
        return Arrays.stream(type.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(Test.class))
                .toArray(Method[]::new);
    }
}
