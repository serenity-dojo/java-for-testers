package com.serenitydojo.exceptions;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class WhenWorkingWithExceptions {
    WordCounter wordCounter = new WordCounter();
    @Test
    public void shouldCountWordsInAString(){
        int numbersOfWords = wordCounter.numbersOfWordsIn("word string");
        Assertions.assertThat(numbersOfWords).isEqualTo(2);

    }
    @Test
    public void shouldReturnZeroForAnullString(){
        Assertions.assertThat(wordCounter.numbersOfWordsIn(null)).isEqualTo(0);
    }
    @Test
    public void shouldReturnNumberOfWordsInAFile() throws IOException {
        int numbersOfWords = wordCounter.numbersOfWordsInAFile("src/main/resources/hello.txt");
    }
    @Test
    public void shouldReturnAnErrorIfTheFileDoesNotExist() throws IOException {
        int numbersOfWords = wordCounter.numbersOfWordsInAFile("a-file-that-does-not-exist");
        Assertions.assertThat(numbersOfWords).isEqualTo(0);
    }
}
