package com.serenitydojo.dateapi;
import static com.serenitydojo.dateutils.DateAssertUtils.assertThat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import org.testng.annotations.Test;

public class CreatingLocalDatesTests {
	
	static {
		System.out.println("\nWhen working with dates in Java 8.");
		System.out.println("\nThe LocalDate class represents a date.");
	}
	
	
    @Test
    void creatingASimpleDate() {
    System.out.println("****** We can create a date by specifying the year, month and day *****");
    LocalDate jan26 = LocalDate.of(2022, 1, 26);

    assertThat(jan26).isEqualTo(2022, Month.JANUARY, 26);
    System.out.println("\nTC-01 - creatingASimpleDate() - Executed successfully.");
    }

    
    @Test
    void creatingASimpleDateFromAString() {
    System.out.println("******* We can create a date by using a string ********");
    LocalDate jan26 = LocalDate.parse("2022-01-26");

    assertThat(jan26).isEqualTo(2022, Month.JANUARY, 26);
    System.out.println("\nTC-02 - creatingASimpleDateFromAString() - Executed successfully.");
    }

    
    @Test
    void createADateFromAFormattedString() {
    System.out.println("******* We can create a date by using a formatted string *********");
    LocalDate jan26 = LocalDate.parse("26/01/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    assertThat(jan26).isEqualTo(2022, Month.JANUARY, 26);
    System.out.println("\nTC-03 - createADateFromAFormattedString() - Executed successfully.");
    }

}