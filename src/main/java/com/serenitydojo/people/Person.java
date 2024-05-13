package com.serenitydojo.people;

public class Person {
    public enum Gender {MALE, FEMALE}

    String name;
    Gender gender;
    int points;

    int age;
    String favouriteColor;

    public Person(String name, Gender gender, int age, String favouriteColor) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.favouriteColor = favouriteColor;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString (){
        return name;
    }

    public void earnPoints(int earnedPoints){
        System.out.println(getName()+" has just earned "+earnedPoints);
        points =+ earnedPoints;
    }
}
