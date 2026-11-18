package com.serenitydojo.module15junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 15.6: checks the naming of the tests in WhenNamingTestsTest.
 * You should not need to change this test.
 */
class TestNamingStandardsTest {

    private static final Pattern MEANINGLESS_NAME = Pattern.compile("(?i)(test|check|method)\\d*");

    private final List<Method> testMethods = Arrays.stream(WhenNamingTestsTest.class.getDeclaredMethods())
            .filter(method -> method.isAnnotationPresent(Test.class))
            .toList();

    @Test
    void thereShouldBeSomeTestsToCheck() {
        assertThat(testMethods).hasSizeGreaterThanOrEqualTo(3);
    }

    @Test
    void testMethodNamesShouldDescribeTheBehaviour() {
        assertThat(testMethods)
                .extracting(Method::getName)
                .noneMatch(name -> MEANINGLESS_NAME.matcher(name).matches())
                .allMatch(name -> name.length() >= 8, "have a descriptive name of at least 8 characters");
    }

    @Test
    void everyTestShouldHaveADisplayName() {
        assertThat(testMethods)
                .allMatch(method -> method.isAnnotationPresent(DisplayName.class), "have a @DisplayName");
    }

    @Test
    void displayNamesShouldBeReadableSentences() {
        assertThat(testMethods)
                .map(method -> method.getAnnotation(DisplayName.class))
                .doesNotContainNull()
                .extracting(DisplayName::value)
                .allMatch(text -> text.contains(" "), "are made of several words");
    }
}
