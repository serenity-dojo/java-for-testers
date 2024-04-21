package com.serenitydojo.talkingclock;

/**
 * Parses time represented in the "HH:mm" format,
 * so that the hour of the day
 * and a minute of the hour parts
 * can be easily retrieved.
 * 
 */

public class HourAndMinute {

	private final int hour;
	private final int minute;

	public HourAndMinute(String inputString) {
		String[] parts = inputString.split(":");
		this.hour = Integer.parseInt(parts[0]);
		this.minute = Integer.parseInt(parts[1]);
	}

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

}