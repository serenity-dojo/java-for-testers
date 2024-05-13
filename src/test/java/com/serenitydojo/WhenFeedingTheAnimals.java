package com.serenitydojo;

import static com.serenitydojo.model.AnimalType.CAT;
import static com.serenitydojo.model.AnimalType.DOG;
import static com.serenitydojo.model.AnimalType.HAMSTER;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatTuna (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(CAT, false);
        Assert.assertEquals("Tuna",food);
    }
    @Test
    public void shouldFeedHamsterCabbage (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(HAMSTER, false);
        Assert.assertEquals("Cabbage",food);
    }

    @Test
    public void shouldFeedDogsFood (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(DOG, false);
        Assert.assertEquals("Dog Food",food);
    }

    @Test
    public void shouldFedPremiumCatsPremiumFood (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(CAT,true);
        Assert.assertEquals("Salmon",food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(DOG, true);
        Assert.assertEquals("Meat", food);

    }

    @Test
    public void shouldFeedPremiumHamstersLettuce() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(HAMSTER, true);
        Assert.assertEquals("Letucce", food);

    }

    @Test
    public void listOfColors () {
        String[] color = {"red","greem","blue"};
        int[] ages = {1,2,3,4};

        String[] moreColors = new String[3];
        moreColors[0] = "yellow";
        moreColors[1] = "purple";
        moreColors[2] = "pink";

        for(int i=0;i<moreColors.length;i++){
            System.out.println(moreColors[i]);
        }

        List<String> myColors = new ArrayList<>();
        myColors.add("red");
        myColors.add("purple");
        myColors.add("blue");
        myColors.add("blue");

        for(String auxColor: myColors){
            System.out.println("Color List: "+auxColor);
        }

        Set<String> myColors1 = new HashSet<>();
        myColors1.add("red");
        myColors1.add("purple");
        myColors1.add("blue");
        myColors1.add("blue");

        for(String auxColor: myColors1){
            System.out.println("Color Set: "+auxColor);
        }
    }
}
