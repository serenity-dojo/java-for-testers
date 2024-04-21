package com.serenitydojo.dataTypes;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.Test;

public class WhenWorkingWithFloatingPointNumbersTests {
	
	/**
	 * 
	 * Exercise 1: Convert 27 degrees Celcius to Farenheit The equation is:
	 * farenheit = (9 / 5) * celcius + 32 
	 * TODO: Use a floating point calculation to
	 * calculate the farenheit equivalent of the celcius value.
	 * 
	 */
	@Test
	public void convertToFarenheit() {
		double celcius = 27.0d;
		double farenheit = (((9*celcius)/5)+32);
		System.out.println("\nCelcius Temrature Value : "+celcius);
		System.out.println("\nEquivalant Farenheit Temrature Value : "+farenheit);
		
		assertThat(farenheit, equalTo(80.6));
	}

    
	/**
	 * 
	 * Exercise 2: Convert kilograms to pounds There are 2.20462 pounds in a
	 * kilogram. 
	 * TODO: Use a floating point calculation to calculate the correct
	 * weight in pounds.
	 * 
	 */
	@Test
	public void convertMetersToFeet() {
		final double PER_KILO_POUND=2.20462;
		int weightInKilograms = 50;
		double weightInPounds = (weightInKilograms*PER_KILO_POUND);
		System.out.println("\nWeight in Kilogram : "+weightInKilograms);
		System.out.println("\nWeight in Pounds   : "+weightInPounds);
		assertThat(weightInPounds, equalTo(110.231));
	}

	
}