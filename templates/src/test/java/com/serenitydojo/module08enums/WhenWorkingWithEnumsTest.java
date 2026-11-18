package com.serenitydojo.module08enums;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 8.2: Enums. Complete the TShirtSize enum.
 */
class WhenWorkingWithEnumsTest {

    @Test
    void anEnumHasAFixedSetOfValues() {
        assertThat(TShirtSize.values())
                .containsExactly(TShirtSize.SMALL, TShirtSize.MEDIUM, TShirtSize.LARGE, TShirtSize.EXTRA_LARGE);
    }

    @Test
    void enumValuesHaveANameAndAnOrdinal() {
        assertThat(TShirtSize.MEDIUM.name()).isEqualTo("MEDIUM");
        assertThat(TShirtSize.MEDIUM.ordinal()).isEqualTo(1);
    }

    @Test
    void enumValuesCanBeLookedUpByName() {
        assertThat(TShirtSize.valueOf("LARGE")).isEqualTo(TShirtSize.LARGE);
    }

    @Test
    void eachSizeHasAMaximumChestMeasurement() {
        assertThat(Arrays.stream(TShirtSize.values()).map(TShirtSize::getMaxChestCm))
                .containsExactly(90, 100, 110, 120);
    }

    @Test
    void shouldFindTheSmallestSizeThatFits() {
        assertThat(TShirtSize.forChest(85)).isEqualTo(TShirtSize.SMALL);
        assertThat(TShirtSize.forChest(90)).isEqualTo(TShirtSize.SMALL);
        assertThat(TShirtSize.forChest(91)).isEqualTo(TShirtSize.MEDIUM);
        assertThat(TShirtSize.forChest(120)).isEqualTo(TShirtSize.EXTRA_LARGE);
    }

    @Test
    void shouldReturnNothingIfNoSizeFits() {
        assertThat(TShirtSize.forChest(150)).isNull();
    }
}
