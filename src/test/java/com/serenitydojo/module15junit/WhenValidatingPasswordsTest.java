package com.serenitydojo.module15junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

/**
 * Exercise 15.8: Data driven tests in JUnit 6.
 * <p>
 * Replace each of these tests with a parameterized test, so that the same test runs once for each value.
 */
class WhenValidatingPasswordsTest {

    private final PasswordValidator validator = new PasswordValidator();

    @ParameterizedTest(name = "\"{0}\" is a strong password")
    @ValueSource(strings = {"Passw0rd!", "C0mpl3x#Pass", "Abcdef1$"})
    void strongPasswordsShouldBeAccepted(String password) {
        assertThat(validator.isStrong(password)).isTrue();
    }

    @ParameterizedTest(name = "\"{0}\" is not a strong password")
    @ValueSource(strings = {"short1A", "alllowercase1!", "ALLUPPERCASE1!", "NoDigitsHere!", "NoSpecial123", "Sh0rt!"})
    void weakPasswordsShouldBeRejected(String password) {
        assertThat(validator.isStrong(password)).isFalse();
    }

    @ParameterizedTest
    @NullAndEmptySource
    void missingPasswordsShouldBeRejected(String password) {
        assertThat(validator.isStrong(password)).isFalse();
    }

    @ParameterizedTest(name = "\"{0}\" -> strong? {1}")
    @CsvSource({
            "Passw0rd!, true",
            "password, false",
            "PASSWORD1!, false",
            "Pass1!, false"
    })
    void passwordsShouldBeCheckedAgainstTheRules(String password, boolean expected) {
        assertThat(validator.isStrong(password)).isEqualTo(expected);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("passwordsAndTheReasonTheyAreWeak")
    void weakPasswordsShouldBeRejectedForTheRightReason(String reason, String password) {
        assertThat(validator.isStrong(password)).as(reason).isFalse();
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> passwordsAndTheReasonTheyAreWeak() {
        return Stream.of(
                arguments("too short", "Ab1!"),
                arguments("no upper case letters", "password1!"),
                arguments("no lower case letters", "PASSWORD1!"),
                arguments("no digits", "Password!!"),
                arguments("no special characters", "Password12")
        );
    }
}
