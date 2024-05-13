package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void ShouldWriteHelloWordToTheConsole () {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writerHelloWord();
    }

    @Test
    public void DeclaringNumericalVariables () {
        final int ageThisYear = 42;

        long startInGalaxy = 1000000000000L;

        double weight = 15.3;

        int ageNextYear = ageThisYear + 1;
        System.out.println("Age = "+ageNextYear);
        System.out.println("startNumber = "+startInGalaxy);
        System.out.println("weight = "+weight);
    }

    @Test
    public void workingWithStrings () {
        String firstName = " Sarah-Jane ";

        String upperCaseFirstName = firstName.replace("Sarah","Mary");
        System.out.println("Upper First Name = "+upperCaseFirstName);
        System.out.println("First Name trim = "+firstName.trim());
    }
}
