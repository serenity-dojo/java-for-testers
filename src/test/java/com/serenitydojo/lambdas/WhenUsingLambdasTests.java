package com.serenitydojo.lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.testng.annotations.Test;

public class WhenUsingLambdasTests {

	@Test
	public void printingOutColors() {
	List<String> colors = Arrays.asList("red", "green", "blue", "grey");
	colors.forEach(color -> System.out.println(color));
	
	System.out.println("\nTC-01 - printingOutColors() - Executed successfully.");
	}

	
	@Test
	public void filteringColors() {
	List<String> colors = Arrays.asList("red", "gritty white", "grey", "green", "blue", "grey-blue");
	String shortestColor = colors.stream()
			                     .filter(color -> color.startsWith("g"))
				                 .sorted().findFirst().orElse("unknown");

	System.out.println(shortestColor);
	System.out.println("\nTC-02 - filteringColors() - Executed successfully.");
	}

	
	
	@Test
	public void filteringColorsByItsStringLength() {
	List<String> colors = Arrays.asList("red", "gritty white", "grey", "green", "blue", "grey-blue");
	
	var shortestColor = colors.stream().filter(color -> color.startsWith("g"))
                .map(String::length)
				.sorted().collect(Collectors.toList());

	System.out.println(shortestColor);
	System.out.println("\nTC-03 - filteringColorsByItsStringLength() - Executed successfully.");
	}
	
}