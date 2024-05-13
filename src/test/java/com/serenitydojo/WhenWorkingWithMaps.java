package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithMaps {
    @Test
    public void creatingAMap() {
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();
        numberOfBallsByColor.put("red",3);
        numberOfBallsByColor.put("green",6);
        numberOfBallsByColor.put("blue",5);

        int numberOfRedBalls = numberOfBallsByColor.get("red");
        System.out.println("There are "+numberOfRedBalls+" red balls");
    }

    @Test
    public void creatingAMapMoreConcisely() {
        Map<String, Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);

        int numberOfRedBalls = numberOfBallsByColor.get("red");
        System.out.println("There are "+numberOfRedBalls+" red balls");
        int numberOfRedBalls1 = numberOfBallsByColor.get("green");
        System.out.println("There are "+numberOfRedBalls1+" green balls");
        int numberOfRedBalls2 = numberOfBallsByColor.get("blue");
        System.out.println("There are "+numberOfRedBalls2+" blue balls");


        Map<String, Integer> moreColors = new HashMap<>();
        moreColors.put("yellow",10);
        moreColors.putAll(numberOfBallsByColor);
        int numberOfRedBalls3 = moreColors.get("yellow");
        System.out.println("There are "+numberOfRedBalls3+" yellow balls");

        // Using Default value
        System.out.println("There are "+moreColors.getOrDefault("white",0)+" white balls");

        // Verify a key
        System.out.println("Purple tennis balls are present "+moreColors.containsKey("purple"));

        // Update a pair key value
        moreColors.put("yellow",20);
        int numberOfRedBalls4 = moreColors.getOrDefault("yellow",0);
        System.out.println("There are "+numberOfRedBalls4+" yellow balls");

        // Replace a pair key value that doesn't exist
        moreColors.replace("purple",15);
        int numberOfRedBalls5 = moreColors.getOrDefault("purple",0);
        System.out.println("There are "+numberOfRedBalls5+" purple balls");
    }

    @Test
    public void iteratingOverMapKey(){
        Map<String, Integer> numberOfBallsByColor = Map.of("red",3,"green",6,"blue",5);
        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallsByColor);

        /*
        System.out.println("Keys = "+numberOfBallsByColor.keySet());

        // Iterate over Map
        for(String key : numberOfBallsByColor.keySet()){
            Integer numberOfTennisBall = numberOfBallsByColor.get(key);
            System.out.println(key+" => "+numberOfTennisBall);
        }*/

        printMap(numberOfBallsByColor);

        modifiableMap.remove("red");
        printMap(modifiableMap);

        modifiableMap.clear();
        printMap(modifiableMap);

    }

    private static void printMap(Map<String, Integer> numberOfBallsByColor) {
        for(Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }
    }
}
