package com.serenitydojo.exceptions;
import static com.serenitydojo.exceptions.DataSetup.loadTestData;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhenWorkingWithClientDataExceptionsTests {

	@BeforeMethod
	public void setupTestData() {
	loadTestData();
	System.out.println("TC-01 - setupTestData() - Executed successfully.");
	}

	
	@Test
	public void basicExceptions() {
	int a = 1;
	int b = 2;
	
	assertThat(a + b).isEqualTo(3);
	System.out.println("TC-02 - basicExceptions() - Executed successfully.");
	}

}