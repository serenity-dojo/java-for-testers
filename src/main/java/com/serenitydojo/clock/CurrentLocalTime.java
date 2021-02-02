package com.serenitydojo.clock;

import java.time.LocalTime;

public class CurrentLocalTime implements CurrentTime {
    @Override
    public int getHour() {
        return LocalTime.now().getHour();
    }

    @Override
    public int getMinutes() {
        return LocalTime.now().getMinute();
    }

    @Override
    public LocalTime asLocalTime() {
        return LocalTime.now();
    }
}
