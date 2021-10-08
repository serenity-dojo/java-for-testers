package com.serenitydojo.exceptions;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class WhenWorkingWithExceptions {
    WordCounter wordCounter = new WordCounter();
    @Test
    public void shouldCountWordsInAString(){
        int numberOfWords = wordCounter.numberOfWordsIn("some string");
        Assertions.assertThat(numberOfWords).isEqualTo(2);


    }
    @Test
    public void shouldReturnZeroForANullString(){
        Assertions.assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);

    }
    @Test
    public void shouldCountWordsInAFile() throws Exception {
        int numberOfWords = wordCounter.numberOfWordsInAfile("src/main/resources/hello.txt");
    }
    @Test(expected = FileHasNoWordException.class)
    public void shoulReportAnErrowIfThatFileDoesNotExist()throws Exception{
        int numberOfWords = wordCounter.numberOfWordsInAfile("file-that-does-not-exist.txt");
    }
    @Test(expected = FileHasNoWordException.class)
    public void shouldThrowMeaningfullExceptionIfThereAreNoWordsInAFile()throws Exception{
        int numberOfWords = wordCounter.numberOfWordsInAfile("src/main/resources/no_words.txt");
        Assertions.assertThat(numberOfWords).isEqualTo(0);


    }

}
