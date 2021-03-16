package com.serenitydojo.exceptions;

import java.io.IOException;

public class FileLoader {
    public String readHelloWorld() throws IOException {
        return "";//Files.readString(Paths.get("src/main/resources/hello.txt"));
    }

    public Boolean fileContainsText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        return null;// (Files.readString(Paths.get(path)).contains(expectedText));
    }

    public Boolean fileHasText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        return null;// (Files.readString(Paths.get(path)).contains(expectedText));
    }
}
