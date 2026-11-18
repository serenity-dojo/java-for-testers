package com.serenitydojo.module14advanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 14.5a: Working with records.
 * <p>
 * Turn the Book class into a record, then remove the fail() lines and uncomment the code in these tests.
 */
class WhenUsingRecordsTest {

    @Test
    void aRecordHasAccessorMethodsForEachComponent() {
//@@ starter
        fail("TODO: turn Book into a record, then uncomment the code below");
//@@ end
//@@ starter-commented
        Book book = new Book("Dune", "Frank Herbert", 412);

        assertThat(book.title()).isEqualTo("Dune");
        assertThat(book.author()).isEqualTo("Frank Herbert");
        assertThat(book.pages()).isEqualTo(412);
//@@ end
    }

    @Test
    void recordsWithTheSameValuesAreEqual() {
//@@ starter
        fail("TODO: turn Book into a record, then uncomment the code below");
//@@ end
//@@ starter-commented
        Book first = new Book("Dune", "Frank Herbert", 412);
        Book second = new Book("Dune", "Frank Herbert", 412);
        Book different = new Book("Emma", "Jane Austen", 474);

        assertThat(first).isEqualTo(second).hasSameHashCodeAs(second);
        assertThat(first).isNotEqualTo(different);
//@@ end
    }

    @Test
    void aRecordHasAReadableToString() {
//@@ starter
        fail("TODO: turn Book into a record, then uncomment the code below");
//@@ end
//@@ starter-commented
        Book book = new Book("Dune", "Frank Herbert", 412);

        assertThat(book).hasToString("Book[title=Dune, author=Frank Herbert, pages=412]");
//@@ end
    }

    @Test
    void aRecordCanHaveItsOwnMethods() {
//@@ starter
        fail("TODO: turn Book into a record and add isLong(), then uncomment the code below");
//@@ end
//@@ starter-commented
        assertThat(new Book("War and Peace", "Leo Tolstoy", 1225).isLong()).isTrue();
        assertThat(new Book("Animal Farm", "George Orwell", 112).isLong()).isFalse();
//@@ end
    }

    @Test
    void aRecordCanValidateItsValues() {
//@@ starter
        fail("TODO: add a compact constructor to Book, then uncomment the code below");
//@@ end
//@@ starter-commented
        assertThatThrownBy(() -> new Book("Empty", "Nobody", 0))
                .isInstanceOf(IllegalArgumentException.class);
//@@ end
    }

    @Test
    void recordsCanBeDeclaredLocallyToo() {
        record Point(int x, int y) { }

        Point origin = new Point(0, 0);

        assertThat(origin.x()).isZero();
        assertThat(origin).isEqualTo(new Point(0, 0));
    }
}
