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
//@@ solution
        LocalDate date = LocalDate.of(2024, 3, 15);
//@@ starter
        LocalDate date = LocalDate.of(2000, 1, 1);
//@@ end

        assertThat(date).isEqualTo(march15);
    }

    @Test
    void creatingADateFromText() {
        // TODO: create the date by parsing the text "2024-03-15" using LocalDate.parse(...)
//@@ solution
        LocalDate date = LocalDate.parse("2024-03-15");
//@@ starter
        LocalDate date = LocalDate.of(2000, 1, 1);
//@@ end

        assertThat(date).isEqualTo(march15);
    }

    @Test
    void addingTimeToADate() {
        // TODO: add 30 days to march15 using plusDays()
//@@ solution
        LocalDate thirtyDaysLater = march15.plusDays(30);
//@@ starter
        LocalDate thirtyDaysLater = march15;
//@@ end

        assertThat(thirtyDaysLater).isEqualTo(LocalDate.of(2024, 4, 14));
    }

    @Test
    void subtractingTimeFromADate() {
        // TODO: subtract two months from march15 using minusMonths()
//@@ solution
        LocalDate twoMonthsEarlier = march15.minusMonths(2);
//@@ starter
        LocalDate twoMonthsEarlier = march15;
//@@ end

        assertThat(twoMonthsEarlier).isEqualTo(LocalDate.of(2024, 1, 15));
    }

    @Test
    void findingTheDayOfTheWeek() {
        // TODO: find the day of the week of march15 using getDayOfWeek()
//@@ solution
        DayOfWeek dayOfWeek = march15.getDayOfWeek();
//@@ starter
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
//@@ end

        assertThat(dayOfWeek).isEqualTo(DayOfWeek.FRIDAY);
    }

    @Test
    void checkingForALeapYear() {
        // TODO: find out if march15 is in a leap year using isLeapYear()
//@@ solution
        boolean leapYear = march15.isLeapYear();
//@@ starter
        boolean leapYear = false;
//@@ end

        assertThat(leapYear).isTrue();
    }

    @Test
    void comparingDates() {
        LocalDate march20 = LocalDate.of(2024, 3, 20);

        // TODO: is march15 before march20? Use isBefore()
//@@ solution
        boolean isBefore = march15.isBefore(march20);
//@@ starter
        boolean isBefore = false;
//@@ end

        // TODO: is march15 after march20? Use isAfter()
//@@ solution
        boolean isAfter = march15.isAfter(march20);
//@@ starter
        boolean isAfter = true;
//@@ end

        assertThat(isBefore).isTrue();
        assertThat(isAfter).isFalse();
    }

    @Test
    void countingTheDaysBetweenTwoDates() {
        LocalDate newYear = LocalDate.of(2024, 1, 1);

        // TODO: count the days from newYear to march15 using ChronoUnit.DAYS.between(start, end)
//@@ solution
        long days = ChronoUnit.DAYS.between(newYear, march15);
//@@ starter
        long days = 0;
//@@ end

        assertThat(days).isEqualTo(74);
    }

    @Test
    void measuringAPeriodBetweenTwoDates() {
        LocalDate newYear = LocalDate.of(2024, 1, 1);

        // TODO: work out the period from newYear to march15 using Period.between(start, end)
//@@ solution
        Period period = Period.between(newYear, march15);
//@@ starter
        Period period = Period.ZERO;
//@@ end

        assertThat(period.getMonths()).isEqualTo(2);
        assertThat(period.getDays()).isEqualTo(14);
    }

    @Test
    void findingTheLastDayOfTheMonth() {
        // TODO: use march15.with(TemporalAdjusters.lastDayOfMonth())
//@@ solution
        LocalDate lastDay = march15.with(TemporalAdjusters.lastDayOfMonth());
//@@ starter
        LocalDate lastDay = march15;
//@@ end

        assertThat(lastDay).isEqualTo(LocalDate.of(2024, 3, 31));
    }

    @Test
    void formattingADate() {
        // TODO: format march15 as "15/03/2024" using DateTimeFormatter.ofPattern("dd/MM/yyyy")
//@@ solution
        String formatted = march15.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//@@ starter
        String formatted = "";
//@@ end

        assertThat(formatted).isEqualTo("15/03/2024");
    }

    @Test
    void formattingADateWithMonthNames() {
        // TODO: format march15 as "March 15, 2024" using the pattern "MMMM d, yyyy"
//@@ solution
        String formatted = march15.format(DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH));
//@@ starter
        String formatted = "";
//@@ end

        assertThat(formatted).isEqualTo("March 15, 2024");
    }

    @Test
    void workingWithTimesOfDay() {
        // TODO: create the time 14:30 using LocalTime.of(hour, minute), and add 45 minutes to it
//@@ solution
        LocalTime later = LocalTime.of(14, 30).plusMinutes(45);
//@@ starter
        LocalTime later = LocalTime.MIDNIGHT;
//@@ end

        assertThat(later).isEqualTo(LocalTime.of(15, 15));
    }

    @Test
    void measuringADuration() {
        // TODO: work out the number of minutes between 09:00 and 17:30, using Duration.between(...).toMinutes()
//@@ solution
        long minutes = Duration.between(LocalTime.of(9, 0), LocalTime.of(17, 30)).toMinutes();
//@@ starter
        long minutes = 0;
//@@ end

        assertThat(minutes).isEqualTo(510);
    }

    @Test
    void combiningADateAndATime() {
        // TODO: create the date and time 15 March 2024 at 14:30, using LocalDateTime.of(date, time)
//@@ solution
        LocalDateTime meeting = LocalDateTime.of(march15, LocalTime.of(14, 30));
//@@ starter
        LocalDateTime meeting = LocalDateTime.of(2000, 1, 1, 0, 0);
//@@ end

        assertThat(meeting.getYear()).isEqualTo(2024);
        assertThat(meeting.getHour()).isEqualTo(14);
        assertThat(meeting.toLocalDate()).isEqualTo(march15);
    }
}
