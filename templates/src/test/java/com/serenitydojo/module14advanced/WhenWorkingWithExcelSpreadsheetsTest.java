package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 14.7: Working with Excel spreadsheets. Implement the methods of FruitPriceSheet.
 */
class WhenWorkingWithExcelSpreadsheetsTest {

    private final FruitPriceSheet priceSheet = new FruitPriceSheet();

    @TempDir
    Path tempDir;

    @Test
    void shouldReadPricesFromASpreadsheet() throws IOException {
        try (InputStream spreadsheet = getClass().getResourceAsStream("/spreadsheets/fruit-prices.xlsx")) {
            assertThat(spreadsheet).as("the fruit-prices.xlsx test resource").isNotNull();

            Map<String, Double> prices = priceSheet.readPrices(spreadsheet);

            assertThat(prices)
                    .containsEntry("Apple", 4.0)
                    .containsEntry("Orange", 5.5)
                    .containsEntry("Banana", 4.5)
                    .containsEntry("Pear", 4.5)
                    .hasSize(4);
        }
    }

    @Test
    void shouldReadPricesInTheOrderTheyAppearInTheSpreadsheet() throws IOException {
        try (InputStream spreadsheet = getClass().getResourceAsStream("/spreadsheets/fruit-prices.xlsx")) {
            Map<String, Double> prices = priceSheet.readPrices(spreadsheet);

            assertThat(prices.keySet()).containsExactly("Apple", "Orange", "Banana", "Pear");
        }
    }

    @Test
    void shouldWriteAndReadBackASpreadsheet() throws IOException {
        Map<String, Double> prices = new LinkedHashMap<>();
        prices.put("Mango", 7.25);
        prices.put("Kiwi", 3.0);
        Path file = tempDir.resolve("prices.xlsx");

        priceSheet.writePrices(prices, file);

        assertThat(file).exists();
        try (InputStream spreadsheet = Files.newInputStream(file)) {
            assertThat(priceSheet.readPrices(spreadsheet))
                    .containsExactlyEntriesOf(prices);
        }
    }
}
