package com.serenitydojo.strings;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.testng.annotations.Test;

/**
 * This test class covers - Bonus Live Videos : Advanced Java - The 'Var' Keyword
 * implementation from 'java-for-testers-and-test-automation' course of
 * 'Serenity Dojo training and mentoring programme'
 * 
 */

public class WhenManipulatingWithStringsTests {

	/**
	 * Adding strings together
	 * 
	 */
	@Test
	public void addingStringsTogether() {
	var colorA = "red";
	var colorB = "green";
	var colorC = "blue";
	// TODO: turn these values into a comma separated list
	var result = colorA + "," + colorB + "," + colorC;
	
	assertThat(result).isEqualTo("red,green,blue");
	System.out.println("\nTC-01 - addingStringsTogether() - Executed successfully.");
	}

	
	/**
	 * Take two strings (e.g. Duck, Orange) and return them in reverse
	 * order,separated by spaces
	 * 
	 */
	@Test
	public void reverseAPairOfStrings() {
	var result = reverse("Duck", "Orange");

	assertThat(result).isEqualTo("Orange Duck");
	System.out.println("\nTC-02 - reverseAPairOfStrings() - Executed successfully.");
	}

	
	@Test
	public void reverseAListOfStrings() {
	var result = reverseList("Duck", "Orange");
		
	assertThat(result).containsExactly("Orange", "Duck");
	System.out.println("\nTC-03 - reverseAListOfStrings() - Executed successfully.");
	}
	

	/**
	 * Convert a list of words into capitalised form
	 * 
	 */
	@Test
	public void capitaliseWords() {
	var result = capitalise("RED", "green", "BluE");
	
	assertThat(result).isEqualTo("Red Green Blue");
	System.out.println("\nTC-04 - capitaliseWords() - Executed successfully.");
	}


	/**
	 * Replace all of the red shirts by orange shirts
	 * 
	 */
	@Test
	public void colourSwitch() {
	var colouredShirts = List.of("red shirt", "light red shirt", "blue shirt", "green shirt");
	var updatedShirts = new ArrayList<>();
	for (String shirt : colouredShirts) {
	     updatedShirts.add(shirt.replace("red", "orange"));
	}

	assertThat(updatedShirts).containsExactly("orange shirt", "light orange shirt", "blue shirt", "green shirt");
	System.out.println("\nTC-05 - colourSwitch() - Executed successfully.");
	}

	
	/**
	 * Find all the string values that contain red (reguardless of case)
	 * 
	 */
	@Test
	public void colourFilter() {
	var terms = List.of("red", "Light Red", "Orange-red wash", "green", "ruby red", "blue");
	var reds = new ArrayList<>();
	for (var color : terms) {
		if (color.toLowerCase().contains("red")) {
		reds.add(color);
		}
	}
	
	assertThat(reds).containsExactly("red", "Light Red", "Orange-red wash", "ruby red");
	System.out.println("\nTC-06 - colourFilter() - Executed successfully.");
	}

	
	/**
	 * Using the Collections utility class
	 * 
	 */
	@Test
	public void sortingElementsInAList() {
	var terms = List.of("red", "yellow", "orange", "green", "ruby red", "blue");
	var sortedTerms = new ArrayList<>(terms);
	Collections.sort(sortedTerms);
	
	assertThat(sortedTerms).containsExactly("blue", "green", "orange", "red", "ruby red", "yellow");
	System.out.println("\nTC-07 - sortingElementsInAList() - Executed successfully.");
	}

	
	@Test
	public void replacingElements() {
	var terms = List.of("red", "yellow", "orange", "green", "ruby red", "blue");
	var sortedTerms = new ArrayList<>(terms);
	Collections.replaceAll(sortedTerms, "yellow", "beige");

	assertThat(sortedTerms).containsExactly("red", "beige", "orange", "green", "ruby red", "blue");
	System.out.println("\nTC-08 - replacingElements() - Executed successfully.");
	}

	
	@Test
	public void findingMaximumAndMinimums() {
	var numbers = List.of(10, 20, 30, 40, 50);
	var max = Collections.max(numbers);
	var min = Collections.min(numbers);
	
	assertThat(max).isEqualTo(50);
	assertThat(min).isEqualTo(10);
	System.out.println("\nTC-09 - findingMaximumAndMinimums() - Executed successfully.");
	}
	
	
	private String reverse(String... values) {
		var reversedValue = new StringBuilder();
		for (int i = values.length - 1; i >= 0; i--) {
			reversedValue.append(values[i]);
			reversedValue.append(" ");
		}
		return reversedValue.toString().trim();
	}

	private List<String> reverseList(String... values) {
		var reversed = new ArrayList<String>();
		for (int i = values.length - 1; i >= 0; i--) {
			reversed.add(values[i]);
		}
		return reversed;
	}
	
	private String capitalise(String... words) {
		var result = new StringBuffer();
		for (var word : words) {
			var upperCaseFirstLetter = word.substring(0, 1).toUpperCase();
			var lowerCaseEnding = word.toLowerCase().substring(1);
			var capitalisedWord = upperCaseFirstLetter + lowerCaseEnding;
			result.append(capitalisedWord);
			result.append(" ");
		}
		return result.toString().trim();
	}

}