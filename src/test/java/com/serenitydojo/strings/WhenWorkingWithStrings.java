package com.serenitydojo.strings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithStrings {
    /**
     * Adding strings together
     */
    @Test
    public void addingStringsTogether() {

        var colorA = "red";
        var colorB = "green";
        var colorC = "blue";

        // TODO: turn these values into a comma separated list
        var result = colorA + "," + colorB + "," + colorC;

        assertThat(result).isEqualTo("red,green,blue");
    }

    /**
     * Take two strings (e.g. Duck, Orange) and return them in reverse order, separated by spaces
     */
    @Test
    public void reverseAPairOfStrings() {

        var result = reverse("Duck", "Orange");
        assertThat(result).isEqualTo("Orange Duck");

    }

    /**
     * Convert a list of words into capitalised form
     */
    @Test
    public void capitaliseWords() {

        var result = capitalise("RED", "green","BluE");
        assertThat(result).isEqualTo("Red Green Blue");
    }

    private String capitalise(String... words) {
        StringBuffer result = new StringBuffer();
        for(var word : words) {
            var upperCaseFirstLetter = word.substring(0,1).toUpperCase();
            var lowerCaseEnding = word.toLowerCase().substring(1);
            var capitalisedWord = upperCaseFirstLetter + lowerCaseEnding;
            result.append(capitalisedWord);
        }
        return result.toString();
    }

    @Test
    public void reverseAListOfStrings() {

    }

    private String reverse(String a, String b) {
        return b + " " + a;
    }
}
