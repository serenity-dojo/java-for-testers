package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 15.8: Data driven tests in JUnit 6.
 * <p>
 * Replace each of these tests with a parameterized test, so that the same test runs once for each value.
 */
class WhenValidatingPasswordsTest {

    private final PasswordValidator validator = new PasswordValidator();

    @Test
    void strongPasswordsShouldBeAccepted() {
        // TODO: use @ParameterizedTest and @ValueSource(strings = {...}) to check that
        //       "Passw0rd!", "C0mpl3x#Pass" and "Abcdef1$" are all strong passwords
        fail("TODO: write this parameterized test");
    }

    @Test
    void weakPasswordsShouldBeRejected() {
        // TODO: use @ParameterizedTest and @ValueSource to check that
        //       "short1A", "alllowercase1!", "ALLUPPERCASE1!", "NoDigitsHere!" and "NoSpecial123" are all weak
        fail("TODO: write this parameterized test");
    }

    @Test
    void missingPasswordsShouldBeRejected() {
        // TODO: use @ParameterizedTest and @NullAndEmptySource to check that null and "" are weak
        fail("TODO: write this parameterized test");
    }

    @Test
    void passwordsShouldBeCheckedAgainstTheRules() {
        // TODO: use @ParameterizedTest and @CsvSource to check several passwords and whether each is strong,
        //       for example "Passw0rd!, true" and "password, false"
        fail("TODO: write this parameterized test");
    }

    @Test
    void weakPasswordsShouldBeRejectedForTheRightReason() {
        // TODO: use @ParameterizedTest and @MethodSource to provide pairs of (reason, password),
        //       for example ("too short", "Ab1!") and ("no digits", "Password!!").
        //       Use a static method returning a Stream<Arguments> to provide the data
        fail("TODO: write this parameterized test");
    }
}
