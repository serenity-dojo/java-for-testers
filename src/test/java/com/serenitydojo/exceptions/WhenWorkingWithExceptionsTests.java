package com.serenitydojo.exceptions;
import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;
import org.testng.annotations.Test;

/**
 * 
 * - Handle a declared exception.
 * - Catch a declared exception and return a value.
 * - Catch a declared exception and throw a custom exception.
 * - Custom logic that throws a custom exception when no result is found.
 * - Using the Finally block to clean up
 * 
 */

public class WhenWorkingWithExceptionsTests {
	
    /**
     * Exercise 1 - Handling exceptions
     * Uncomment the code in this test and make it work.
     * You will need to modify the FileLoader class so that it correctly handles an IOException
     * 
     */
    @Test
    public void workingWithDeclaredExceptions() throws IOException {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.readHelloWorld()).isEqualTo("Hello World");
        System.out.println("TC-01 - workingWithDeclaredExceptions() - Executed successfully.");
    }

    
    /**
     * Exercise 2 - Catching exceptions
     *
     */
    @Test
    public void catchingExceptions() {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileContainsText("hello.txt","Hello World")).isTrue();
        System.out.println("TC-02 - catchingExceptions() - Executed successfully.");
    }

    
    /**
     * Exercise 3 - Throwing custom exceptions.
     * 
     */
    @org.junit.Test(expected = MissingWelcomeFileException.class)
    public void catchingCustomExceptionsWhenTheFileDoesNotExist() {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileHasText("does-not-exist.txt","Hello World")).isFalse();
        System.out.println("TC-04 - catchingExceptionsWhenTheFileDoesNotExist() - Executed successfully.");
    }

    
	/**
	 * Exercise 17 - This test method is implementation from - Bonus Live Videos :
	 * Advanced Java - Going Further With Enums section.
	 * 
	 */
	@Test
	public void shouldShowTheLengthOfAString() {
		StringProcessor stringProcessor = new StringProcessor();
		String result = stringProcessor.showLengthOf("some string");

		assertThat(result).isEqualTo("some string has a length of 11");
		System.out.println("TC-05 - shouldShowTheLengthOfAString() - Executed successfully.");
	}

    
	/**
	 * Exercise 17 - This test method is implementation from - Bonus Live Videos :
	 * Advanced Java - Going Further With Enums section.
	 * 
	 */
    @Test
    public void shouldShowZeroForNullStrings() {
    StringProcessor stringProcessor = new StringProcessor();
    String result = stringProcessor.showLengthOf(null);

    assertThat(result).isEqualTo("null has a length of 0");
    System.out.println("TC-06 - shouldShowTheLengthOfAString() - Executed successfully.");
    }

    
    @Test
    public void catchingExceptionsWhenTheFileDoesNotExist() {
        FileLoader fileLoader = new FileLoader();
        assertThat(fileLoader.fileContainsText("does-not-exist.txt","Hello World")).isFalse();
        System.out.println("TC-03 - catchingExceptionsWhenTheFileDoesNotExist() - Executed successfully.");
    }

    
    @org.junit.Test(expected = TestEnvironmentUnavailableException.class)
    public void shouldFindThePort() {
    StringProcessor stringProcessor = new StringProcessor();
    stringProcessor.getPortOf("A:https://www.google.com");
    System.out.println("TC-07 - shouldFindThePort() - Executed successfully.");
    }
    
}