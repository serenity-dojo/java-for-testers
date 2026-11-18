package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 14.4: Working with the Java Date APIs.
 * <p>
 * Replace the placeholder values with code that uses the java.time classes.
 */
class WhenWorkingWithDatesTest {

    private final LocalDate march15 = LocalDate.of(2024, 3, 15);

    @Test
    void creatingADateFromItsParts() {
        // TODO: create the date 15 March 2024 using LocalDate.of(year, month, day)
        LocalDate date = LocalDate.of(2024, 3, 15);

        assertThat(date).isEqualTo(march15);
    }

    @Test
    void creatingADateFromText() {
        // TODO: create the date by parsing the text "2024-03-15" using LocalDate.parse(...)
        LocalDate date = LocalDate.parse("2024-03-15");

        assertThat(date).isEqualTo(march15);
    }

    @Test
    void addingTimeToADate() {
        // TODO: add 30 days to march15 using plusDays()
        LocalDate thirtyDaysLater = march15.plusDays(30);

        assertThat(thirtyDaysLater).isEqualTo(LocalDate.of(2024, 4, 14));
    }

    @Test
    void subtractingTimeFromADate() {
        // TODO: subtract two months from march15 using minusMonths()
        LocalDate twoMonthsEarlier = march15.minusMonths(2);

        assertThat(twoMonthsEarlier).isEqualTo(LocalDate.of(2024, 1, 15));
    }

    @Test
    void findingTheDayOfTheWeek() {
        // TODO: find the day of the week of march15 using getDayOfWeek()
        DayOfWeek dayOfWeek = march15.getDayOfWeek();

        assertThat(dayOfWeek).isEqualTo(DayOfWeek.FRIDAY);
    }

    @Test
    void checkingForALeapYear() {
        // TODO: find out if march15 is in a leap year using isLeapYear()
        boolean leapYear = march15.isLeapYear();

        assertThat(leapYear).isTrue();
    }

    @Test
    void comparingDates() {
        LocalDate march20 = LocalDate.of(2024, 3, 20);

        // TODO: is march15 before march20? Use isBefore()
        boolean isBefore = march15.isBefore(march20);

        // TODO: is march15 after march20? Use isAfter()
        boolean isAfter = march15.isAfter(march20);

        assertThat(isBefore).isTrue();
        assertThat(isAfter).isFalse();
    }

    @Test
    void countingTheDaysBetweenTwoDates() {
        LocalDate newYear = LocalDate.of(2024, 1, 1);

        // TODO: count the days from newYear to march15 using ChronoUnit.DAYS.between(start, end)
        long days = ChronoUnit.DAYS.between(newYear, march15);

        assertThat(days).isEqualTo(74);
    }

    @Test
    void measuringAPeriodBetweenTwoDates() {
        LocalDate newYear = LocalDate.of(2024, 1, 1);

        // TODO: work out the period from newYear to march15 using Period.between(start, end)
        Period period = Period.between(newYear, march15);

        assertThat(period.getMonths()).isEqualTo(2);
        assertThat(period.getDays()).isEqualTo(14);
    }

    @Test
    void findingTheLastDayOfTheMonth() {
        // TODO: use march15.with(TemporalAdjusters.lastDayOfMonth())
        LocalDate lastDay = march15.with(TemporalAdjusters.lastDayOfMonth());

        assertThat(lastDay).isEqualTo(LocalDate.of(2024, 3, 31));
    }

    @Test
    void formattingADate() {
        // TODO: format march15 as "15/03/2024" using DateTimeFormatter.ofPattern("dd/MM/yyyy")
        String formatted = march15.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        assertThat(formatted).isEqualTo("15/03/2024");
    }

    @Test
    void formattingADateWithMonthNames() {
        // TODO: format march15 as "March 15, 2024" using the pattern "MMMM d, yyyy"
        String formatted = march15.format(DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH));

        assertThat(formatted).isEqualTo("March 15, 2024");
    }

    @Test
    void workingWithTimesOfDay() {
        // TODO: create the time 14:30 using LocalTime.of(hour, minute), and add 45 minutes to it
        LocalTime later = LocalTime.of(14, 30).plusMinutes(45);

        assertThat(later).isEqualTo(LocalTime.of(15, 15));
    }

    @Test
    void measuringADuration() {
        // TODO: work out the number of minutes between 09:00 and 17:30, using Duration.between(...).toMinutes()
        long minutes = Duration.between(LocalTime.of(9, 0), LocalTime.of(17, 30)).toMinutes();

        assertThat(minutes).isEqualTo(510);
    }

    @Test
    void combiningADateAndATime() {
        // TODO: create the date and time 15 March 2024 at 14:30, using LocalDateTime.of(date, time)
        LocalDateTime meeting = LocalDateTime.of(march15, LocalTime.of(14, 30));

        assertThat(meeting.getYear()).isEqualTo(2024);
        assertThat(meeting.getHour()).isEqualTo(14);
        assertThat(meeting.toLocalDate()).isEqualTo(march15);
    }
}
