package com.serenitydojo.module05conventions;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 5.1: checks that OrderSummary follows the standard Java naming conventions.
 * <p>
 * You should not need to change this test - fix the OrderSummary class instead.
 */
class WhenFollowingJavaConventionsTest {

    private static final Class<?> CLASS_UNDER_TEST = OrderSummary.class;

    private static final Pattern PASCAL_CASE = Pattern.compile("[A-Z][a-zA-Z0-9]*");
    private static final Pattern CAMEL_CASE = Pattern.compile("[a-z][a-zA-Z0-9]*");
    private static final Pattern UPPER_SNAKE_CASE = Pattern.compile("[A-Z][A-Z0-9]*(_[A-Z0-9]+)*");
    private static final Pattern BOOLEAN_METHOD = Pattern.compile("(is|has|can)[A-Z][a-zA-Z0-9]*");

    @Test
    void classNamesShouldUsePascalCase() {
        assertThat(CLASS_UNDER_TEST.getSimpleName()).matches(PASCAL_CASE);
    }

    @Test
    void packageNamesShouldBeLowerCase() {
        String packageName = CLASS_UNDER_TEST.getPackageName();

        assertThat(packageName).isEqualTo(packageName.toLowerCase());
    }

    @Test
    void constantsShouldUseUpperSnakeCase() {
        assertThat(declaredFields())
                .filteredOn(field -> Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()))
                .isNotEmpty()
                .extracting(Field::getName)
                .allMatch(UPPER_SNAKE_CASE.asMatchPredicate(), "are UPPER_SNAKE_CASE");
    }

    @Test
    void fieldsShouldUseCamelCase() {
        assertThat(declaredFields())
                .filteredOn(field -> !Modifier.isStatic(field.getModifiers()))
                .extracting(Field::getName)
                .allMatch(CAMEL_CASE.asMatchPredicate(), "are camelCase");
    }

    @Test
    void fieldsShouldBePrivate() {
        assertThat(declaredFields())
                .filteredOn(field -> !Modifier.isStatic(field.getModifiers()))
                .allMatch(field -> Modifier.isPrivate(field.getModifiers()), "are private");
    }

    @Test
    void methodsShouldUseCamelCase() {
        assertThat(declaredMethods())
                .extracting(Method::getName)
                .allMatch(CAMEL_CASE.asMatchPredicate(), "are camelCase");
    }

    @Test
    void methodsReturningABooleanShouldStartWithIsHasOrCan() {
        assertThat(declaredMethods())
                .filteredOn(method -> method.getReturnType() == boolean.class)
                .isNotEmpty()
                .extracting(Method::getName)
                .allMatch(BOOLEAN_METHOD.asMatchPredicate(), "start with is, has or can");
    }

    private static Field[] declaredFields() {
        return Arrays.stream(CLASS_UNDER_TEST.getDeclaredFields())
                .filter(field -> !field.isSynthetic())
                .toArray(Field[]::new);
    }

    private static Method[] declaredMethods() {
        return Arrays.stream(CLASS_UNDER_TEST.getDeclaredMethods())
                .filter(method -> !method.isSynthetic())
                .toArray(Method[]::new);
    }
}
