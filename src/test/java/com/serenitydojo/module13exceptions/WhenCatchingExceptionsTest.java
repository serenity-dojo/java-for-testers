package com.serenitydojo.module13exceptions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 13.3: Catching exceptions. Implement the methods of SafeReader.
 */
class WhenCatchingExceptionsTest {

    private final SafeReader reader = new SafeReader();

    @TempDir
    Path tempDir;

    @Test
    void shouldParseAValidNumber() {
        assertThat(reader.parseIntOrDefault("42", 0)).isEqualTo(42);
        assertThat(reader.parseIntOrDefault(" 7 ", 0)).isEqualTo(7);
    }

    @Test
    void shouldUseTheDefaultValueForAnInvalidNumber() {
        assertThat(reader.parseIntOrDefault("abc", -1)).isEqualTo(-1);
        assertThat(reader.parseIntOrDefault("", 99)).isEqualTo(99);
    }

    @Test
    void shouldDivideNumbers() {
        assertThat(reader.divide(10, 2)).contains(5);
    }

    @Test
    void shouldReturnNothingWhenDividingByZero() {
        assertThat(reader.divide(10, 0)).isEmpty();
    }

    @Test
    void shouldReadTheFirstLineOfAFile() throws IOException {
        Path file = Files.writeString(tempDir.resolve("colors.txt"), "red\ngreen\nblue\n");

        assertThat(reader.firstLineOrDefault(file, "none")).isEqualTo("red");
    }

    @Test
    void shouldUseTheDefaultTextForAMissingFile() {
        Path missing = tempDir.resolve("missing.txt");

        assertThat(reader.firstLineOrDefault(missing, "none")).isEqualTo("none");
    }

    @Test
    void shouldUseTheDefaultTextForAnEmptyFile() throws IOException {
        Path empty = Files.writeString(tempDir.resolve("empty.txt"), "");

        assertThat(reader.firstLineOrDefault(empty, "none")).isEqualTo("none");
    }

    @Test
    void shouldReadTheWelcomeMessage() throws IOException {
        Path file = Files.writeString(tempDir.resolve("hello.txt"), "Welcome aboard!\n");

        assertThat(reader.welcomeMessage(file)).isEqualTo("Welcome aboard!");
    }

    @Test
    void shouldReportAMissingWelcomeFile() {
        Path missing = tempDir.resolve("hello.txt");

        assertThatThrownBy(() -> reader.welcomeMessage(missing))
                .isInstanceOf(MissingWelcomeFileException.class)
                .hasMessage("Welcome file not found: hello.txt")
                .hasCauseInstanceOf(IOException.class);
    }

    @Test
    void shouldCountTheLinesInAFile() throws IOException {
        Path file = Files.writeString(tempDir.resolve("lines.txt"), "one\ntwo\nthree\n");

        assertThat(reader.countLines(file)).isEqualTo(3);
    }

    @Test
    void shouldReportMinusOneWhenCountingTheLinesOfAMissingFile() {
        assertThat(reader.countLines(tempDir.resolve("missing.txt"))).isEqualTo(-1);
    }
}
