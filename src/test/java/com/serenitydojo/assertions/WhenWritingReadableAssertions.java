package com.serenitydojo.assertions;

import org.assertj.core.data.Percentage;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.*;

public class WhenWritingReadableAssertions {

    @Test
    public void whenTwoNumbersAreEqual() {
        int a = 5;
        int b = 10;
        int c = 20;

        int sum = a + b + c;
        assertThat(sum).isEqualTo(35);
    }

    @Test
    public void whenANumberIsGreaterThanAnother() {
        int a = 5;
        int b = 10;
        int c = 20;
        int sum = a + b + c;
        assertThat(sum).isGreaterThan(30);
    }

    @Test
    public void whenANumberIsInACertainInterval() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        assertThat(sum).isBetween(10,20);
    }

    @Test
    public void whenANumberIsCloseToAnotherValue() {
        double roughlyOneHundred = 99;
        assertThat(roughlyOneHundred).isCloseTo(100, withPercentage(10));
    }

    @Test
    public void whenAStringIsEqualToAnother() {
        String color = "red";
        assertThat(color).contains("red");
    }

    @Test
    public void whenAStringIsEqualIgnoringCase() {
        String color = "RED";
        assertThat(color).containsIgnoringCase("red");
    }

    @Test
    public void whenAStringContainsOnlyDigits() {
        String licenseNumber = "12345";
        assertThat(licenseNumber).containsOnlyDigits();
    }

    @Test
    public void whenAStringStartsWithAValue() {
        String colors = "red,green,blue";
        assertThat(colors).startsWith("red");
    }

    @Test
    public void whenAStringEndsWithAValue() {
        String colors = "red,green,blue";
        assertThat(colors).endsWith("blue");
    }


    @Test
    public void whenAListContainsAValue() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).contains("red");
    }

    @Test
    public void whenAListContainsASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).contains("red","blue");
    }

    @Test
    public void whenAListHasASpecificSize() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).hasSize(3);
    }

    @Test
    public void whenAListContainsExactlyASetOfValues() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).containsExactlyInAnyOrder("red","green","blue");
    }

    @Test
    public void whenAListContainsExactlyASetOfValuesInAnyOrder() {
        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).containsExactlyInAnyOrder("red","blue","green");
    }




}
