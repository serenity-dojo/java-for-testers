package com.serenitydojo.clock;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class WhenTellingTheTimeTests {

	@Test
	public void weShouldUseTheRealLocalTimeByDefault() {
	TalkingClock talkingClock = new TalkingClock();
	System.out.println(talkingClock.currentTimeInWords());
	System.out.println("\nTC-01 - weShouldUseTheRealLocalTimeByDefault() - Executed successfully.");
	}

	
	@Test
	public void midnight() {
    // GIVEN IT IS NOW 00:00:00
	TalkingClock talkingClock = TalkingClock.clockAt(0, 0);
	String timeNowIs = talkingClock.currentTimeInWords();

	assertThat(timeNowIs).isEqualTo("midnight");
	System.out.println("\nTC-02 -  midnight() - Executed successfully.");
	}

	
	@Test
	public void midday() {
	assertThat(TalkingClock.clockAt(12, 0).currentTimeInWords()).isEqualTo("midday");
	System.out.println("\nTC-03 -  midday() - Executed successfully.");
	}

}