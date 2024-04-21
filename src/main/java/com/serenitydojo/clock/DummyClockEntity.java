package com.serenitydojo.clock;
import java.time.LocalTime;

public class DummyClockEntity implements ICurrentTime {

	private final int hour;
	private final int minutes;

	public static DummyClockEntity showing(int hour, int minutes) {
		return new DummyClockEntity(hour, minutes);
	}

	public DummyClockEntity(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	@Override
	public LocalTime asLocalTime() {
		return LocalTime.of(hour, minutes);
	}

}