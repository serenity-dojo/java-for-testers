package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 15.10: checks that the tests in WhenUsingTagsTest are tagged.
 * You should not need to change this test.
 */
class TagsAreAppliedTest {

    private final List<Method> testMethods = Arrays.stream(WhenUsingTagsTest.class.getDeclaredMethods())
            .filter(method -> method.isAnnotationPresent(Test.class))
            .toList();

    @Test
    void everyTestShouldHaveATag() {
        assertThat(testMethods).allMatch(method -> method.isAnnotationPresent(Tag.class), "have a @Tag");
    }

    @Test
    void theTwoQuickTestsShouldBeTaggedAsSmoke() {
        assertThat(testMethodsTaggedWith("smoke"))
                .containsExactlyInAnyOrder("aNewBasketShouldBeEmpty", "anItemCanBeAddedToTheBasket");
    }

    @Test
    void theTwoLongRunningTestsShouldBeTaggedAsSlow() {
        assertThat(testMethodsTaggedWith("slow"))
                .containsExactlyInAnyOrder(
                        "aVeryLargeBasketShouldBeCalculatedCorrectly",
                        "aBasketShouldSurviveBeingFilledAndEmptiedRepeatedly");
    }

    private List<String> testMethodsTaggedWith(String tag) {
        return testMethods.stream()
                .filter(method -> Arrays.stream(method.getAnnotationsByType(Tag.class))
                        .anyMatch(annotation -> annotation.value().equals(tag)))
                .map(Method::getName)
                .toList();
    }
}
