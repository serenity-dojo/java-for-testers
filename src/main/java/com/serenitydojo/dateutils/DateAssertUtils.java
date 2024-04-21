package com.serenitydojo.dateutils;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import org.assertj.core.api.AbstractAssert;

public class DateAssertUtils extends AbstractAssert<DateAssertUtils, LocalDate> {

	public DateAssertUtils(LocalDate actual) {
		super(actual, DateAssertUtils.class);
	}

	public static DateAssertUtils assertThat(LocalDate actual) {
		return new DateAssertUtils(actual);
	}

	public DateAssertUtils isEqualTo(int expectedYear, Month expectedMonth, int expectedDay) {
		if (actual.getYear() != expectedYear || actual.getMonth() != expectedMonth
				|| actual.getDayOfMonth() != expectedDay) {
			failWithMessage("Expected a date of %s %s %s but was %s", expectedDay, expectedMonth, expectedYear, actual);
		}
		return this;
	}

	public LocalDate findFollowingWeekDay(LocalDate startDate, DayOfWeek expectedDayOfWeek) {
		LocalDate followingDay = startDate;
		while (followingDay.getDayOfWeek() != expectedDayOfWeek) {
			followingDay = followingDay.plusDays(1);
		}
		return followingDay;
	}

}