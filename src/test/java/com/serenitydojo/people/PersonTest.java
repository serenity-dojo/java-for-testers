package com.serenitydojo.people;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

import static com.serenitydojo.people.Person.Gender.FEMALE;
import static com.serenitydojo.people.Person.Gender.MALE;

public class PersonTest {

    Person sam = new Person("Sam", FEMALE, 30, "Red");
    Person bill = new Person("Bill", MALE, 40, "Blue");
    Person tim = new Person("Tim", MALE, 10, "Green");
    Person susan = new Person("Susam", FEMALE, 50, "Yellow");
    Person fred = new Person("Fred", FEMALE, 20, "Blue");
    Person sarah = new Person("Sarah", FEMALE, 34, "Orange");
    Person paul = new Person("Paul", MALE, 40, "Cyan");

    List<Person> allThePeople = Arrays.asList(sam, bill, tim, susan,fred,sarah,paul);

    //PersonChecker LIKE_BLUE = person -> (person.getFavouriteColor().equals("Blue"));
    //PersonChecker LIKE_RED = person -> (person.getFavouriteColor().equals("Red"));
    //PersonChecker LIKE_RED_OR_UNDER_30
    //        = person -> person.getFavouriteColor().equals("Red") || person.age <= 30;

    Predicate<Person> LIKE_BLUE = person -> (person.getFavouriteColor().equals("Blue"));
    Predicate<Person> LIKE_RED = person -> (person.getFavouriteColor().equals("Red"));
    Predicate<Person> LIKE_RED_OR_UNDER_30
            = person -> person.getFavouriteColor().equals("Red") || person.age <= 30;

    @Test
    public void ICanSearchForPeopleWhoLikeBlue (){
        // Search for people that like Blue
        PeopleDatabase people = new PeopleDatabase(allThePeople);

        List<Person> matchingPeople
                = people.findAllThePeopleWho(LIKE_BLUE);

        assertThat(matchingPeople).contains(bill,fred);
    }

    @Test
    public void ICanSearchForPeopleWhoLikeRed (){
        // Search for people that like Blue
        PeopleDatabase people = new PeopleDatabase(allThePeople);

    //    PersonChecker likeRed = new PersonChecker() {
    //        @Override
    //        public boolean test(Person person) {
    //            return (person.getFavouriteColor().equals("Red"));
    //        }
    //    };


        // Replace this expression by constant LIKE_RED
    //   PersonChecker likeRed = person -> (person.getFavouriteColor().equals("Red"));

        List<Person> matchingPeople
                = people.findAllThePeopleWho(LIKE_RED);

        assertThat(matchingPeople).contains(sam);
    }

    @Test
    public void ICanSearchForPeopleWhoLikeRedOrUnder30 (){
        // Search for people that like Blue
        PeopleDatabase people = new PeopleDatabase(allThePeople);

        List<Person> matchingPeople
                = people.findAllThePeopleWho(LIKE_RED_OR_UNDER_30);

        assertThat(matchingPeople).contains(sam,fred);
    }

    @Test
    public void peopleCanEarnPoints (){
        allThePeople.parallelStream()
                .peek(person -> System.out.println("Points for "+person.getName()+" are "+person.getPoints()))
                .peek(person -> person.earnPoints(100))
                .forEach(person -> System.out.println("Updated Points for "+person.getName()+" are "+person.getPoints()));

//        allThePeople.parallelStream().forEach(
//                person -> {
//                    person.earnPoints(100);
//                    System.out.println("Points for "+person.getName()+" are "+person.getPoints());
//                }
//        );

//        allThePeople.forEach(
//                person -> System.out.println("Points for "+person.getName()+" are "+person.getPoints())
//        );
    }

    @Test
    public void getTheListOfColors (){
//        List<String > allTheColors = allThePeople.stream()
//                .map(person -> person.getFavouriteColor())
//                .collect(Collectors.toList());
//        System.out.println(allTheColors);

        List<String > allTheColors = allThePeople.stream()
                .map(Person::getFavouriteColor)
                .sorted()
                .sorted(Comparator.reverseOrder())
                .sorted(Comparator.comparing(color -> color.length()))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(allTheColors);

        OptionalInt minNumberOfLetters = allThePeople.stream()
                .map(Person::getFavouriteColor)
                .filter(color -> color.equals("Orange"))
                .sorted()
                .distinct()
                .mapToInt(color -> color.length())
                .min();
        System.out.println(minNumberOfLetters);
    }

}
