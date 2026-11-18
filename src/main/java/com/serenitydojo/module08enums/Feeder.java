package com.serenitydojo.module08enums;

/**
 * Exercise 8.1a: Switches.
 */
public class Feeder {

    /**
     * Chooses the right food for an animal:
     * <pre>
     *            standard     premium
     *   CAT      TUNA         SALMON
     *   DOG      DOG_FOOD     DELUXE_DOG_FOOD
     *   HAMSTER  CABBAGE      LETTUCE
     * </pre>
     * Any other animal gets UNKNOWN food.
     */
    public FoodType feeds(AnimalType animal, boolean isPremium) {
        // TODO: use a switch statement on the animal to choose the right food
        return FoodType.UNKNOWN;
    }
}
