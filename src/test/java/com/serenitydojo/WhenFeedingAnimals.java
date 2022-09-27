package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingAnimals {

    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, false);

        Assert.assertEquals(TUNA, food);
    }

    @Test
    public void shouldFeedHamsterCabbage(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, false);

        Assert.assertEquals(CABBAGE, food);
    }

    @Test
    public void shouldFeedDogsDogFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, false);

        Assert.assertEquals(DOG_FOOD, food);
    }

    @Test
    public void shouldFeedPremiumCatsFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, true);

        Assert.assertEquals(SALMON, food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, true);

        Assert.assertEquals(DELUXE_DOG_FOOD, food);

    }

    @Test
    public void shouldFeedPremiumHamstersLettuce(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, true);

        Assert.assertEquals(LETTUCE, food);
    }
}
