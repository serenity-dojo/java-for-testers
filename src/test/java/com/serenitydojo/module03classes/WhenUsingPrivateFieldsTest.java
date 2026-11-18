package com.serenitydojo.module03classes;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Modifier;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 3.3: Private fields.
 * <p>
 * Complete the Dog and Hamster classes, then remove the fail() lines and uncomment the code in these tests.
 */
class WhenUsingPrivateFieldsTest {

    @Test
    void aDogIsCreatedWithItsDetails() {
        Dog fido = new Dog("Fido", "Bone", 5);

        assertThat(fido.getName()).isEqualTo("Fido");
        assertThat(fido.getFavoriteToy()).isEqualTo("Bone");
        assertThat(fido.getAge()).isEqualTo(5);
    }

    @Test
    void theFieldsOfADogShouldBePrivate() {
        assertThat(Dog.class.getDeclaredFields())
                .hasSize(3)
                .allMatch(field -> Modifier.isPrivate(field.getModifiers()));
    }

    @Test
    void aHamsterCanHaveItsAgeUpdated() {
        Hamster hammy = new Hamster("Hammy", 1);

        hammy.setAge(2);

        assertThat(hammy.getAge()).isEqualTo(2);
    }

    @Test
    void aHamsterCannotHaveANegativeAge() {
        Hamster hammy = new Hamster("Hammy", 1);

        hammy.setAge(-5);

        assertThat(hammy.getAge()).isEqualTo(1);
    }

    @Test
    void aHamsterNameCannotBeChanged() {
        assertThat(Arrays.stream(Hamster.class.getDeclaredMethods()).map(method -> method.getName()))
                .doesNotContain("setName");
        assertThat(Hamster.class.getDeclaredFields())
                .hasSize(2)
                .allMatch(field -> Modifier.isPrivate(field.getModifiers()));
    }
}
