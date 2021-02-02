package com.serenitydojo.clock;

import java.time.LocalTime;

public interface CurrentTime {
    int getHour();
    int getMinutes();
    LocalTime asLocalTime();
}
