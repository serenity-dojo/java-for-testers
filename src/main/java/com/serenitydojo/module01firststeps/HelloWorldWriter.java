package com.serenitydojo.module01firststeps;

/**
 * Your very first Java class.
 */
public class HelloWorldWriter {

    public static void main(String[] args) {
        HelloWorldWriter writer = new HelloWorldWriter();
        System.out.println(writer.greeting());
        System.out.println(writer.greet("Java"));
    }

    /**
     * Exercise 1.3a: return the text "Hello, World!"
     */
    public String greeting() {
        return "Hello, World!";
    }

    /**
     * Exercise 1.3b: return a personalised greeting, e.g. greet("Sarah") returns "Hello, Sarah!"
     */
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
