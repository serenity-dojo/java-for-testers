package com.serenitydojo;

import org.junit.Test;

public class TestHelloWorldWriter {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
}

