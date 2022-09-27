package com.serenitydojo;

public class Cat extends Pet{

    private String food;

    private String toy;
    public static String CAT_NOISE = "Meow";

    public static String PLAY = "plays with string";

    public Cat(String name, String toy, int age) {
        super(name, age);
        this.toy = toy;
    }

    public static String usualFood(){
        return "Tuna";
    }


/*    public Cat(String name, String food, int age) {
        super(name, age);
        this.food = food;
    }*/

    public String getFood() {
        return food;
    }

    @Override
    public String makeNoise() {
        return CAT_NOISE;
    }

    @Override
    public String play() {
        return PLAY;
    }

    public void feed(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(getName() + " lick his paws");
    }
}
