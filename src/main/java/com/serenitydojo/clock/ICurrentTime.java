package com.serenitydojo.clock;
import java.time.LocalTime;

public interface ICurrentTime {

	int getHour();

	int getMinutes();

	LocalTime asLocalTime();

}