package com.serenitydojo;
import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(Cat,false);
        Assert.assertEquals(Tuna, food);

    }
    @Test
    public void shouldFeedHamsterCabbage(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(Hamster,false);
        Assert.assertEquals(Cabbage, food);

    }

    @Test
    public void shouldFeedDogsDogFood(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(Dog, false);
        Assert.assertEquals(Dogs_Food, food);

    }
    @Test
    public void shouldFeedPremiumCatsPremiumFood(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(Cat,true);
        Assert.assertEquals(Salmon, food);

    }
    @Test
    public void shouldFeedPremiumDogsPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(Dog, true);
        Assert.assertEquals(Deluxe_Dog_Food, food);
    }
    @Test
    public void shouldFeedPremiumHamsterPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(Hamster, true);
        Assert.assertEquals(Lettuce, food);
    }
}

