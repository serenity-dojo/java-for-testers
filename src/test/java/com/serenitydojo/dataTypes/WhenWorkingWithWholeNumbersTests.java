package com.serenitydojo.dataTypes;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.Test;

public class WhenWorkingWithWholeNumbersTests {

	/**
	 * 
	 * TODO: create a new int variable called timeJump and assign it a value Next,
	 * add this variable to initialYear and assign the result to targetYear, so that
	 * targetYear is equal to 2015
	 * 
	 */
	@Test
	public void addingNumbersTogether() {
		int initialYear = 1985;
		int timeJump=30;
		int targetYear = initialYear+timeJump;
		System.out.println("\nInitial Years value : "+initialYear);
		System.out.println("\ntimeJump Years value : "+timeJump);
		System.out.println("\nTarget Years value  : "+targetYear);
		assertThat(targetYear, equalTo(2015));
	}

}