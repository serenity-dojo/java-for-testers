package com.serenitydojo.maps;

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

        Integer numberOfRedBalls = numberOfBallsByColor.get("red");
        System.out.println("There are "  + numberOfRedBalls + " red balls");
    }
}
