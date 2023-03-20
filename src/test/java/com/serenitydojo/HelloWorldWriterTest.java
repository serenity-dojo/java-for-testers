package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

   @Test
    public void shouldwriteHelloWorldToTheConsole() {
       HelloWorldWriter writer = new HelloWorldWriter();
       writer.writeHelloWorld();

   }

    @Test
    public void declaringNumericalVariables() {

        int ageThisYear = 42;

        int ageNextYear = ageThisYear + 3;

        System.out.println("age =" + ageNextYear);
    }


}
