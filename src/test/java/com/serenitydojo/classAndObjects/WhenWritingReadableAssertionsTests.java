package com.serenitydojo.classAndObjects;
import static org.assertj.core.data.Percentage.withPercentage;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class WhenWritingReadableAssertionsTests {

	
	@Test
	public void whenTwoNumbersAreEqual() {
	int a = 5;
	int b = 10;
	int c = 20;
	int sum = a + b + c;

	// Check that the sum is 35
	assertThat(sum).isEqualTo(35);
	System.out.println("TC-01 - whenTwoNumbersAreEqual() - Executed successfully.");
	}

	
	@Test
	public void whenANumberIsGreaterThanAnother() {
	int a = 5;
	int b = 10;
	int c = 20;
	int sum = a + b + c;

	// Check that the sum is greater than 30
	assertThat(sum).isGreaterThan(30);
	System.out.println("TC-02 - whenANumberIsGreaterThanAnother() - Executed successfully.");
	}

	
	@Test
	public void whenANumberIsInACertainInterval() {
	int a = 5;
	int b = 10;
	int sum = a + b;

	// Check that the sum is between 10 and 20
	assertThat(sum).isBetween(10,20);
	System.out.println("TC-03 - whenANumberIsInACertainInterval() - Executed successfully.");
	}

	
	@Test
	public void whenANumberIsCloseToAnotherValue() {
	double roughlyOneHundred = 99;

	// Check that the sum is within 10% of 100
	assertThat(roughlyOneHundred).isCloseTo(100,withPercentage(10.0));
	System.out.println("TC-04 - whenANumberIsCloseToAnotherValue() - Executed successfully.");
	}

	
	@Test
	public void whenAStringIsEqualToAnother() {
	String color = "red";

	// Check that the string has a value of 'red'
	assertThat(color).isEqualTo("red");
	System.out.println("TC-05 - whenAStringIsEqualToAnother() - Executed successfully.");
	}

	
	@Test
	public void whenAStringIsEqualIgnoringCase() {
	String color = "RED";

	// Check that the string has a value of 'red' (ignoring case)
	assertThat(color).isEqualToIgnoringCase("red");
	System.out.println("TC-06 - whenAStringIsEqualIgnoringCase() - Executed successfully.");
	}

	
	@Test
	public void whenAStringContainsOnlyDigits() {
	String licenseNumber = "12345";

	// Check that the value contains only digits
	assertThat(licenseNumber).containsOnlyDigits();
	System.out.println("TC-07 - whenAStringContainsOnlyDigits() - Executed successfully.");
	}

	
	@Test
	public void whenAStringStartsWithAValue() {
	String colors = "red,green,blue";

	// Check that the value starts with 'red'
	assertThat(colors).startsWith("red");
	System.out.println("TC-08 - whenAStringStartsWithAValue() - Executed successfully.");
	}

	
	@Test
	public void whenAStringEndsWithAValue() {
	String colors = "red,green,blue";

	// Check that the value ends with 'blue'
	assertThat(colors).endsWith("blue");
	System.out.println("TC-09 - whenAStringEndsWithAValue() - Executed successfully.");
	}

	
	@Test
	public void whenAListContainsAValue() {
	List<String> colors = Arrays.asList("red", "green", "blue");

	// Check that the list contains "red"
	assertThat(colors).contains("red");
	System.out.println("TC-10 - whenAListContainsAValue() - Executed successfully.");
	}

	
	@Test
	public void whenAListContainsASetOfValues() {
	List<String> colors = Arrays.asList("red", "green", "blue");

	// Check that the list contains "red" and "blue
	assertThat(colors).contains("red","blue");
	System.out.println("TC-11 - whenAListContainsASetOfValues() - Executed successfully.");
	}

	
	@Test
	public void whenAListHasASpecificSize() {
	List<String> colors = Arrays.asList("red", "green", "blue");

	// Check that the list contains 3 elements
	assertThat(colors).hasSize(3);
	System.out.println("TC-12 - whenAListHasASpecificSize() - Executed successfully.");
	}

	
	@Test
	public void whenAListContainsExactlyASetOfValues() {
	List<String> colors = Arrays.asList("red", "green", "blue");

	// Check that the list contains "red","green" and "blue"
	assertThat(colors).containsExactlyInAnyOrder("red","green","blue");
	System.out.println("TC-13 - whenAListContainsExactlyASetOfValues() - Executed successfully.");
	}

	
	@Test
	public void whenAListContainsExactlyASetOfValuesInAnyOrder() {
	List<String> colors = Arrays.asList("red", "green", "blue");

	// Check that the list contains "red","blue" and "green" in any order
	assertThat(colors).containsExactlyInAnyOrder("red", "green", "blue");
	System.out.println("TC-14 - whenAListContainsExactlyASetOfValuesInAnyOrder() - Executed successfully.");
	}

}