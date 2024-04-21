package com.serenitydojo.enums;
import static com.serenitydojo.enums.LevelEnum.HIGH;
import static com.serenitydojo.enums.LevelEnum.LOW;
import static com.serenitydojo.enums.LevelEnum.MEDIUM;
import static com.serenitydojo.enums.LevelEnum.REALLY_LOW;
import java.util.EnumMap;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * This test class covers - Bonus Live Videos : Advanced Java - Going Further
 * With Enums section implementation from 'java-for-testers-and-test-automation'
 * course of 'Serenity Dojo training and mentoring programme'
 * 
 */

public class WhenManipulatingEnumsTests {

	static EnumMap<LevelEnum,String> LEVEL_LABELS = new EnumMap<>(LevelEnum.class);
	static {
        LEVEL_LABELS.put(HIGH, "HIGH!");
        LEVEL_LABELS.put(MEDIUM, "MEDIUM!");
        LEVEL_LABELS.put(LOW, "LOW!");
        LEVEL_LABELS.put(REALLY_LOW, "REALLY LOW!");
    }

	@Test
	public void withConditionals() {
		String levelAsText = LEVEL_LABELS.get(HIGH);

		System.out.println(HIGH.toString());
		System.out.println(levelAsText);
		Assert.assertTrue(levelAsText != null && !levelAsText.isEmpty());
		System.out.println("\nTC-01 - withConditionals() - Executed successfully.");
	}

	
	@Test
	public void whenUsingEnumAttributes() {
		LadderEntity ladder = new LadderEntity(10);

		Assert.assertTrue(compareByHeightTo(ladder, 5));
		Assert.assertTrue(compareByHeightTo(HIGH, 3));
		System.out.println("\nTC-02 - whenUsingEnumAttributes() - Executed successfully.");
	}

	
	public boolean compareByHeightTo(IComparableByHeight thing, int minimumHeight) {
		boolean fgStatus = thing.isHighEnough(minimumHeight) ? true : false;
		if (fgStatus) {
			System.out.println("HIGH ENOUGH");
		} else {
			System.out.println("NOT HIGH ENOUGH!");
		}
		return fgStatus;
	}

}