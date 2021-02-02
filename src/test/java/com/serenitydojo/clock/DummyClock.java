package com.serenitydojo.clock;

import java.time.LocalTime;

public class DummyClock implements CurrentTime {

    private final int hour;
    private final int minutes;

    public static DummyClock showing(int hour, int minutes) {
        return new DummyClock(hour,minutes);
    }

    public DummyClock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    @Override
    public int getHour() {
        return hour;
    }

    @Override
    public int getMinutes() {
        return minutes;
    }

    @Override
    public LocalTime asLocalTime() {
        return LocalTime.of(hour, minutes);
    }
}
