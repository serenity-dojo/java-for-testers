package com.serenitydojo.module06inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 6.1: Basic inheritance.
 * <p>
 * Complete the Dog and Cat classes, then remove the fail() lines and uncomment the code in these tests.
 */
class WhenUsingBasicInheritanceTest {

    @Test
    void aDogIsAPet() {
        Dog fido = new Dog("Fido", "Bone");

        assertThat(fido).isInstanceOf(Pet.class);
        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getFavoriteToy()).isEqualTo("Bone");
    }

    @Test
    void aDogMakesDogNoises() {
        Dog fido = new Dog("Fido", "Bone");

        assertThat(fido.makeNoise()).isEqualTo("Woof");
    }

    @Test
    void aDogInheritsTheWalkingBehaviourOfAPet() {
        Dog fido = new Dog("Fido", "Bone");

        assertThat(fido.goForWalks()).isEqualTo("walk walk walk");
    }

    @Test
    void aCatIsAPetThatMeows() {
        Cat felix = new Cat("Felix", "Tuna");

        assertThat(felix).isInstanceOf(Pet.class);
        assertThat(felix.getName()).isEqualTo("Felix");
        assertThat(felix.getFavoriteFood()).isEqualTo("Tuna");
        assertThat(felix.makeNoise()).isEqualTo("Meow");
    }

    @Test
    void aCatOverridesTheWalkingBehaviourOfAPet() {
        Cat felix = new Cat("Felix", "Tuna");

        assertThat(felix.goForWalks()).isEqualTo("Cats don't go for walks");
    }

    @Test
    void aPetVariableCanHoldAnyKindOfPet() {
        Pet first = new Dog("Fido", "Bone");
        Pet second = new Cat("Felix", "Tuna");

        assertThat(first.makeNoise()).isEqualTo("Woof");
        assertThat(second.makeNoise()).isEqualTo("Meow");
    }
}
