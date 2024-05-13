package com.serenitydojo.people;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeopleDatabase {
    List<Person> allThePeople;
    public PeopleDatabase(List<Person> allThePeople) {
        this.allThePeople = allThePeople;
    }

     //public List<Person> findAllThePeopleWho(PersonChecker check) {
    public List<Person> findAllThePeopleWho(Predicate<Person> check) {
        return allThePeople.stream()
                .filter(check)
                .collect(Collectors.toList());

//        List<Person> matchingPeople = new ArrayList<>();
//        for (Person person: allThePeople) {
//            if (check.test(person)) {
//                // System.out.println("check TRUE");
//                matchingPeople.add(person);
//            }
//        }
//        return matchingPeople;
    }
}
