package com.serenitydojo.classAndObjects;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

/**
 * Exercises with ArrayLists - When working with Lists in Java
 * 
 */
public class WhenWorkingWithListsTests {

	/**
	 * 
	 * We can create a list containing a specified list of values.TODO : Create an
	 * immutable list of Strings containing the values "red", "green" and "blue"
	 * using the Arrays.asList() method.
	 * 
	 */
	@Test
    public void creatingAListOfValues() {
    List<String> colors = null;
    colors = Arrays.asList("red","green","blue");

    assertThat(colors).containsExactly("red", "green", "blue");
    System.out.println("TC-01 - creatingAListOfValues() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can add a value an empty list - TODO: Create a new ArrayList, and add
	 * "red" and "green" this list.
	 * 
	 */
	@Test
    public void addingAValueToAnEmptyList() {
    List<String> colors = null;
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("green");

    assertThat(colors).containsExactly("red", "green");
    System.out.println("TC-02 - addingAValueToAnEmptyList() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can add a value to the end an existing list - TODO: Add "yellow" to the
	 * END of this list.
	 * 
	 */
	@Test
    public void addingAValueToTheEndList() {
    List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
    colors.add("yellow");

    assertThat(colors).containsExactly("red", "green", "blue", "yellow");
    System.out.println("TC-03 - addingAValueToTheEndList() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can add a value to the start an existing list - TODO: Add "yellow" to the
	 * START of this list.
	 * 
	 */
	@Test
    public void addingAValueToTheStartOfAList() {
    List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
    colors.add(0, "yellow");

    assertThat(colors).containsExactly("yellow", "red", "green", "blue");
    System.out.println("TC-04 - addingAValueToTheStartOfAList() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can delete a value from an existing list - TODO: Remote "green" from the
	 * list.
	 * 
	 */
	@Test
    public void deletingAValueInAList() {
    List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
    colors.remove("green");

    assertThat(colors).containsExactly( "red", "blue");
    System.out.println("TC-05 - deletingAValueInAList() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can find the number of elements in a list - TODO: Remote "green" from the
	 * list.
	 * 
	 */
    @Test
    public void findingTheLengthOfAList() {
    List<String> colors = new ArrayList<>(Arrays.asList("red", "green", "blue"));
    int numberOfElements = colors.size();     

    assertThat(numberOfElements).isEqualTo(3);
    System.out.println("TC-06 - findingTheLengthOfAList() - Executed successfully.");
    }
    
}