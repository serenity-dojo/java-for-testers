package com.serenitydojo.dateapi;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class FormattingDatesTests {

	static {
		System.out.println("\nWhen working with dates in Java 8.");
	}

	
	@Test
	void createADateFromAFormattedString() {
		System.out.println("**** We can convert dates to a formatted string value ****");
		LocalDate jan26 = LocalDate.of(2022, 1, 26);
		String formattedDate = jan26.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));

		Assertions.assertThat(formattedDate).isEqualTo("Jan 26, 2022");
		System.out.println("\nTC-01 - createADateFromAFormattedString() - Executed successfully.");
	}

}