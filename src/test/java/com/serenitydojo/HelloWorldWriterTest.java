package com.serenitydojo;
import org.junit.Test;

public class HelloWorldWriterTest {
    @Test
    public void shouldWriterHelloWorldToConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables(){
        //Correct way to reassign values to a variable
        int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;

        long starsInTheGalaxy = 1000000000000L;
        double weight = 15.5;
        float height = 3.5F;

        System.out.println("age = " + age);
    }
}
