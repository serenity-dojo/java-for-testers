package com.serenitydojo.module03classes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 3.2: Classes and fields.
 * <p>
 * Add the fields to the Cat class, then remove the fail() lines and uncomment the code in these tests.
 */
class WhenCreatingACatTest {

    @Test
    void aCatHasANameFavoriteFoodAndAge() {
//@@ starter
        fail("TODO: add the fields to the Cat class, then uncomment the code below");
//@@ end
//@@ starter-commented
        Cat felix = new Cat();
        felix.name = "Felix";
        felix.favoriteFood = "Tuna";
        felix.age = 4;

        assertThat(felix.name).isEqualTo("Felix");
        assertThat(felix.favoriteFood).isEqualTo("Tuna");
        assertThat(felix.age).isEqualTo(4);
//@@ end
    }

    @Test
    void eachCatHasItsOwnFields() {
//@@ starter
        fail("TODO: add the fields to the Cat class, then uncomment the code below");
//@@ end
//@@ starter-commented
        Cat felix = new Cat();
        felix.name = "Felix";

        Cat tom = new Cat();
        tom.name = "Tom";

        assertThat(felix.name).isEqualTo("Felix");
        assertThat(tom.name).isEqualTo("Tom");
//@@ end
    }

    @Test
    void fieldsHaveDefaultValuesUntilTheyAreSet() {
//@@ starter
        fail("TODO: add the fields to the Cat class, then uncomment the code below");
//@@ end
//@@ starter-commented
        Cat unnamedCat = new Cat();

        assertThat(unnamedCat.name).isNull();
        assertThat(unnamedCat.age).isZero();
//@@ end
    }
}
