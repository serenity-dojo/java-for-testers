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
//@@ solution
        String result = colorA + "," + colorB + "," + colorC;
//@@ starter
        String result = "";
//@@ end

        assertThat(result).isEqualTo("red,green,blue");
    }

    @Test
    void findingTheLengthOfAString() {
        // TODO: find the number of characters in the word "Java"
//@@ solution
        int length = "Java".length();
//@@ starter
        int length = 0;
//@@ end

        assertThat(length).isEqualTo(4);
    }

    @Test
    void changingCase() {
        String bookTitle = "The Cat In The Hat";

        // TODO: convert the title to lower case
//@@ solution
        String lowerCaseTitle = bookTitle.toLowerCase();
//@@ starter
        String lowerCaseTitle = bookTitle;
//@@ end

        // TODO: convert the title to upper case
//@@ solution
        String upperCaseTitle = bookTitle.toUpperCase();
//@@ starter
        String upperCaseTitle = bookTitle;
//@@ end

        assertThat(lowerCaseTitle).isEqualTo("the cat in the hat");
        assertThat(upperCaseTitle).isEqualTo("THE CAT IN THE HAT");
    }

    @Test
    void extractingPartOfAString() {
        String bookTitle = "The Cat In The Hat";

        // TODO: extract the word "Cat" using substring(start, end). The first character is at index 0.
//@@ solution
        String word = bookTitle.substring(4, 7);
//@@ starter
        String word = "";
//@@ end

        // TODO: find the position of the word "Hat" using indexOf()
//@@ solution
        int position = bookTitle.indexOf("Hat");
//@@ starter
        int position = 0;
//@@ end

        assertThat(word).isEqualTo("Cat");
        assertThat(position).isEqualTo(15);
    }

    @Test
    void checkingWhatAStringContains() {
        String sentence = "The quick brown fox";

        // TODO: check whether the sentence contains the word "quick"
//@@ solution
        boolean containsQuick = sentence.contains("quick");
//@@ starter
        boolean containsQuick = false;
//@@ end

        // TODO: check whether the sentence starts with "The"
//@@ solution
        boolean startsWithThe = sentence.startsWith("The");
//@@ starter
        boolean startsWithThe = false;
//@@ end

        // TODO: check whether the sentence ends with "dog"
//@@ solution
        boolean endsWithDog = sentence.endsWith("dog");
//@@ starter
        boolean endsWithDog = true;
//@@ end

        assertThat(containsQuick).isTrue();
        assertThat(startsWithThe).isTrue();
        assertThat(endsWithDog).isFalse();
    }

    @Test
    void replacingText() {
        String shirt = "red shirt";

        // TODO: replace "red" with "orange"
//@@ solution
        String updated = shirt.replace("red", "orange");
//@@ starter
        String updated = shirt;
//@@ end

        assertThat(updated).isEqualTo("orange shirt");
    }

    @Test
    void splittingAString() {
        String colors = "red,green,blue";

        // TODO: split the string at each comma, using split(",")
//@@ solution
        String[] parts = colors.split(",");
//@@ starter
        String[] parts = {colors};
//@@ end

        assertThat(parts).containsExactly("red", "green", "blue");
    }

    @Test
    void joiningStrings() {
        // TODO: join these words with a dash, using String.join("-", ...)
//@@ solution
        String joined = String.join("-", "one", "two", "three");
//@@ starter
        String joined = "";
//@@ end

        assertThat(joined).isEqualTo("one-two-three");
    }

    @Test
    void removingWhitespace() {
        String padded = "   padded   ";

        // TODO: remove the spaces from both ends using trim()
//@@ solution
        String trimmed = padded.trim();
//@@ starter
        String trimmed = padded;
//@@ end

        assertThat(trimmed).isEqualTo("padded");
    }

    @Test
    void comparingStrings() {
        String first = "java";
        String second = new String("java");

        // TODO: do the two strings have the same content? Use equals(), never ==
//@@ solution
        boolean sameContent = first.equals(second);
//@@ starter
        boolean sameContent = false;
//@@ end

        // TODO: are they the same object in memory? Use ==
//@@ solution
        boolean sameObject = first == second;
//@@ starter
        boolean sameObject = true;
//@@ end

        // TODO: do they have the same content, ignoring upper/lower case? Compare "JAVA" with first
//@@ solution
        boolean sameIgnoringCase = "JAVA".equalsIgnoreCase(first);
//@@ starter
        boolean sameIgnoringCase = false;
//@@ end

        assertThat(sameContent).isTrue();
        assertThat(sameObject).isFalse();
        assertThat(sameIgnoringCase).isTrue();
    }

    @Test
    void buildingAStringWithAStringBuilder() {
        // TODO: use a StringBuilder to append "a", "b" and "c" and then convert it back with toString()
//@@ solution
        StringBuilder builder = new StringBuilder();
        builder.append("a").append("b").append("c");
        String result = builder.toString();
//@@ starter
        String result = "";
//@@ end

        assertThat(result).isEqualTo("abc");
    }
}
