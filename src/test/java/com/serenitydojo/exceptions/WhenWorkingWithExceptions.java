package com.serenitydojo.exceptions;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {

    @Test
    public void shouldShowTheLengthOfAString() {
        StringProcessor stringProcessor = new StringProcessor();

        String result = stringProcessor.showLengthOf("some string");

        assertThat(result).isEqualTo("some string has a length of 11");
    }

    @Test
    public void shouldShowZeroForNullStrings() {

        StringProcessor stringProcessor = new StringProcessor();

        String result = stringProcessor.showLengthOf(null);

        assertThat(result).isEqualTo("null has a length of 0");
    }

    @Test(expected = TestEnvironmentUnavailableException.class)
    public void shouldFindThePort() {
        StringProcessor stringProcessor = new StringProcessor();

        stringProcessor.getPortOf("A:https://www.google.com");
    }
}
