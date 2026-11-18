package com.serenitydojo.module01firststeps;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Exercise 1.3: write your first Java code in HelloWorldWriter.
 */
class HelloWorldWriterTest {

    private final HelloWorldWriter writer = new HelloWorldWriter();

    @Test
    void shouldSayHelloToTheWorld() {
        assertThat(writer.greeting()).isEqualTo("Hello, World!");
    }

    @Test
    void shouldGreetSomeoneByName() {
        assertThat(writer.greet("Sarah")).isEqualTo("Hello, Sarah!");
    }

    @Test
    void shouldGreetSomeoneElseByName() {
        assertThat(writer.greet("Java")).isEqualTo("Hello, Java!");
    }
}
