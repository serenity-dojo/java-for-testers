package com.serenitydojo.maps;
import static com.serenitydojo.model.FoodTypeEnum.DELUXE_DOG_FOOD;
import static com.serenitydojo.model.FoodTypeEnum.LETTUCE;
import static com.serenitydojo.model.FoodTypeEnum.TUNA;
import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.serenitydojo.model.FoodTypeEnum;

/**
 * Exercises with Maps - When working with Maps in Java
 * - maps let you associate a value with some other value
 * - maps can work with different types, e.g. enums to strings
 * - you can list all the keys in a map
 * - you can list all the values in a map
 * 
 */

public class WhenWorkingWithMapsTests {

	/**
	 * 
	 * Maps let you associate a value with some other value.TODO: Create a new map
	 * and add the following associations: UK -> London France -> Paris Germany ->
	 * Berlin
	 * 
	 */
	@Test
	public void creatingANewMapsWithCapitalCities() {
    Map<String, String> countryCapitals = new HashMap<>();
    countryCapitals.put("UK","London");
    countryCapitals.put("France","Paris");
    countryCapitals.put("Germany","Berlin");
    
    Assert.assertEquals(countryCapitals.get("UK"),"London");
    Assert.assertEquals(countryCapitals.get("France"),"Paris");
    Assert.assertEquals(countryCapitals.get("Germany"),"Berlin");
    System.out.println("\nTC-01 - creatingANewMapsWithCapitalCities() - Executed successfully.");
    }

    
	/**
	 * 
	 * maps can work with different types, e.g. enums to strings.TODO: Create a new
	 * map and add the following associations: "cat" -> TUNA "dog" ->
	 * DELUXE_DOG_FOOD "hamster" -> LETTUCE
	 * 
	 */
	@Test
    public void mapWithDifferentTypes() {
    Map<String, FoodTypeEnum> favoriteFood = new HashMap<>();
    favoriteFood.put("cat",TUNA);
    favoriteFood.put("dog",DELUXE_DOG_FOOD);
    favoriteFood.put("hamster",LETTUCE);
    
    Assert.assertEquals(favoriteFood.get("cat"),TUNA);
    Assert.assertEquals(favoriteFood.get("dog"),DELUXE_DOG_FOOD);
    Assert.assertEquals(favoriteFood.get("hamster"),LETTUCE);
    System.out.println("\nTC-02 - mapWithDifferentTypes() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can create a map more easily with the Map.of() method.TODO: Create a new
	 * map and add the following associations using Map.of(). "cat" -> TUNA "dog" ->
	 * DELUXE_DOG_FOOD "hamster" -> LETTUCE
	 * 
	 */
	@Test
    public void usingMapOf() {
    Map<String, FoodTypeEnum> favoriteFood = Map.of("cat",TUNA,"dog",DELUXE_DOG_FOOD,"hamster",LETTUCE);
    
    Assert.assertEquals(favoriteFood.get("cat"),TUNA);
    Assert.assertEquals(favoriteFood.get("dog"),DELUXE_DOG_FOOD);
    Assert.assertEquals(favoriteFood.get("hamster"),LETTUCE);
    System.out.println("\nTC-03 - usingMapOf() - Executed successfully.");
    }


	/**
	 * 
	 * We can check that a map contains a specified key - TODO: Check that the map
	 * contains a key of "dog"
	 * 
	 */
	@Test
    public void containsKey() {
    Map<String, FoodTypeEnum> favoriteFood = Map.of("cat", TUNA,"dog", DELUXE_DOG_FOOD,"hamster", LETTUCE);
    boolean containsDog = favoriteFood.containsKey("dog");
    
    Assert.assertTrue(containsDog);
    System.out.println("\nTC-04 - containsKey() - Executed successfully.");
    }


	/**
	 * 
	 * We can check that a map contains a specified value - TODO: Check that the map
	 * contains a value of TUNA.
	 * 
	 */
	@Test
    public void containsValue() {
    Map<String, FoodTypeEnum> favoriteFood = Map.of("cat", TUNA,"dog", DELUXE_DOG_FOOD,"hamster", LETTUCE);
    boolean containsTuna = favoriteFood.containsValue(TUNA);

    Assert.assertTrue(containsTuna);
    System.out.println("\nTC-05 - containsValue() - Executed successfully.");
    }
    
    
	@Test
	public void creatingAMap() {
	Map<String, Integer> numberOfBallsByColor = new HashMap<>();
	numberOfBallsByColor.put("red", 3);
	numberOfBallsByColor.put("green", 6);
	numberOfBallsByColor.put("blue", 5);
	
	Integer numberOfRedBalls = numberOfBallsByColor.get("red");
	System.out.println("There are " + numberOfRedBalls + " red balls");
    System.out.println("\nTC-06 - creatingAMap() - Executed successfully.");
	}

	
	@Test
	public void creatingAMapMoreConcisely() {
	//Unmodifyable maps
	Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);
	//Modifyable Maps
	Map<String, Integer> moreColors = new HashMap<>();
	moreColors.put("yellow", 10);
	moreColors.put("mauve", 0);
	moreColors.putAll(numberOfBallsByColor);
	moreColors.put("yellow", 20);
	moreColors.replace("pink", 15);
	
	System.out.println("Number of pink tennis balls " + moreColors.getOrDefault("pink", 0));
	System.out.println("\nTC-07 - creatingAMapMoreConcisely() - Executed successfully.");
	}

	
	@Test
	public void iteratingOverMapKeys() {
	Map<String, Integer> numberOfBallsByColor = Map.of("red", 3, "green", 6, "blue", 5);
	System.out.println("Keys = " + numberOfBallsByColor.keySet());
	printMap(numberOfBallsByColor);
	
	Map<String, Integer> modifiableMap = new HashMap<>();
	modifiableMap.putAll(numberOfBallsByColor);
	modifiableMap.clear();
	
	printMap(modifiableMap);
	System.out.println("\nTC-08 - iteratingOverMapKeys() - Executed successfully.");
	}

	
	
	/**
	 * This method is used to iterate over the values of Set of entrys and to print
	 * them.
	 * 
	 * @param numberOfBallsByColor
	 * @return void
	 * 
	 */
	private void printMap(Map<String, Integer> numberOfBallsByColor) {
		for (Map.Entry<String, Integer> entry : numberOfBallsByColor.entrySet()) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		}
	}

}