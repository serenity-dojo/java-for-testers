package com.serenitydojo.module06inheritance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 6.1: Basic inheritance.
 * <p>
 * Complete the Dog and Cat classes, then remove the fail() lines and uncomment the code in these tests.
 */
class WhenUsingBasicInheritanceTest {

    @Test
    void aDogIsAPet() {
//@@ starter
        fail("TODO: make Dog extend Pet, then uncomment the code below");
//@@ end
//@@ starter-commented
        Dog fido = new Dog("Fido", "Bone");

        assertThat(fido).isInstanceOf(Pet.class);
        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getFavoriteToy()).isEqualTo("Bone");
//@@ end
    }

    @Test
    void aDogMakesDogNoises() {
//@@ starter
        fail("TODO: make Dog extend Pet, then uncomment the code below");
//@@ end
//@@ starter-commented
        Dog fido = new Dog("Fido", "Bone");

        assertThat(fido.makeNoise()).isEqualTo("Woof");
//@@ end
    }

    @Test
    void aDogInheritsTheWalkingBehaviourOfAPet() {
//@@ starter
        fail("TODO: make Dog extend Pet, then uncomment the code below");
//@@ end
//@@ starter-commented
        Dog fido = new Dog("Fido", "Bone");

        assertThat(fido.goForWalks()).isEqualTo("walk walk walk");
//@@ end
    }

    @Test
    void aCatIsAPetThatMeows() {
//@@ starter
        fail("TODO: make Cat extend Pet, then uncomment the code below");
//@@ end
//@@ starter-commented
        Cat felix = new Cat("Felix", "Tuna");

        assertThat(felix).isInstanceOf(Pet.class);
        assertThat(felix.getName()).isEqualTo("Felix");
        assertThat(felix.getFavoriteFood()).isEqualTo("Tuna");
        assertThat(felix.makeNoise()).isEqualTo("Meow");
//@@ end
    }

    @Test
    void aCatOverridesTheWalkingBehaviourOfAPet() {
//@@ starter
        fail("TODO: make Cat extend Pet, then uncomment the code below");
//@@ end
//@@ starter-commented
        Cat felix = new Cat("Felix", "Tuna");

        assertThat(felix.goForWalks()).isEqualTo("Cats don't go for walks");
//@@ end
    }

    @Test
    void aPetVariableCanHoldAnyKindOfPet() {
//@@ starter
        fail("TODO: make Dog and Cat extend Pet, then uncomment the code below");
//@@ end
//@@ starter-commented
        Pet first = new Dog("Fido", "Bone");
        Pet second = new Cat("Felix", "Tuna");

        assertThat(first.makeNoise()).isEqualTo("Woof");
        assertThat(second.makeNoise()).isEqualTo("Meow");
//@@ end
    }
}
