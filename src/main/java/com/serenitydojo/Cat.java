package com.serenitydojo;

public class Cat {
    private String name;
    private String food;
    private int age;
    public static String CAT_NOISE = "Meow";

    public static String usualFood(){
        return "Tuna";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.food = usualFood();
    }

    public Cat(String name, String food, int age) {
        this.name = name;
        this.food = food;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(name + " lick his paws");
    }
}
