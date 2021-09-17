package com.serenitydojo;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

public class WhenWOrkingWithMaps {
    @Test
    public void workingwithMaps(){
        Map<String,Integer> numberOfBallsWithColors = new HashMap<>();
        numberOfBallsWithColors.put("red",3);
        numberOfBallsWithColors.put("green",6);
        numberOfBallsWithColors.put("blue",10);

        Integer numberOfRedBalls = numberOfBallsWithColors.get("red");
        System.out.println("number of red balls is " + numberOfRedBalls);
    }
    @Test
    public void creatingAMapConcisely(){
        Map<String,Integer> numberOfBallsWithColors = Map.of("red",3,"green",6,"blue",5);

        Map<String,Integer> moreColors = new HashMap<>();
        moreColors.put("yellow",10);
        moreColors.putAll(numberOfBallsWithColors);

        moreColors.put("yellow",20);
        moreColors.replace("pink",15);
        System.out.println("number of pink balls is " + moreColors.getOrDefault("pink",0));

        //System.out.println("purple colors are presents :" + moreColors.containsKey("purple"));


    }
    @Test
    public void iteratingOverMapKeys(){
        Map<String,Integer> numberOfBallsByColors = Map.of("red",3,"green",6,"blue",5);
        //System.out.println(numberOfBallsByColors.keySet());

        for(String Key : numberOfBallsByColors.keySet()){
            Integer numberOfTennisBalls = numberOfBallsByColors.get(Key);
            System.out.println(numberOfTennisBalls);
        }
        for(Map.Entry<String,Integer> entry : numberOfBallsByColors.entrySet()){
            System.out.println(entry);
        }
        Map<String,Integer> moreBalls = new HashMap<>();
        moreBalls.putAll(numberOfBallsByColors);
        moreBalls.remove("red");
        System.out.println(moreBalls);
        
    }





}
