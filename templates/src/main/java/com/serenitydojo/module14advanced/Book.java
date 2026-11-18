package com.serenitydojo.module14advanced;

/**
 * Exercise 14.5: Records.
 */
//@@ solution
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
//@@ starter
public class Book {
    // TODO: turn this class into a record with three components: String title, String author and int pages.
    //       Then add:
    //        - a compact constructor which throws an IllegalArgumentException if pages is zero or negative
    //        - an isLong() method which returns true if the book has more than 500 pages
}
//@@ end
