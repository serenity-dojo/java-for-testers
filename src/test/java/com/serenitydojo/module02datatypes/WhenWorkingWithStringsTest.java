package com.serenitydojo.module02datatypes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 2.4: Working with Strings.
 */
class WhenWorkingWithStringsTest {

    @Test
    void addingStringsTogether() {
        String colorA = "red";
        String colorB = "green";
        String colorC = "blue";

        // TODO: turn these values into a comma separated list, using the + operator
        String result = "";

        assertThat(result).isEqualTo("red,green,blue");
    }

    @Test
    void findingTheLengthOfAString() {
        // TODO: find the number of characters in the word "Java"
        int length = 0;

        assertThat(length).isEqualTo(4);
    }

    @Test
    void changingCase() {
        String bookTitle = "The Cat In The Hat";

        // TODO: convert the title to lower case
        String lowerCaseTitle = bookTitle;

        // TODO: convert the title to upper case
        String upperCaseTitle = bookTitle;

        assertThat(lowerCaseTitle).isEqualTo("the cat in the hat");
        assertThat(upperCaseTitle).isEqualTo("THE CAT IN THE HAT");
    }

    @Test
    void extractingPartOfAString() {
        String bookTitle = "The Cat In The Hat";

        // TODO: extract the word "Cat" using substring(start, end). The first character is at index 0.
        String word = "";

        // TODO: find the position of the word "Hat" using indexOf()
        int position = 0;

        assertThat(word).isEqualTo("Cat");
        assertThat(position).isEqualTo(15);
    }

    @Test
    void checkingWhatAStringContains() {
        String sentence = "The quick brown fox";

        // TODO: check whether the sentence contains the word "quick"
        boolean containsQuick = false;

        // TODO: check whether the sentence starts with "The"
        boolean startsWithThe = false;

        // TODO: check whether the sentence ends with "dog"
        boolean endsWithDog = true;

        assertThat(containsQuick).isTrue();
        assertThat(startsWithThe).isTrue();
        assertThat(endsWithDog).isFalse();
    }

    @Test
    void replacingText() {
        String shirt = "red shirt";

        // TODO: replace "red" with "orange"
        String updated = shirt;

        assertThat(updated).isEqualTo("orange shirt");
    }

    @Test
    void splittingAString() {
        String colors = "red,green,blue";

        // TODO: split the string at each comma, using split(",")
        String[] parts = {colors};

        assertThat(parts).containsExactly("red", "green", "blue");
    }

    @Test
    void joiningStrings() {
        // TODO: join these words with a dash, using String.join("-", ...)
        String joined = "";

        assertThat(joined).isEqualTo("one-two-three");
    }

    @Test
    void removingWhitespace() {
        String padded = "   padded   ";

        // TODO: remove the spaces from both ends using trim()
        String trimmed = padded;

        assertThat(trimmed).isEqualTo("padded");
    }

    @Test
    void comparingStrings() {
        String first = "java";
        String second = new String("java");

        // TODO: do the two strings have the same content? Use equals(), never ==
        boolean sameContent = false;

        // TODO: are they the same object in memory? Use ==
        boolean sameObject = true;

        // TODO: do they have the same content, ignoring upper/lower case? Compare "JAVA" with first
        boolean sameIgnoringCase = false;

        assertThat(sameContent).isTrue();
        assertThat(sameObject).isFalse();
        assertThat(sameIgnoringCase).isTrue();
    }

    @Test
    void buildingAStringWithAStringBuilder() {
        // TODO: use a StringBuilder to append "a", "b" and "c" and then convert it back with toString()
        String result = "";

        assertThat(result).isEqualTo("abc");
    }
}
