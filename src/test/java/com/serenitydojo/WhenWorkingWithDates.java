package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class WhenWorkingWithDates {

    @Test
    public void creatingATimestampForToday(){
        LocalDate today = LocalDate.now();
        System.out.println("Local Date is "+today);
    }

    @Test
    public void creatingAGivenDate(){
        LocalDate fourOfJuly = LocalDate.of(2024,7,4);
        System.out.println("Local Date is "+fourOfJuly);
    }

    @Test
    public void parsingADate(){
        String dateInStingFormat = "2020-05-01";
        LocalDate firstOfMay = LocalDate.parse(dateInStingFormat);
        System.out.println("Local Date is "+firstOfMay);
    }

    @Test
    public void parsingADateWithAGifevFormat(){
        LocalDate mayFirst = LocalDate.parse("01/05/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Local Date is "+mayFirst);
    }

    @Test
    public void yesterday(){
        LocalDate today = LocalDate.now();
        //LocalDate yesterday = today.minusDays(1);
        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);

        System.out.println("Yesterday is "+yesterday);
    }

    @Test
    public void checkingTheMonth(){
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
    }

    @Test
    public void comparingDates(){
        LocalDate firstOfMay = LocalDate.of(2020,5,1);
        LocalDate fifthOfMay = LocalDate.of(2020,5,5);
        LocalDate tenthOfMay = LocalDate.of(2020,5,10);

        Assertions.assertThat(firstOfMay).isEqualTo("2020-05-01");
        Assertions.assertThat(firstOfMay).isBefore(fifthOfMay);
        Assertions.assertThat(tenthOfMay).isAfter(fifthOfMay);
        Assertions.assertThat(fifthOfMay).isBetween(firstOfMay,tenthOfMay);
    }

    @Test
    public void usingTime(){
        LocalTime now = LocalTime.now();
        System.out.println("Yesterday is "+now);

        LocalTime fiveHoursAgo = now.minus(5,ChronoUnit.HOURS);
        System.out.println("Yesterday is "+fiveHoursAgo);

    }
}
