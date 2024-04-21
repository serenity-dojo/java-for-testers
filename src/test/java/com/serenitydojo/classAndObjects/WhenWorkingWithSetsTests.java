package com.serenitydojo.classAndObjects;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.Set;
import org.testng.annotations.Test;

/**
 * Exercises with Sets
 * 
 */
public class WhenWorkingWithSetsTests {
	
	
	/**
	 * 
	 * We can create a set and add values to the set - TODO: Create a new HashSet
	 * and add the values "red", "green", and "blue".
	 * 
	 */
    @Test
    public void creatingANewSet() {
    Set<String> colors = null;
    colors = new HashSet<>();
    colors.add("red");
    colors.add("green");
    colors.add("blue");

    assertThat(colors).contains("red", "green", "blue");
    System.out.println("TC-01 - creatingANewSet() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can create a set containing a specified list of values - TODO: Create a
	 * set of Strings containing the values "red", "green" and "blue".Using the
	 * Set.of() method.
	 * 
	 */
	@Test
    public void creatingASetOfValues() {
    Set<String> colors = null;
    colors = Set.of("red","green","blue");

    assertThat(colors).contains("red", "green", "blue");
    System.out.println("TC-02 - creatingASetOfValues() - Executed successfully.");
    }

    
	/**
	 * 
	 * A Set cannot contain duplicates - TODO: Read the following code, and assign
	 * the correct value to expectedSize to make the test pass.
	 * 
	 */
	@Test
	public void addAValueTwice() {
    Set<String>colors = new HashSet<>(Set.of("red", "green", "blue"));
    colors.add("red");
    colors.add("yellow");
    colors.add("red");
    int expectedSize = 4;

    assertThat(colors.size()).isEqualTo(expectedSize);
    System.out.println("TC-03 - addAValueTwice() - Executed successfully.");
    }

    
	/**
	 * 
	 * We can check whether a set is empty - TODO: Change this code so that it
	 * correctly determines whether the set is empty. TODO: Change this code so that
	 * it correctly determines whether the set now empty or not.
	 * 
	 */
	@Test
    public void canCheckIfEmpty() {
    Set<String> colors = new HashSet<>();
    Boolean startedEmpty = colors.isEmpty();
    colors.add("red");
    colors.add("green");
    colors.add("blue");
    Boolean endedUpEmpty = colors.isEmpty();

    assertThat(startedEmpty).isTrue();
    assertThat(endedUpEmpty).isFalse();
    System.out.println("TC-04 - canCheckIfEmpty() - Executed successfully.");
    }
    

}