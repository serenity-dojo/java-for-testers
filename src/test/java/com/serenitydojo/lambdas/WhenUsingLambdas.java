package com.serenitydojo.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WhenUsingLambdas {

    @Test
    public void printingOutColors() {
        List<String> colors = Arrays.asList("red","green","blue","grey");

        colors.forEach(
                color -> System.out.println(color)
        );
//
//        for(String c : colors) {
//            printColorOf(c);
//        }
    }


    @Test
    public void filteringColors() {
        List<String> colors = Arrays.asList("red","gritty white","grey","green","blue","grey-blue");

        String shortestColor = colors.stream()
                .filter(color -> color.startsWith("g"))
//                .map(String::length)
                .sorted()
                .findFirst()
                .orElse("unknown");


        System.out.println(shortestColor);
    }
}
