package com.serenitydojo.module13exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

/**
 * Exercise 13.3: Catching exceptions.
 */
public class SafeReader {

    /**
     * Converts the text to an int, or returns the default value if the text is not a valid number.
     */
    public int parseIntOrDefault(String text, int defaultValue) {
//@@ solution
        try {
            return Integer.parseInt(text.trim());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
//@@ starter
        // TODO: catch the NumberFormatException thrown by Integer.parseInt()
        return Integer.parseInt(text.trim());
//@@ end
    }

    /**
     * Divides one number by another. Returns an empty Optional if the divisor is zero.
     */
    public Optional<Integer> divide(int dividend, int divisor) {
//@@ solution
        try {
            return Optional.of(dividend / divisor);
        } catch (ArithmeticException e) {
            return Optional.empty();
        }
//@@ starter
        // TODO: catch the ArithmeticException thrown when dividing by zero
        return Optional.of(dividend / divisor);
//@@ end
    }

    /**
     * Reads the first line of a file. Returns the default text if the file cannot be read.
     * <p>
     * Files.readAllLines() throws a <em>checked</em> IOException, so you must handle it.
     */
    public String firstLineOrDefault(Path file, String defaultText) {
//@@ solution
        try {
            List<String> lines = Files.readAllLines(file);
            return lines.isEmpty() ? defaultText : lines.get(0);
        } catch (IOException e) {
            return defaultText;
        }
//@@ starter
        // TODO: read the lines of the file, and handle the IOException
        return defaultText;
//@@ end
    }

    /**
     * Reads the welcome message from a file.
     * <p>
     * If the file cannot be read, throw a MissingWelcomeFileException with the message "Welcome file not found: "
     * followed by the file name, and the original IOException as the cause.
     */
    public String welcomeMessage(Path file) {
//@@ solution
        try {
            return Files.readString(file).trim();
        } catch (IOException e) {
            throw new MissingWelcomeFileException("Welcome file not found: " + file.getFileName(), e);
        }
//@@ starter
        // TODO: read the file, and wrap any IOException in a MissingWelcomeFileException
        return "";
//@@ end
    }

    /**
     * Counts the lines of a file, using try-with-resources so that the file is always closed.
     * Returns -1 if the file cannot be read.
     */
    public long countLines(Path file) {
//@@ solution
        try (var lines = Files.lines(file)) {
            return lines.count();
        } catch (IOException e) {
            return -1;
        }
//@@ starter
        // TODO: use try-with-resources around Files.lines(file), and handle the IOException
        return 0;
//@@ end
    }
}
