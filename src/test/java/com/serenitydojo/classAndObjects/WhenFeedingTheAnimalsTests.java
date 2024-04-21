package com.serenitydojo.classAndObjects;
import static com.serenitydojo.model.AnimalTypeEnum.CAT;
import static com.serenitydojo.model.AnimalTypeEnum.DOG;
import static com.serenitydojo.model.AnimalTypeEnum.HAMSTER;
import static com.serenitydojo.model.FoodTypeEnum.CABBAGE;
import static com.serenitydojo.model.FoodTypeEnum.DELUXE_DOG_FOOD;
import static com.serenitydojo.model.FoodTypeEnum.DOG_FOOD;
import static com.serenitydojo.model.FoodTypeEnum.LETTUCE;
import static com.serenitydojo.model.FoodTypeEnum.SALMON;
import static com.serenitydojo.model.FoodTypeEnum.TUNA;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.serenitydojo.model.FeederEntity;

public class WhenFeedingTheAnimalsTests {

	@Test
	public void shouldFeedCatsTuna() {
	FeederEntity feeder = new FeederEntity();
	
	Assert.assertEquals(TUNA,feeder.feeds(CAT, false));
	System.out.println("TC-01 - shouldFeedCatsTuna() - Executed successfully.");
	}

	
	@Test
	public void shouldFeedHamstersCabbage() {
	FeederEntity feeder = new FeederEntity();
	
	Assert.assertEquals(CABBAGE, feeder.feeds(HAMSTER, false));
	System.out.println("TC-02 - shouldFeedHamstersCabbage() - Executed successfully.");
	}

	
	@Test
	public void shouldFeedDogsDogFood() {
	FeederEntity feeder = new FeederEntity();
	
	Assert.assertEquals(DOG_FOOD, feeder.feeds(DOG, false));
	System.out.println("TC-03 - shouldFeedDogsDogFood() - Executed successfully.");
	}

	
	@Test
	public void shouldFeedPremiumCatsPremiumFood() {
	FeederEntity feeder = new FeederEntity();
	
	Assert.assertEquals(SALMON,feeder.feeds(CAT, true));
	System.out.println("TC-04 - shouldFeedPremiumCatsPremiumFood() - Executed successfully.");
	}
	
	
	@Test
	public void shouldFeedPremiumDogsDeluxeDogFood() {
	FeederEntity feeder = new FeederEntity();
	
	Assert.assertEquals(DELUXE_DOG_FOOD,feeder.feeds(DOG, true));
	System.out.println("TC-05 - shouldFeedPremiumDogsDeluxeDogFood() - Executed successfully.");
	}
	
	
	@Test
	public void shouldFeedPremiumHampstersLettuce() {
	FeederEntity feeder = new FeederEntity();
	
    Assert.assertEquals(LETTUCE,feeder.feeds(HAMSTER, true));
	System.out.println("TC-06 - shouldFeedPremiumHampstersLettuce() - Executed successfully.");
	}

}