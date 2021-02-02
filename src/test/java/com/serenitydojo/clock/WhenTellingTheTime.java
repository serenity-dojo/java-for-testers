package com.serenitydojo.clock;

import org.junit.Test;

import java.time.LocalTime;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenTellingTheTime {

    @Test
    public void weShouldUseTheRealLocalTimeByDefault() {
        TalkingClock talkingClock = new TalkingClock();
        System.out.println(talkingClock.currentTimeInWords());
    }

    @Test
    public void midnight() {
        // GIVEN IT IS NOW 00:00:00
        TalkingClock talkingClock = clockAt(0,0);

        String timeNowIs = talkingClock.currentTimeInWords();

        assertThat(timeNowIs).isEqualTo("midnight");
    }

    @Test
    public void midday() {
        TalkingClock clock = clockAt(12,0);

        assertThat(clock.currentTimeInWords()).isEqualTo("midday");
    }

    TalkingClock clockAt(int hours, int minutes) {
        return new TalkingClock(DummyClock.showing(hours,minutes));
    }
}
