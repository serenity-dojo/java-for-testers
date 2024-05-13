package com.serenitydojo.people;

public class LikeBlue implements PersonChecker {
        public boolean test (Person person) {

            // System.out.println(person.getFavouriteColor());
            return (person.getFavouriteColor().equals("Blue"));
        }
    }