package com.serenitydojo.exceptions;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class WhenPlayingWithFileExceptionsTests {

	WordCounterUtils wordCounter = new WordCounterUtils();

	@Test
	public void shouldCountTheWordsInAString() {
	int numberOfWords = wordCounter.numberOfWordsIn("some string");
	
	assertThat(numberOfWords).isEqualTo(2);
	System.out.println("TC-01 - shouldCountTheWordsInAString() - Executed successfully.");
	}

	
	@Test
	public void shouldReturnZeroForANullString() {
	assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
	System.out.println("TC-02 - shouldReturnZeroForANullString() - Executed successfully.");
	}

	
	@Test
	public void shouldCountWordsInAFile() throws Exception {
	int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");
	
	assertThat(numberOfWords).isEqualTo(2);
	System.out.println("TC-03 - shouldCountWordsInAFile() - Executed successfully.");
	}

	
	@org.junit.Test(expected = FileHasNoWordException.class)
	public void shouldReportAnErrorIfTheFileDoesNotExist() throws Exception {
	int numberOfWords = wordCounter.numberOfWordsInFile("file-that-does-not-exist.txt");
	
	assertThat(numberOfWords).isEqualTo(0);
	System.out.println("TC-04 - shouldReportAnErrorIfTheFileDoesNotExist() - Executed successfully.");
	}

	
	@org.junit.Test(expected = FileHasNoWordException.class)
	public void shouldThrowMeaningfulExceptionIfThereAreNoWordsInTheFile() throws Exception {
	wordCounter.numberOfWordsInFile("src/main/resources/no_words.txt");
	System.out.println("TC-05 - shouldThrowMeaningfulExceptionIfThereAreNoWordsInTheFile() - Executed successfully.");
	}

}