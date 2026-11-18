package com.serenitydojo.module07conditionals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 7.1: Simple conditional logic.
 */
class WhenUsingSimpleConditionalsTest {

    private final GradeCalculator gradeCalculator = new GradeCalculator();
    private final NumberChecks numberChecks = new NumberChecks();

    @Test
    void highScoresGetAnA() {
        assertThat(gradeCalculator.gradeFor(100)).isEqualTo("A");
        assertThat(gradeCalculator.gradeFor(90)).isEqualTo("A");
    }

    @Test
    void middlingScoresGetBCOrD() {
        assertThat(gradeCalculator.gradeFor(89)).isEqualTo("B");
        assertThat(gradeCalculator.gradeFor(80)).isEqualTo("B");
        assertThat(gradeCalculator.gradeFor(75)).isEqualTo("C");
        assertThat(gradeCalculator.gradeFor(60)).isEqualTo("D");
    }

    @Test
    void lowScoresFail() {
        assertThat(gradeCalculator.gradeFor(59)).isEqualTo("F");
        assertThat(gradeCalculator.gradeFor(0)).isEqualTo("F");
    }

    @Test
    void scoresOutsideTheValidRangeAreInvalid() {
        assertThat(gradeCalculator.gradeFor(-1)).isEqualTo("Invalid");
        assertThat(gradeCalculator.gradeFor(101)).isEqualTo("Invalid");
    }

    @Test
    void evenNumbers() {
        assertThat(numberChecks.isEven(4)).isTrue();
        assertThat(numberChecks.isEven(0)).isTrue();
        assertThat(numberChecks.isEven(7)).isFalse();
        assertThat(numberChecks.isEven(-3)).isFalse();
    }

    @Test
    void findingTheLargestOfThreeNumbers() {
        assertThat(numberChecks.largestOf(1, 2, 3)).isEqualTo(3);
        assertThat(numberChecks.largestOf(9, 2, 3)).isEqualTo(9);
        assertThat(numberChecks.largestOf(1, 8, 3)).isEqualTo(8);
        assertThat(numberChecks.largestOf(-5, -2, -9)).isEqualTo(-2);
    }

    @Test
    void leapYears() {
        assertThat(numberChecks.isLeapYear(2024)).isTrue();
        assertThat(numberChecks.isLeapYear(2000)).isTrue();
        assertThat(numberChecks.isLeapYear(2023)).isFalse();
        assertThat(numberChecks.isLeapYear(1900)).isFalse();
    }

    @Test
    void fizzBuzz() {
        assertThat(numberChecks.fizzBuzz(3)).isEqualTo("Fizz");
        assertThat(numberChecks.fizzBuzz(10)).isEqualTo("Buzz");
        assertThat(numberChecks.fizzBuzz(15)).isEqualTo("FizzBuzz");
        assertThat(numberChecks.fizzBuzz(7)).isEqualTo("7");
    }
}
