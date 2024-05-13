package com.serenitydojo.exceptions;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.io.IOException;

public class WhenWorkingWithExceptions {

    WordCounter wordCounter = new WordCounter();
    @Test
    public void shouldCountsTheWordsInAString(){

    int numberOfWords = wordCounter.numberOfWordsIn("some string");
    assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForANullString(){
        assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
    }

    @Test
    public void shouldWordsCountsInAFile() throws Exception {

        int numberOfWords = wordCounter.numberOfWordsInFile("C:\\Users\\LENOVO\\IdeaProjects\\java-for-testers\\src\\main\\resource\\hello.txt");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test (expected =  FileNoHasWordException.class)
    public void shouldReportAnErrorIfTheFileDoesNotExist() throws Exception {

        int numberOfWords = wordCounter.numberOfWordsInFile("C:\\Users\\file-that-does-not-exist.txt");

        assertThat(numberOfWords).isEqualTo(0);
    }

    @Test (expected =  FileNoHasWordException.class)
    public void shouldThrowsMeaningfulExceptionIfTheIsThereIsNotWordInTheFile() throws Exception {

        int numberOfWords = wordCounter.numberOfWordsInFile("C:\\Users\\LENOVO\\IdeaProjects\\java-for-testers\\src\\main\\resource\\no_words.txt");

        assertThat(numberOfWords).isEqualTo(0);
    }
}
