package com.serenitydojo.talkingclock;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class TalkingClock {

	private static final Map<Integer, String> HOUR_OF_DAY = new HashMap<>();
	private static final Map<LocalTime, String> TIMES_OF_DAY = Map.of(LocalTime.of(0, 0), "Midnight",LocalTime.of(12, 0), "Noon");

	static {
		HOUR_OF_DAY.put(1, "one");
		HOUR_OF_DAY.put(2, "two");
		HOUR_OF_DAY.put(3, "three");
		HOUR_OF_DAY.put(4, "four");
		HOUR_OF_DAY.put(5, "five");
		HOUR_OF_DAY.put(6, "six");
		HOUR_OF_DAY.put(7, "seven");
		HOUR_OF_DAY.put(8, "eight");
		HOUR_OF_DAY.put(9, "nine");
		HOUR_OF_DAY.put(10, "ten");
		HOUR_OF_DAY.put(11, "eleven");
		HOUR_OF_DAY.put(12, "twelve");
	}

	public String sayTheTimeFor(LocalTime currentTime) {
		if (currentTime.getMinute() == 0) {
			if (currentTime.getHour() == 0 || currentTime.getHour() == 12) {
				return TIMES_OF_DAY.get(currentTime);
			} else if (currentTime.getHour() > 12) {
				return HOUR_OF_DAY.get(currentTime.getHour() - 12) + " o'clock";
			} else {
				return HOUR_OF_DAY.get(currentTime.getHour()) + " o'clock";
			}
		} else {
			if (currentTime.getHour() > 12) {
				return HOUR_OF_DAY.get(currentTime.getHour() - 12) + " " + spokenMinutes(currentTime.getMinute());
			} else {
				return HOUR_OF_DAY.get(currentTime.getHour()) + " " + spokenMinutes(currentTime.getMinute());
			}
		}
	}

	public String spokenMinutes(int minutes) {
		return SpokenTime.minutesAsTextFor(minutes);
	}
}