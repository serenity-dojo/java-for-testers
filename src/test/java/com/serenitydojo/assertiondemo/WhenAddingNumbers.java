package com.serenitydojo.assertiondemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenAddingNumbers {
    @Test
    public void shouldAddTwoIntegersCorrectly(){
//        int a =1;
//        int b =2;
//
//        int sum = a+b;
//        assertThat(sum).isEqualTo(4);

        String color = "red";
        String anotherColor = "Red";

        assertThat(color).isEqualToIgnoringCase(anotherColor);

        List<String> colors = Arrays.asList("red","green","blue");
        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("red","green","blue");
        assertThat(colors).containsExactlyInAnyOrder("blue","green","red");



    }

}
