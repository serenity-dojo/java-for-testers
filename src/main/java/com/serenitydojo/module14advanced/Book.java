package com.serenitydojo.module14advanced;

/**
 * Exercise 14.5: Records.
 */
public record Book(String title, String author, int pages) {

    /**
     * A compact constructor validates the values when a record is created.
     */
    public Book {
        if (pages <= 0) {
            throw new IllegalArgumentException("A book must have at least one page");
        }
    }

    public boolean isLong() {
        return pages > 500;
    }
}
