package com.serenitydojo.clock;

public class TalkingClock {

	private final ICurrentTime currentTime;

	public TalkingClock() {
		this(new CurrentLocalTime());
	}

	
	public TalkingClock(ICurrentTime currentTime) {
		this.currentTime = currentTime;
	}

	public static TalkingClock clockAt(int hours, int minutes) {
    return new TalkingClock(DummyClockEntity.showing(hours,minutes));
    }
	
	public String currentTimeInWords() {
	if ((currentTime.getHour() == 0) && (currentTime.getMinutes() == 0)) {
			return "midnight";
	}
	if ((currentTime.getHour() == 12) && (currentTime.getMinutes() == 0)) {
			return "midday";
	}
	return currentTime.asLocalTime().toString();
	}
	
}