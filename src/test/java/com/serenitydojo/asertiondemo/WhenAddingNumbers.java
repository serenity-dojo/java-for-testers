package com.serenitydojo.asertiondemo;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

public class WhenAddingNumbers {

    @Test
    public void shouldAddTwoIntegerCorrectly(){
        int a = 1;
        int b = 2;
        String color = "red";
        String otherColor = "Red";
        String colors = "red, green, blue";
        List<String> colors1 = Arrays.asList("red", "green", "blue");

        int sum = a+b;

        //Assert.assertEquals(4,sum);
        //assertThat(sum).isEqualTo(4);
        assertThat(sum).isCloseTo(4, withPercentage((50)));

        // Assertion in String objects
        assertThat(color).isEqualToIgnoringCase(otherColor);

        // Assertion in String objects
        assertThat(colors).contains("green");
        assertThat(colors).startsWith("red");

        // Using regular expressions
        assertThat(colors).containsPattern("[g|G]reen");

        // Assertions over list
        assertThat(colors1).hasSize(3);
        assertThat(colors1).contains("green");
        assertThat(colors1).containsExactly("red","green","blue");
        assertThat(colors1).containsExactlyInAnyOrder("green","red","blue");
        assertThat(colors1).doesNotContain("yellow");
    }
}
