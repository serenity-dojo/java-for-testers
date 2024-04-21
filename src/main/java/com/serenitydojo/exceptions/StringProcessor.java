package com.serenitydojo.exceptions;
import java.net.MalformedURLException;
import java.net.URL;

public class StringProcessor {

	public String showLengthOf(String input) {
		int length = (input == null) ? 0 : input.length();
		return input + " has a length of " + length;
	}

	public int getPortOf(String urlAsAString) {
		try {
			@SuppressWarnings("deprecation")
			URL url = new URL(urlAsAString);
			return url.getDefaultPort();
		} catch (MalformedURLException badlyWrittenException) {
			throw new TestEnvironmentUnavailableException("Exception : Port No Error!! ..");
		}
	}

}