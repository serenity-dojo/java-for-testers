package com.serenitydojo.talkingclock;
import java.util.HashMap;
import java.util.Map;

public class SpokenTime {

	private static final Map<Integer, String> DIGITS = new HashMap<>();
	private static final Map<Integer, String> TENS = new HashMap<>();
	
	static {
		DIGITS.put(1, "one");
		DIGITS.put(2, "two");
		DIGITS.put(3, "three");
		DIGITS.put(4, "four");
		DIGITS.put(5, "five");
		DIGITS.put(6, "six");
		DIGITS.put(7, "seven");
		DIGITS.put(8, "eight");
		DIGITS.put(9, "nine");
		DIGITS.put(10, "ten");
		DIGITS.put(11, "eleven");
		DIGITS.put(12, "twelve");
		DIGITS.put(13, "thirteen");
		DIGITS.put(14, "fourteen");
		DIGITS.put(15, "fifteen");
		DIGITS.put(16, "sixteen");
		DIGITS.put(17, "seventeen");
		DIGITS.put(18, "eighteen");
		DIGITS.put(19, "nineteen");
	}

	static {
		TENS.put(2, "twenty");
		TENS.put(3, "thirty");
		TENS.put(4, "forty");
		TENS.put(5, "fifty");
	}

	public static String minutesAsTextFor(int minutes) {
		if (DIGITS.containsKey(minutes)) {
			return DIGITS.get(minutes);
		} else {
			int tens = minutes / 10;
			String tensWord = TENS.get(tens);
			String digitsWord = DIGITS.getOrDefault(minutes - tens * 10, "");
			return (tensWord + " " + digitsWord).trim();
		}
	}

}