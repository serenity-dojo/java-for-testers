package com.serenitydojo.clock;

import java.time.LocalTime;

public class TalkingClock {

    private final CurrentTime currentTime;

    public TalkingClock() {
        this(new CurrentLocalTime());
    }

    public TalkingClock(CurrentTime currentTime) {
        this.currentTime = currentTime;
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
