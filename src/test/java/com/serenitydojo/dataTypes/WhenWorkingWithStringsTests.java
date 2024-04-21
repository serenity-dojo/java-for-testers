package com.serenitydojo.dataTypes;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.testng.annotations.Test;

public class WhenWorkingWithStringsTests {

	/**
	 * 
	 * TODO: Convert the book title to lower case and assign it to the
	 * lowerCaseTitle variable
	 * 
	 */
	@Test
	public void convertToLowerCase() {
	String bookTitle = "The Cat In The Hat";
	String lowerCaseTitle = bookTitle.toLowerCase();
	System.out.println("\nActual String data : "+bookTitle);
	System.out.println("\nConverted book title to lower case String data : "+lowerCaseTitle);
		
	assertThat(lowerCaseTitle, equalTo("the cat in the hat"));
	}

	
	/**
	 * 
	 * TODO: Convert the book title to upper case and assign it to the
	 * upperCaseTitle variable
	 *
	 */
	@Test
	public void convertToUpperCase() {
	String bookTitle = "The Cat In The Hat";
	String upperCaseTitle = bookTitle.toUpperCase();
	System.out.println("\nActual String data : " + bookTitle);
	System.out.println("\nConverted book title to upper case String data : " + upperCaseTitle);

	assertThat(upperCaseTitle, equalTo("THE CAT IN THE HAT"));
	}

	
	/**
	 * 
	 * TODO: Trim the spaces before and after the title text
	 * 
	 */
	@Test
	public void trimExtraSpaces() {
	String bookTitle = "  The Cat In The Hat    ";
	String trimmedTitle = bookTitle.trim();
	System.out.println("\nActual String data : " + bookTitle);
	System.out.println("\nConverted book Trim extra space String data : " + trimmedTitle);

	assertThat(trimmedTitle, equalTo("The Cat In The Hat"));
	}

	
	/**
	 * 
	 * TODO: Find the number of characters in the string
	 * 
	 */
	@Test
	public void findTheLengthOfAString() {
	String bookTitle = "The Cat In The Hat";
	int length = bookTitle.length();
	System.out.println("\nActual String data : " + bookTitle);
	System.out.println("\nExpected length of a string : " + length);
	
	assertThat(length, equalTo(18));
	}


	/**
	 * 
	 * TODO: Replace the word "Cat" with "Dog
	 * 
	 */
	@Test
	public void replacingAText() {
	String bookTitle = "The Cat In The Hat";
	String updatedTitle = bookTitle.replace("Cat","Dog");
	System.out.println("\nActual String data : " + bookTitle);
	System.out.println("\nReplaced text in a string : " + updatedTitle);
	
	assertThat(updatedTitle, equalTo("The Dog In The Hat"));
	}

}