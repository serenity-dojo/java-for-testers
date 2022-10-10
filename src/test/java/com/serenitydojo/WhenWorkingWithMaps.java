package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithMaps {
    @Test
    public void creatingAMap(){
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();

        numberOfBallsByColor.put("red", 3);
        numberOfBallsByColor.put("blue", 5);
        numberOfBallsByColor.put("green", 6);

        Integer numberOfRedBalls = numberOfBallsByColor.get("red");
        System.out.println("There are " + numberOfRedBalls);
    }

    @Test
    public void creatingAMapMoreConcisely(){
        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);

        Map<String, Integer> moreColors = new HashMap<>();
        moreColors.put("yellow", 10);
        moreColors.put("mauve", 0);
        moreColors.putAll(numberOfBallsByColor);

        System.out.println("Number of colors for white balls " + moreColors.getOrDefault("white", 0));

        System.out.println("purple balls are present: " + moreColors.containsKey("purple"));
        System.out.println("purple balls are present: " + moreColors.containsKey("blue"));
        System.out.println("purple balls are present: " + moreColors.containsKey("mauve"));

        moreColors.put("yellow", 20);
        moreColors.put("pink", 15);
        moreColors.replace("red", 22);

        System.out.println("number of red balls " + moreColors.getOrDefault("red", 0));
    }

    @Test
    public void iteratingOverMapKeys(){
        Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);

        System.out.println("Keys = " + numberOfBallsByColor.keySet());

        printMap(numberOfBallsByColor);

        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallsByColor);

        modifiableMap.clear();
        //modifiableMap.remove("red");

        printMap(numberOfBallsByColor);
    }

    private void printMap(Map<String, Integer> numberOfBallsByColor) {
        for (Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
