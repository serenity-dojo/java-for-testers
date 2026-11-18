package com.serenitydojo.module10maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 10.3: Reading and writing map entries.
 */
class WhenReadingAndWritingMapEntriesTest {

    private Map<String, Integer> stock;

    @BeforeEach
    void createTheStock() {
        stock = new HashMap<>(Map.of("apples", 10, "pears", 4, "plums", 0));
    }

    @Test
    void readingAValue() {
        // TODO: get the number of apples in stock
//@@ solution
        Integer apples = stock.get("apples");
//@@ starter
        Integer apples = null;
//@@ end

        assertThat(apples).isEqualTo(10);
    }

    @Test
    void readingAMissingValueGivesNull() {
        assertThat(stock.get("kiwis")).isNull();
    }

    @Test
    void readingAValueWithADefault() {
        // TODO: get the number of kiwis in stock, or 0 if there are none, using getOrDefault()
//@@ solution
        int kiwis = stock.getOrDefault("kiwis", 0);
//@@ starter
        int kiwis = -1;
//@@ end

        assertThat(kiwis).isZero();
    }

    @Test
    void checkingForKeysAndValues() {
        // TODO: check if the stock contains a key of "pears"
//@@ solution
        boolean hasPears = stock.containsKey("pears");
//@@ starter
        boolean hasPears = false;
//@@ end

        // TODO: check if any fruit has exactly 4 items in stock
//@@ solution
        boolean hasAnyWithFour = stock.containsValue(4);
//@@ starter
        boolean hasAnyWithFour = false;
//@@ end

        assertThat(hasPears).isTrue();
        assertThat(hasAnyWithFour).isTrue();
    }

    @Test
    void updatingAValue() {
        // TODO: change the number of apples to 7. Putting a key that already exists replaces its value
//@@ solution
        stock.put("apples", 7);
//@@ starter
//@@ end

        assertThat(stock.get("apples")).isEqualTo(7);
        assertThat(stock).hasSize(3);
    }

    @Test
    void addingAValueOnlyIfItIsMissing() {
        // TODO: use putIfAbsent() to try to set the pears to 99 and the kiwis to 12
//@@ solution
        stock.putIfAbsent("pears", 99);
        stock.putIfAbsent("kiwis", 12);
//@@ starter
//@@ end

        assertThat(stock.get("pears")).isEqualTo(4);
        assertThat(stock.get("kiwis")).isEqualTo(12);
    }

    @Test
    void replacingAValueOnlyIfTheKeyExists() {
        // TODO: use replace() to set the plums to 20 and the figs to 5
//@@ solution
        stock.replace("plums", 20);
        stock.replace("figs", 5);
//@@ starter
//@@ end

        assertThat(stock.get("plums")).isEqualTo(20);
        assertThat(stock).doesNotContainKey("figs");
    }

    @Test
    void removingAnEntry() {
        // TODO: remove the plums from the map
//@@ solution
        stock.remove("plums");
//@@ starter
//@@ end

        assertThat(stock).doesNotContainKey("plums").hasSize(2);
    }

    @Test
    void updatingAValueBasedOnItsCurrentValue() {
        // TODO: add 5 to the number of pears, using merge(key, 5, Integer::sum)
//@@ solution
        stock.merge("pears", 5, Integer::sum);
//@@ starter
//@@ end

        assertThat(stock.get("pears")).isEqualTo(9);
    }
}
