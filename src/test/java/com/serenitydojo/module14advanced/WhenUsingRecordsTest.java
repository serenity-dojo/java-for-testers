package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Exercise 14.5a: Working with records.
 * <p>
 * Turn the Book class into a record, then remove the fail() lines and uncomment the code in these tests.
 */
class WhenUsingRecordsTest {

    @Test
    void aRecordHasAccessorMethodsForEachComponent() {
        Book book = new Book("Dune", "Frank Herbert", 412);

        assertThat(book.title()).isEqualTo("Dune");
        assertThat(book.author()).isEqualTo("Frank Herbert");
        assertThat(book.pages()).isEqualTo(412);
    }

    @Test
    void recordsWithTheSameValuesAreEqual() {
        Book first = new Book("Dune", "Frank Herbert", 412);
        Book second = new Book("Dune", "Frank Herbert", 412);
        Book different = new Book("Emma", "Jane Austen", 474);

        assertThat(first).isEqualTo(second).hasSameHashCodeAs(second);
        assertThat(first).isNotEqualTo(different);
    }

    @Test
    void aRecordHasAReadableToString() {
        Book book = new Book("Dune", "Frank Herbert", 412);

        assertThat(book).hasToString("Book[title=Dune, author=Frank Herbert, pages=412]");
    }

    @Test
    void aRecordCanHaveItsOwnMethods() {
        assertThat(new Book("War and Peace", "Leo Tolstoy", 1225).isLong()).isTrue();
        assertThat(new Book("Animal Farm", "George Orwell", 112).isLong()).isFalse();
    }

    @Test
    void aRecordCanValidateItsValues() {
        assertThatThrownBy(() -> new Book("Empty", "Nobody", 0))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void recordsCanBeDeclaredLocallyToo() {
        record Point(int x, int y) { }

        Point origin = new Point(0, 0);

        assertThat(origin.x()).isZero();
        assertThat(origin).isEqualTo(new Point(0, 0));
    }
}
