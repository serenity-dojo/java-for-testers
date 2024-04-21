package com.serenitydojo.dataTypes;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldWritterTests {

	@Test
	public void shouldWriteHelloWorldToConsole() {
		HelloWorldWritter writterObj = new HelloWorldWritter();
		Assert.assertEquals(writterObj.writeHelloWorldMessage("Hello World!!.. from Java-8"),"Hello World!!.. from Java-8");
	}
	
	
	@Test
	public void workingWithNumericDataTypes() {
		final int ageThisYear=42;
		int ageNextYear=ageThisYear+1;
		double weightValue=15.4;
		System.out.println("\nAge of Next Year        : "+ageNextYear);
		System.out.println("\nVlaue of Floting points : "+weightValue);
	}
	
	
	@Test
	public void workingWithStrings() {
	String firstName=" Sara Wakkalio ";
	String upperName=firstName.replace("Sara","John").toUpperCase();
	System.out.println("\nValue of First Name   - "+firstName.trim());
	System.out.println("\nValue of updated Name - "+upperName.trim());
	}
	
}