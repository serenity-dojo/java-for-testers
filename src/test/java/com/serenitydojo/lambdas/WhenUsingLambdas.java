package com.serenitydojo.lambdas;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class WhenUsingLambdas {

    @Test
    public void printingOutColors (){
        List<String> colors = Arrays.asList("red", "green", "blue");

        // Using Lambda Expressions
        /*
        colors.forEach(
            color -> printColorsOf(color)
        );

        colors.forEach(
                color -> System.out.println("COLOR "+color)
        );

        colors.forEach(
                WhenUsingLambdas::printColorsOf
        );


        for (String color : colors) {
            printColorsOf(color);
        }*/

        colors.forEach(
                color -> {
                    if (color.equals("red"))
                        System.out.println("RED!");
                    else
                        System.out.println("COLOR "+color);
                }
        );


    }

    @Test
    public void filteringColors (){
        List<String> colors = Arrays.asList("red", "green", "blue","grey", "berry","grey-blue","gritty white");

        colors.stream()
                .filter(color -> color.startsWith("g"))
                .forEach(
                        color -> System.out.println("COLOR "+color)
                );

        List<String> filteredColors = colors.stream()
                .filter(color -> color.startsWith("b"))
                .collect(Collectors.toList());
        System.out.println(filteredColors);

        List<String> filteredColorsOrder = colors.stream()
                .filter(color -> color.startsWith("g"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredColorsOrder);

        List<String> filteredColorsUpper = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(color -> color.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredColorsUpper);

        List<Integer> filteredColorsLength = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(color -> color.length())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredColorsLength);

        //Using static sintax in map function
        List<Integer> filteredColorsStatic = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(String::length)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredColorsStatic);

        Optional<Integer> minLength = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(String::length)
                .sorted()
                .findFirst();
        System.out.println(minLength);

        Optional<Integer> minLength1 = colors.stream()
                .filter(color -> color.startsWith("z"))
                .map(String::length)
                .sorted()
                .findFirst();
        System.out.println(minLength1);

        // Return an exception because the array is empty
        /*Optional<Integer> minLength2 = colors.stream()
                .filter(color -> color.startsWith("z"))
                .map(String::length)
                .sorted()
                .findFirst();
        System.out.println(minLength2.get());*/

        // Using orElseGet Operator to return zero (0)
        Optional<Integer> minLength3 = colors.stream()
                .filter(color -> color.startsWith("z"))
                .map(String::length)
                .sorted()
                .findFirst();
        System.out.println(minLength3.orElseGet(()->0));

        // Using orElseGet Operator to return zero (0)
        Integer minLength4 = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(String::length)
                .sorted()
                .findFirst()
                .orElse(0);
        System.out.println(minLength4);

        String firstColor = colors.stream()
                .filter(color -> color.startsWith("g"))
                .sorted()
                .findFirst()
                .orElse("Unknown");
        System.out.println(firstColor);

        String firstColor1 = colors.stream()
                .filter(color -> color.startsWith("z"))
                .sorted()
                .findFirst()
                .orElse("Unknown");
        System.out.println(firstColor1);



    }

    public static void printColorsOf(String color) {
        System.out.println("COLOR "+color);
    }
}
