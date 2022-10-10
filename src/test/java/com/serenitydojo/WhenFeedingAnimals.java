package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingAnimals {

    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, false);

        Assert.assertEquals(TUNA.name(), food);
    }

    @Test
    public void shouldFeedHamsterCabbage(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, false);

        Assert.assertEquals(CABBAGE.name(), food);
    }

    @Test
    public void shouldFeedDogsDogFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, false);

        Assert.assertEquals(DOG_FOOD.name(), food);
    }

    @Test
    public void shouldFeedPremiumCatsFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, true);

        Assert.assertEquals(SALMON.name(), food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, true);

        Assert.assertEquals(DELUXE_DOG_FOOD.name(), food);

    }

    @Test
    public void shouldFeedPremiumHamstersLettuce(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, true);

        Assert.assertEquals(LETTUCE.name(), food);
    }

    @Test
    public void listOfColors(){
        String[] color = {"red", "blue", "green"};
        int[] ages = {3, 6, 8};
        String[] moreColors = new String[4];
        moreColors[0] = "yellow";
        moreColors[1] = "purple";
        moreColors[2] = "pink";

        for(int i = 0; i < 3; i++){
            System.out.println(moreColors[i]);
        }
        //Allow duplicate elements
        /*List<String> myColors = new ArrayList<>();
        myColors.add("brown");
        myColors.add("purple");
        myColors.add("orange");
        myColors.add("purple");*/


        //Doesn´t allow duplicate elements
        Set<String> myColors = new HashSet<>();
        myColors.add("brown");
        myColors.add("purple");
        myColors.add("orange");
        myColors.add("purple");

        for(String someColor : myColors){
            System.out.println("Color: " + someColor);
        }
    }
}
