package com.serenitydojo.module08enums;

import org.junit.jupiter.api.Test;

import static com.serenitydojo.module08enums.AnimalType.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 8.1a: Switches. Implement Feeder.feeds().
 */
class WhenFeedingTheAnimalsTest {

    private final Feeder feeder = new Feeder();

    @Test
    void shouldFeedCatsTuna() {
        assertThat(feeder.feeds(CAT, false)).isEqualTo(FoodType.TUNA);
    }

    @Test
    void shouldFeedHamstersCabbage() {
        assertThat(feeder.feeds(HAMSTER, false)).isEqualTo(FoodType.CABBAGE);
    }

    @Test
    void shouldFeedDogsDogFood() {
        assertThat(feeder.feeds(DOG, false)).isEqualTo(FoodType.DOG_FOOD);
    }

    @Test
    void shouldFeedPremiumCatsSalmon() {
        assertThat(feeder.feeds(CAT, true)).isEqualTo(FoodType.SALMON);
    }

    @Test
    void shouldFeedPremiumDogsDeluxeDogFood() {
        assertThat(feeder.feeds(DOG, true)).isEqualTo(FoodType.DELUXE_DOG_FOOD);
    }

    @Test
    void shouldFeedPremiumHamstersLettuce() {
        assertThat(feeder.feeds(HAMSTER, true)).isEqualTo(FoodType.LETTUCE);
    }

    @Test
    void shouldNotKnowWhatToFeedOtherAnimals() {
        assertThat(feeder.feeds(LLAMA, false)).isEqualTo(FoodType.UNKNOWN);
        assertThat(feeder.feeds(FISH, true)).isEqualTo(FoodType.UNKNOWN);
    }
}
