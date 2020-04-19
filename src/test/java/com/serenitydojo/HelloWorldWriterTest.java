package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {

        final int ageThisYear = 42;

        int ageNextYear = ageThisYear + 1;

        double weight = 15.5;

        System.out.println("age = " + ageNextYear);
        System.out.println("weight = " + weight);
    }

    @Test
    public void workingWithStrings() {

        String firstName = " Sarah-Jane  ";

        String upperCaseFirstName = firstName.replace("Sarah","Mary");

        System.out.println(upperCaseFirstName.trim());
    }
}
