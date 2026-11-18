package com.serenitydojo.module06inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 6.1: Basic inheritance.
 * <p>
 * Complete the Dog and Cat classes, then remove the fail() lines and uncomment the code in these tests.
 */
class WhenUsingBasicInheritanceTest {

    @Test
    void aDogIsAPet() {
        fail("TODO: make Dog extend Pet, then uncomment the code below");
        // Dog fido = new Dog("Fido", "Bone");

        // assertThat(fido).isInstanceOf(Pet.class);
        // assertThat(fido.getName()).isEqualTo("Fido");
        // assertThat(fido.getFavoriteToy()).isEqualTo("Bone");
    }

    @Test
    void aDogMakesDogNoises() {
        fail("TODO: make Dog extend Pet, then uncomment the code below");
        // Dog fido = new Dog("Fido", "Bone");

        // assertThat(fido.makeNoise()).isEqualTo("Woof");
    }

    @Test
    void aDogInheritsTheWalkingBehaviourOfAPet() {
        fail("TODO: make Dog extend Pet, then uncomment the code below");
        // Dog fido = new Dog("Fido", "Bone");

        // assertThat(fido.goForWalks()).isEqualTo("walk walk walk");
    }

    @Test
    void aCatIsAPetThatMeows() {
        fail("TODO: make Cat extend Pet, then uncomment the code below");
        // Cat felix = new Cat("Felix", "Tuna");

        // assertThat(felix).isInstanceOf(Pet.class);
        // assertThat(felix.getName()).isEqualTo("Felix");
        // assertThat(felix.getFavoriteFood()).isEqualTo("Tuna");
        // assertThat(felix.makeNoise()).isEqualTo("Meow");
    }

    @Test
    void aCatOverridesTheWalkingBehaviourOfAPet() {
        fail("TODO: make Cat extend Pet, then uncomment the code below");
        // Cat felix = new Cat("Felix", "Tuna");

        // assertThat(felix.goForWalks()).isEqualTo("Cats don't go for walks");
    }

    @Test
    void aPetVariableCanHoldAnyKindOfPet() {
        fail("TODO: make Dog and Cat extend Pet, then uncomment the code below");
        // Pet first = new Dog("Fido", "Bone");
        // Pet second = new Cat("Felix", "Tuna");

        // assertThat(first.makeNoise()).isEqualTo("Woof");
        // assertThat(second.makeNoise()).isEqualTo("Meow");
    }
}
