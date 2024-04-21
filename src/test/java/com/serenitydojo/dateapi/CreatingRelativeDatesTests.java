package com.serenitydojo.dateapi;
import static com.serenitydojo.dateutils.DateAssertUtils.assertThat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import org.testng.annotations.Test;
import com.serenitydojo.dateutils.DateAssertUtils;

public class CreatingRelativeDatesTests {
	
	static {
		System.out.println("\nWhen working with dates in Java 8.");
		System.out.println("\nWe can use LocalDates to find relative dates");
	}

	@Test
	void findTheNextDay() {
	System.out.println("******* We can create a date for the following day *******");
	LocalDate jan26 = LocalDate.of(2022, 1, 26);
	LocalDate jan27 = jan26.plusDays(1);
	
	assertThat(jan27).isEqualTo(2022, Month.JANUARY, 27);
	System.out.println("\nTC-01 - findTheNextDay() - Executed successfully.");
	}

	
	@Test
	void findTheNextMonth() {
	System.out.println("******** We can create a date for the following month *******");
	LocalDate jan26 = LocalDate.of(2022, 1, 26);
	LocalDate feb26 = jan26.plusMonths(1);
	
	assertThat(feb26).isEqualTo(2022, Month.FEBRUARY, 26);
	// Challenge: see what happens when you add 1 month to Jan 30th
	System.out.println("\nTC-02 - findTheNextMonth() - Executed successfully.");
	}

	
	@Test
	void findTheNextMonday() {
	System.out.println("********* We can find a specific day of the week ***********");
	LocalDate jan26 = LocalDate.of(2022, 1, 26);
	LocalDate followingMonday = DateAssertUtils.assertThat(jan26).findFollowingWeekDay(jan26, DayOfWeek.MONDAY);

	assertThat(followingMonday).isEqualTo(2022, Month.JANUARY, 31);
	System.out.println("\nTC-03 - findTheNextMonday() - Executed successfully.");
	}

	
	@Test
	void usingTemporalAdjusters() {
	System.out.println("********* We can find a specific day of the week using temporal adjusters ***********");
	LocalDate jan26 = LocalDate.of(2022, 1, 26);
	LocalDate nextMonday = jan26.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
	
	assertThat(nextMonday).isEqualTo(2022, Month.JANUARY, 31);
	System.out.println("\nTC-04 - usingTemporalAdjusters() - Executed successfully.");
	}

	
	@Test
	void usingTemporalAdjustersToGetTheNextOrCurrentDate() {
	System.out.println("********* We can find a specific day of the week using temporal adjusters ***********");
	LocalDate jan24 = LocalDate.of(2022, 1, 24);
	LocalDate nextMonday = jan24.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
	
	assertThat(nextMonday).isEqualTo(2022, Month.JANUARY, 24);
	System.out.println("\nTC-05 - usingTemporalAdjustersToGetTheNextOrCurrentDate() - Executed successfully.");
	}

	
	@Test
	void usingOtherTemporalAdjusters() {
	System.out.println("********* We can find the first day of the next month ***********");
	LocalDate jan26 = LocalDate.of(2022, 1, 26);
	LocalDate nextMonday = jan26.with(TemporalAdjusters.firstDayOfNextMonth());
	
	assertThat(nextMonday).isEqualTo(2022, Month.FEBRUARY, 1);
	System.out.println("\nTC-06 - usingOtherTemporalAdjusters() - Executed successfully.");
	}

}